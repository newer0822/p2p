package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户提现信息表
 */
public class Withdraw_deposit implements Serializable {
    private static final long serialVersionUID = 335618786435820416L;
    private Integer wid;//提现编号
    private Integer wuid;//绑定用户主键
    private String bname;//银行卡号
    private Date withdraw_date;//提现时间
    private Double withdraw_money;//提现金额
    private  Integer wby;//备用
    private  String wby1;//备用1

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getWuid() {
        return wuid;
    }

    public void setWuid(Integer wuid) {
        this.wuid = wuid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getWithdraw_date() {
        return withdraw_date;
    }

    public void setWithdraw_date(Date withdraw_date) {
        this.withdraw_date = withdraw_date;
    }

    public Double getWithdraw_money() {
        return withdraw_money;
    }

    public void setWithdraw_money(Double withdraw_money) {
        this.withdraw_money = withdraw_money;
    }

    public Integer getWby() {
        return wby;
    }

    public void setWby(Integer wby) {
        this.wby = wby;
    }

    public String getWby1() {
        return wby1;
    }

    public void setWby1(String wby1) {
        this.wby1 = wby1;
    }

    @Override
    public String toString() {
        return "Withdraw_deposit{" +
                "wid=" + wid +
                ", wuid=" + wuid +
                ", bname='" + bname + '\'' +
                ", withdraw_date=" + withdraw_date +
                ", withdraw_money=" + withdraw_money +
                ", wby=" + wby +
                ", wby1='" + wby1 + '\'' +
                '}';
    }
}
