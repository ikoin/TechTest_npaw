package com.test.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Rule {
    private String accountCode;
    private String targetDevice;
    private String pluginVersion;
    private Integer pingTime;
    private ArrayList<Host> hosts;

    public Rule() {
    }

    public Rule(String accountCode, String targetDevice, String pluginVersion, Integer pingTime, ArrayList<Host> hosts) {
        this.accountCode = accountCode;
        this.targetDevice = targetDevice;
        this.pluginVersion = pluginVersion;
        this.pingTime = pingTime;
        this.hosts = hosts;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getTargetDevice() {
        return targetDevice;
    }

    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public Integer getPingTime() {
        return pingTime;
    }

    public void setPingTime(Integer pingTime) {
        this.pingTime = pingTime;
    }

    @JsonProperty("hosts")
    public ArrayList<Host> getHosts() {
        return hosts;
    }

    public void setHost(ArrayList<Host> hosts) {
        this.hosts = hosts;
    }
}
