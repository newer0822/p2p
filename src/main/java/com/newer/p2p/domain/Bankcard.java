package com.newer.p2p.domain;

import java.io.Serializable;

/**
 * 实体类银行卡
 */
public class Bankcard implements Serializable {
    private static final long serialVersionUID = 7298044262122336562L;
    private Integer bid;//银行卡id
    private  Integer buid;//用户主键id
    private  String bankname;//开户行
    private  String bankid;//银行卡号
    private  Integer bby;//备用1
    private String bby1;//备用2

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getBuid() {
        return buid;
    }

    public void setBuid(Integer buid) {
        this.buid = buid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public Integer getBby() {
        return bby;
    }

    public void setBby(Integer bby) {
        this.bby = bby;
    }

    public String getBby1() {
        return bby1;
    }

    public void setBby1(String bby1) {
        this.bby1 = bby1;
    }

    @Override
    public String toString() {
        return "Bankcard{" +
                "bid=" + bid +
                ", buid=" + buid +
                ", bankname='" + bankname + '\'' +
                ", bankid='" + bankid + '\'' +
                ", bby=" + bby +
                ", bby1='" + bby1 + '\'' +
                '}';
    }
}
