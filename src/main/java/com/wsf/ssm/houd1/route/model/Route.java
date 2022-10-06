package com.wsf.ssm.houd1.route.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Route implements Serializable {
    private  Integer id;
    /**
     * 路线id
     */
    private Integer r_id;

    /**
     * 路线
     */
    private String r_list;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_list() {
        return r_list;
    }

    public void setR_list(String r_list) {
        this.r_list = r_list;
    }
}