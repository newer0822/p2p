package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 投标产品信息表
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1168409379110560356L;
    private  Integer pid;//标的id
    private   Integer puid;//谁发布的标
    private Integer p_uids;//用来确定是哪些用户参与了
    private String title;//产品标题
    private  String synopsis;//借款用途说明
    private  Double borrowing_balance;//借款金额
    private Double Payment_method;//等额本息/等额本金
    private Double annual_interest_rate;//借款年利率
    private Double residue_money;//产品剩余可投金额
    private  Double product_plan;//募集进度 百分比
    private Integer pro_remark;//0,拒绝，1，审核通过
    private Integer deadline;//借款期限 月份
    private Integer product_status;//产品状态0，未满标，1已满标，2已放款
    private Integer recommend;//是否推荐1推荐，其他为普通
    private Date starttime;//开始日期
    private Date endtime;//结束日期
    private Integer pby;//备用
    private  String pby1;//备用1

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public Integer getP_uids() {
        return p_uids;
    }

    public void setP_uids(Integer p_uids) {
        this.p_uids = p_uids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Double getBorrowing_balance() {
        return borrowing_balance;
    }

    public void setBorrowing_balance(Double borrowing_balance) {
        this.borrowing_balance = borrowing_balance;
    }

    public Double getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(Double payment_method) {
        Payment_method = payment_method;
    }

    public Double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public void setAnnual_interest_rate(Double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public Double getResidue_money() {
        return residue_money;
    }

    public void setResidue_money(Double residue_money) {
        this.residue_money = residue_money;
    }

    public Double getProduct_plan() {
        return product_plan;
    }

    public void setProduct_plan(Double product_plan) {
        this.product_plan = product_plan;
    }

    public Integer getPro_remark() {
        return pro_remark;
    }

    public void setPro_remark(Integer pro_remark) {
        this.pro_remark = pro_remark;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Integer getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Integer product_status) {
        this.product_status = product_status;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getPby() {
        return pby;
    }

    public void setPby(Integer pby) {
        this.pby = pby;
    }

    public String getPby1() {
        return pby1;
    }

    public void setPby1(String pby1) {
        this.pby1 = pby1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", puid=" + puid +
                ", p_uids=" + p_uids +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", borrowing_balance=" + borrowing_balance +
                ", Payment_method=" + Payment_method +
                ", annual_interest_rate=" + annual_interest_rate +
                ", residue_money=" + residue_money +
                ", product_plan=" + product_plan +
                ", pro_remark=" + pro_remark +
                ", deadline=" + deadline +
                ", product_status=" + product_status +
                ", recommend=" + recommend +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", pby=" + pby +
                ", pby1='" + pby1 + '\'' +
                '}';
    }
}
