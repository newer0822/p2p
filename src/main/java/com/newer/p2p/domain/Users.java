package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类用户表
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 8494230457374666839L;
    private Integer uid;//主键id
    private String username;//用户名
    private String pwd;//密码
    private String paypassword;//支付密码
    private String email;//邮箱
    private String phone;//手机号码
    private Date logindate;//上次登录时间
    private Date redate;//注册时间
   private Integer uremark;//标记0锁定 1正常
    private Double balance;//余额
    private Integer uby;//备用1
    private  String uby1;//备用2

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Date getRedate() {
        return redate;
    }

    public void setRedate(Date redate) {
        this.redate = redate;
    }

    public Integer getUremark() {
        return uremark;
    }

    public void setUremark(Integer uremark) {
        this.uremark = uremark;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getUby() {
        return uby;
    }

    public void setUby(Integer uby) {
        this.uby = uby;
    }

    public String getUby1() {
        return uby1;
    }

    public void setUby1(String uby1) {
        this.uby1 = uby1;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", paypassword='" + paypassword + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", logindate=" + logindate +
                ", redate=" + redate +
                ", uremark=" + uremark +
                ", balance=" + balance +
                ", uby=" + uby +
                ", uby1='" + uby1 + '\'' +
                '}';
    }
}
