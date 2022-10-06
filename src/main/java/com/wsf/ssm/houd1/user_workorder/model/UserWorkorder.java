package com.wsf.ssm.houd1.user_workorder.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class UserWorkorder implements Serializable {
    /**
     * 工单id
     */
    private Integer w_id;

    /**
     * 工单类型（0管理员）(1员工）（2司机）
     */
    private Integer w_type;

    /**
     * 用户id
     */
    private Integer u_id;

    /**
     * 申请地址
     */
    private String user_comm;

    /**
     * 是否通过（0正在审批1通过2驳回)
     */
    private Byte is_passed;

    /**
     * 管理员驳回意见
     */
    private String admin_comm;

    /**
     * 工单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date w_date;

    private static final long serialVersionu_id = 1L;

    public Integer getw_id() {
        return w_id;
    }

    public void setw_id(Integer w_id) {
        this.w_id = w_id;
    }

    public Integer getw_type() {
        return w_type;
    }

    public void setw_type(Integer w_type) {
        this.w_type = w_type;
    }

    public Integer getu_id() {
        return u_id;
    }

    public void setu_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getuser_comm() {
        return user_comm;
    }

    public void setuser_comm(String user_comm) {
        this.user_comm = user_comm;
    }

    public Byte getis_passed() {
        return is_passed;
    }

    public void setis_passed(Byte is_passed) {
        this.is_passed = is_passed;
    }

    public String getadmin_comm() {
        return admin_comm;
    }

    public void setadmin_comm(String admin_comm) {
        this.admin_comm = admin_comm;
    }

    public Date getw_date() {
        return w_date;
    }

    public void setw_date(Date w_date) {
        this.w_date = w_date;
    }
}