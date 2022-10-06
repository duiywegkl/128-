package com.wsf.ssm.houd1.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 姓名
     */
    private String uName;

    /**
     * 类型（0员工）(1司机）（2管理员）
     */
    private Integer uType;

    /**
     * 上班班次
     */
    private Integer cId;

    /**
     * 下班班次
     */
    private Integer cId2;

    /**
     * 电话
     */
    private Long uPhone;

    /**
     * 地址
     */
    private String uAddress;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcId2() {
        return cId2;
    }

    public void setcId2(Integer cId2) {
        this.cId2 = cId2;
    }

    public Long getuPhone() {
        return uPhone;
    }

    public void setuPhone(Long uPhone) {
        this.uPhone = uPhone;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }
}