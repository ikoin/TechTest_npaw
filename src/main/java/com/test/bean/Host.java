package com.test.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Host {
    private String host;
    private int percentageLoad;

    public Host() {
    }

    public Host(String host, int percentageLoad) {
        this.host = host;
        this.percentageLoad = percentageLoad;
    }
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("load")
    public int getPercentageLoad() {
        return percentageLoad;
    }

    public void setPercentageLoad(int percentageLoad) {
        this.percentageLoad = percentageLoad;
    }
}
