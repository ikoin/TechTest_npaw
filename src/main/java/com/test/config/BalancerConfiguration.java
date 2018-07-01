package com.test.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.bean.Rule;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.ArrayList;

public class BalancerConfiguration extends Configuration {

    @NotEmpty
    private ArrayList<Rule> rules;

    @JsonProperty("balancer")
    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
    }
}
