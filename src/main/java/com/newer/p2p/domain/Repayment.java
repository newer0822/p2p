package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户还款信息表
 */
public class Repayment implements Serializable {
    private static final long serialVersionUID = 7437570206277401120L;
    private Integer rid;//主键
    private Integer ruid;//绑定用户主键
    private Integer rpid;//绑定产品主键
    private Date repayment_date;//到期还款日
    private Double principal;//本金
    private  Double accrual;//利息
    private Integer repayment_remark;//是否还清0，未，1逾期，2还清
    private Integer reby;//备用字段
    private String reby1;//备用字段1

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

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Date getRepayment_date() {
        return repayment_date;
    }

    public void setRepayment_date(Date repayment_date) {
        this.repayment_date = repayment_date;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getAccrual() {
        return accrual;
    }

    public void setAccrual(Double accrual) {
        this.accrual = accrual;
    }

    public Integer getRepayment_remark() {
        return repayment_remark;
    }

    public void setRepayment_remark(Integer repayment_remark) {
        this.repayment_remark = repayment_remark;
    }

    public Integer getReby() {
        return reby;
    }

    public void setReby(Integer reby) {
        this.reby = reby;
    }

    public String getReby1() {
        return reby1;
    }

    public void setReby1(String reby1) {
        this.reby1 = reby1;
    }

    @Override
    public String toString() {
        return "Repayment{" +
                "rid=" + rid +
                ", ruid=" + ruid +
                ", rpid=" + rpid +
                ", repayment_date=" + repayment_date +
                ", principal=" + principal +
                ", accrual=" + accrual +
                ", repayment_remark=" + repayment_remark +
                ", reby=" + reby +
                ", reby1='" + reby1 + '\'' +
                '}';
    }
}
