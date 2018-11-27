package com.sc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRedpack {
    /**
     * 
     */
    private Integer id;

    /**
     * 抢红包用户
     */
    private String userid;

    /**
     * 发红包记录id
     */
    private Integer redpackid;

    /**
     * 抢的红包金额
     */
    private BigDecimal amount;

    /**
     * 抢红包时间
     */
    private Date grabdate;

    /**
     * 版本控制，扩展乐观锁使用
     */
    private Integer version;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 抢红包用户
     * @return userId 抢红包用户
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 抢红包用户
     * @param userid 抢红包用户
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 发红包记录id
     * @return redpackId 发红包记录id
     */
    public Integer getRedpackid() {
        return redpackid;
    }

    /**
     * 发红包记录id
     * @param redpackid 发红包记录id
     */
    public void setRedpackid(Integer redpackid) {
        this.redpackid = redpackid;
    }

    /**
     * 抢的红包金额
     * @return amount 抢的红包金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 抢的红包金额
     * @param amount 抢的红包金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 抢红包时间
     * @return grabDate 抢红包时间
     */
    public Date getGrabdate() {
        return grabdate;
    }

    /**
     * 抢红包时间
     * @param grabdate 抢红包时间
     */
    public void setGrabdate(Date grabdate) {
        this.grabdate = grabdate;
    }

    /**
     * 版本控制，扩展乐观锁使用
     * @return version 版本控制，扩展乐观锁使用
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本控制，扩展乐观锁使用
     * @param version 版本控制，扩展乐观锁使用
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}