package com.wsf.ssm.houd1.summarize.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class summarize implements Serializable {

    private Integer[][] route_stats;

    private Integer[] usage_stats;

    private String overview;

    private static final long serialVersionUID = 1L;


    public Integer[][] getRoute_stats() {
        return route_stats;
    }

    public void setRoute_stats(Integer[][] route_stats) {
        this.route_stats = route_stats;
    }

    public Integer[] getUsage_stats() {
        return usage_stats;
    }

    public void setUsage_stats(Integer[] usage_stats) {
        this.usage_stats = usage_stats;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(List<overview> overview) {
        this.overview = JSON.toJSONString(overview);
    }

    @Override
    public String toString() {
        return "summarize{" +
                "route_stats=" + Arrays.toString(route_stats) +
                ", usage_stats=" + Arrays.toString(usage_stats) +
                ", overview='" + overview + '\'' +
                '}';
    }
}
