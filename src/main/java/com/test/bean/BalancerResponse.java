package com.test.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "q")
public class BalancerResponse {
    private String host;
    private Integer pingTime;
    private String code;

    public BalancerResponse() {
    }

    public BalancerResponse(String host, Integer pingTime, String code) {
        this.host = host;
        this.pingTime = pingTime;
        this.code = code;
    }

    @XmlElement(name="h")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @XmlElement(name="pt")
    public Integer getPingTime() {
        return pingTime;
    }

    public void setPingTime(Integer pingTime) {
        this.pingTime = pingTime;
    }

    @XmlElement(name="c")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}