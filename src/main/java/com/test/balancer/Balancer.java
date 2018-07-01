package com.test.balancer;

import com.test.bean.BalancerResponse;
import com.test.bean.Host;
import com.test.bean.Rule;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Balancer {
    private static Balancer ourInstance = new Balancer();

    private ArrayList<Rule> rules;

    public static Balancer getInstance() {
        return ourInstance;
    }

    private Balancer() {
    }

    public void setRules(ArrayList<Rule> rules){
        this.rules = rules;
    }

    public BalancerResponse getBalancerResponse(String accountCode, String targetDevice, String pluginVersion) {

        if(rules == null){
            return null;
        }

        for (Rule rule : rules) {
            if(rule.getAccountCode().equals(accountCode)
                    && rule.getPluginVersion().equals(pluginVersion)
                    && rule.getTargetDevice().equals(targetDevice)){
                //
                return new BalancerResponse(getCluster(rule.getHosts()), rule.getPingTime(),  UUID.randomUUID().toString());
            }
        }
        return null;
    }

    private String getCluster(ArrayList<Host> hosts){
        //We simulate a real balancer using a rand for now
        int randLoad = ThreadLocalRandom.current().nextInt(0, hosts.size());

        return hosts.get(randLoad).getHost();

    }

}
