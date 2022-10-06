package com.wsf.ssm.houd1.bus.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Bus implements Serializable {
    private Integer id;

    /**
     * 车辆id
     */
    private Integer b_id;

    /**
     * 容量
     */
    private Integer b_seats;

    /**
     * 车牌号
     */
    private String b_code;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public Integer getB_seats() {
        return b_seats;
    }

    public void setB_seats(Integer b_seats) {
        this.b_seats = b_seats;
    }

    public String getB_code() {
        return b_code;
    }

    public void setB_code(String b_code) {
        this.b_code = b_code;
    }
}