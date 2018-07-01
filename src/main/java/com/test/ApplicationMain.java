package com.test;

import com.test.balancer.Balancer;
import com.test.config.BalancerConfiguration;
import com.test.heatlhcheck.TemplateHealthCheck;
import com.test.resources.ApplicationResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ApplicationMain extends Application<BalancerConfiguration> {
    public static void main(String[] args) throws Exception {
        new ApplicationMain().run(args);
    }

    @Override
    public String getName() {
        return "Tech Test";
    }

    @Override
    public void initialize(Bootstrap<BalancerConfiguration> bootstrap) {

    }

    @Override
    public void run(BalancerConfiguration balancerConfiguration, Environment environment) {

        Balancer.getInstance().setRules(balancerConfiguration.getRules());

        ApplicationResource resource = new ApplicationResource();

        TemplateHealthCheck healthCheck = new TemplateHealthCheck();
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
