package com.wsf.ssm.houd1.summarize.model;

import java.util.Random;

public class overview {
    private Integer id;
    private Integer c_id;
    private String c_time;
    private String b_code;
    private String r_list;
    private Integer b_seats;
    private Integer cun_id;
    private String bus_load;
    private String u_name;
    private String u_phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_time() {
        return c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public String getB_code() {
        return b_code;
    }

    public void setB_code(String b_code) {
        this.b_code = b_code;
    }

    public String getR_list() {
        return r_list;
    }

    public void setR_list(String r_list) {
        this.r_list = r_list;
    }

    public Integer getB_seats() {
        return b_seats;
    }

    public void setB_seats(Integer b_seats) {
        this.b_seats = b_seats;
    }

    public Integer getCun_id() {
        return cun_id;
    }

    public void setCun_id(Integer cun_id) {
        this.cun_id = cun_id;
    }

    public String getBus_load() {
        return bus_load;
    }

    public void setBus_load(String bus_load) {
        this.bus_load = bus_load;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    @Override
    public String toString() {
        return "overview{" +
                "id=" + id +
                ", c_time='" + c_time + '\'' +
                ", b_code='" + b_code + '\'' +
                ", r_list='" + r_list + '\'' +
                ", bus_load='" + bus_load + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_phone='" + u_phone + '\'' +
                '}';
    }
}
