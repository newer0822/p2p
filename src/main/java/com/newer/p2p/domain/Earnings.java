package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户收益信息实体类
 */
public class Earnings implements Serializable {
    private static final long serialVersionUID = 5139962945803610745L;
    private Integer eid;//主键订单编号
    private Integer euid;//绑定用户id
    private Integer epid;//绑定投标表主键
    private  Integer eiid;//绑定投资信息主键
    private Date earnings_date;//收益信息
    private Double earnings_money;//收益金额
    private Double earnings_capital;//本金
    private Integer eby;//备用
    private  String eby1;//备用1

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getEuid() {
        return euid;
    }

    public void setEuid(Integer euid) {
        this.euid = euid;
    }

    public Integer getEpid() {
        return epid;
    }

    public void setEpid(Integer epid) {
        this.epid = epid;
    }

    public Integer getEiid() {
        return eiid;
    }

    public void setEiid(Integer eiid) {
        this.eiid = eiid;
    }

    public Date getEarnings_date() {
        return earnings_date;
    }

    public void setEarnings_date(Date earnings_date) {
        this.earnings_date = earnings_date;
    }

    public Double getEarnings_money() {
        return earnings_money;
    }

    public void setEarnings_money(Double earnings_money) {
        this.earnings_money = earnings_money;
    }

    public Double getEarnings_capital() {
        return earnings_capital;
    }

    public void setEarnings_capital(Double earnings_capital) {
        this.earnings_capital = earnings_capital;
    }

    public Integer getEby() {
        return eby;
    }

    public void setEby(Integer eby) {
        this.eby = eby;
    }

    public String getEby1() {
        return eby1;
    }

    public void setEby1(String eby1) {
        this.eby1 = eby1;
    }

    @Override
    public String toString() {
        return "Earnings{" +
                "eid=" + eid +
                ", euid=" + euid +
                ", epid=" + epid +
                ", eiid=" + eiid +
                ", earnings_date=" + earnings_date +
                ", earnings_money=" + earnings_money +
                ", earnings_capital=" + earnings_capital +
                ", eby=" + eby +
                ", eby1='" + eby1 + '\'' +
                '}';
    }
}
