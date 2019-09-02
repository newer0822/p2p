package com.newer.p2p.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户投资信息表
 */
public class Investment implements Serializable {
    private static final long serialVersionUID = 5536794357867116266L;
    private Integer id;//主键编号
    private Integer ipid;//绑定产品表信息表
    private  Integer uiid;//外键绑定用户主键
    private Double Investment_money;//投资金额

    private Date Investment_date;//投资日期
    private String title;//产品标题
    private Double interest;//待还利息
    private Double annual_interest_rate;//借款年利率
    private Integer iby;//备用
    private  String iby1;//备用1

    public Investment() {
    }

    public Investment(Integer id, Integer ipid, Integer uiid, Double investment_money, Date investment_date, String title, Double interest, Double annual_interest_rate, Integer iby, String iby1) {
        this.id = id;
        this.ipid = ipid;
        this.uiid = uiid;
        Investment_money = investment_money;
        Investment_date = investment_date;
        this.title = title;
        this.interest = interest;
        this.annual_interest_rate = annual_interest_rate;
        this.iby = iby;
        this.iby1 = iby1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public void setAnnual_interest_rate(Double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public Integer getIby() {
        return iby;
    }

    public void setIby(Integer iby) {
        this.iby = iby;
    }

    public String getIby1() {
        return iby1;
    }

    public void setIby1(String iby1) {
        this.iby1 = iby1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIpid() {
        return ipid;
    }

    public void setIpid(Integer ipid) {
        this.ipid = ipid;
    }

    public Integer getUiid() {
        return uiid;
    }

    public void setUiid(Integer uiid) {
        this.uiid = uiid;
    }

    public Double getInvestment_money() {
        return Investment_money;
    }

    public void setInvestment_money(Double investment_money) {
        Investment_money = investment_money;
    }

    public Date getInvestment_date() {
        return Investment_date;
    }

    public void setInvestment_date(Date investment_date) {
        Investment_date = investment_date;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", ipid=" + ipid +
                ", uiid=" + uiid +
                ", Investment_money=" + Investment_money +
                ", Investment_date=" + Investment_date +
                '}';
    }
}
