package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户详细表，主要用来存储用户的财产信息及实名认证信息
 */
public class Minute implements Serializable {
    private static final long serialVersionUID = 4777032161618738870L;
    private Integer mid;//主键id
    private Integer muid;//绑定用户表主键id
    private String realname;//实名认证
    private  String idcard;//身份证号码
    private String useraddress;//用户住址
    private Date birthday;//出生日期
    private String sex;//性别
    private String education;//学历
    private String isMarriage;//婚否？
    private Double income;//月收入
    private String car;//车产信息
    private String hours;//房产信息
    private String job;//工作岗位
    private Double Credit_Score;//信用分
    private  Integer mby;//备用
    private String mby1;//备用1

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMuid() {
        return muid;
    }

    public void setMuid(Integer muid) {
        this.muid = muid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIsMarriage() {
        return isMarriage;
    }

    public void setIsMarriage(String isMarriage) {
        this.isMarriage = isMarriage;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getCredit_Score() {
        return Credit_Score;
    }

    public void setCredit_Score(Double credit_Score) {
        Credit_Score = credit_Score;
    }

    public Integer getMby() {
        return mby;
    }

    public void setMby(Integer mby) {
        this.mby = mby;
    }

    public String getMby1() {
        return mby1;
    }

    public void setMby1(String mby1) {
        this.mby1 = mby1;
    }

    @Override
    public String toString() {
        return "Minute{" +
                "mid=" + mid +
                ", muid=" + muid +
                ", realname='" + realname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", isMarriage='" + isMarriage + '\'' +
                ", income=" + income +
                ", car='" + car + '\'' +
                ", hours='" + hours + '\'' +
                ", job='" + job + '\'' +
                ", Credit_Score=" + Credit_Score +
                ", mby=" + mby +
                ", mby1='" + mby1 + '\'' +
                '}';
    }
}
