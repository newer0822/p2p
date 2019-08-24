package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 充值记录表
 */
public class Recharge implements Serializable {
    private static final long serialVersionUID = -2163203065767803269L;
    private Integer rid;//充值id
    private Integer ruid;//外键绑定用户主键
    private Double recharge_amount;//充值金额
    private Date rdate;//充值日期
    private Double rbalance;//充值后的余额，这个不一定需要
    private Integer rby;//备用
    private String rby1;//备用1

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRuid() {
        return ruid;
    }

    public void setRuid(Integer ruid) {
        this.ruid = ruid;
    }

    public Double getRecharge_amount() {
        return recharge_amount;
    }

    public void setRecharge_amount(Double recharge_amount) {
        this.recharge_amount = recharge_amount;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Double getRbalance() {
        return rbalance;
    }

    public void setRbalance(Double rbalance) {
        this.rbalance = rbalance;
    }

    public Integer getRby() {
        return rby;
    }

    public void setRby(Integer rby) {
        this.rby = rby;
    }

    public String getRby1() {
        return rby1;
    }

    public void setRby1(String rby1) {
        this.rby1 = rby1;
    }

    @Override
    public String toString() {
        return "Recharge{" +
                "rid=" + rid +
                ", ruid=" + ruid +
                ", recharge_amount=" + recharge_amount +
                ", rdate=" + rdate +
                ", rbalance=" + rbalance +
                ", rby=" + rby +
                ", rby1='" + rby1 + '\'' +
                '}';
    }
}
