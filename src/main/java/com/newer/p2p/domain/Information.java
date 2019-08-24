package com.newer.p2p.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 站内消息内容
 */
public class Information implements Serializable {
    private static final long serialVersionUID = -127448430215329054L;
    private Integer iid;//消息编号
    private Integer iuid;//绑定用户主键
    private Date msgdate;//消息时间
    private String msgtitle;//消息标题
    private String msg;//消息内容
    private  Integer mremark;//是否已读 0未读，1已读
    private Integer mby;//备用
    private  String mby1;//备用1

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getIuid() {
        return iuid;
    }

    public void setIuid(Integer iuid) {
        this.iuid = iuid;
    }

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }

    public String getMsgtitle() {
        return msgtitle;
    }

    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getMremark() {
        return mremark;
    }

    public void setMremark(Integer mremark) {
        this.mremark = mremark;
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
        return "Information{" +
                "iid=" + iid +
                ", iuid=" + iuid +
                ", msgdate=" + msgdate +
                ", msgtitle='" + msgtitle + '\'' +
                ", msg='" + msg + '\'' +
                ", mremark=" + mremark +
                ", mby=" + mby +
                ", mby1='" + mby1 + '\'' +
                '}';
    }
}
