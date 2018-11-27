package com.sc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Redpack {
    /**
     * 
     */
    private Integer id;

    /**
     * 发红包用户
     */
    private String userid;

    /**
     * 红包金额
     */
    private BigDecimal amount;

    /**
     * 单个红包金额
     */
    private BigDecimal unitamount;

    /**
     * 红包个数
     */
    private Integer total;

    /**
     * 红包剩余个数
     */
    private Integer remain;

    /**
     * 发红包时间
     */
    private Date senddate;

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
     * 发红包用户
     * @return userId 发红包用户
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 发红包用户
     * @param userid 发红包用户
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 红包金额
     * @return amount 红包金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 红包金额
     * @param amount 红包金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 单个红包金额
     * @return unitAmount 单个红包金额
     */
    public BigDecimal getUnitamount() {
        return unitamount;
    }

    /**
     * 单个红包金额
     * @param unitamount 单个红包金额
     */
    public void setUnitamount(BigDecimal unitamount) {
        this.unitamount = unitamount;
    }

    /**
     * 红包个数
     * @return total 红包个数
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 红包个数
     * @param total 红包个数
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 红包剩余个数
     * @return remain 红包剩余个数
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * 红包剩余个数
     * @param remain 红包剩余个数
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * 发红包时间
     * @return sendDate 发红包时间
     */
    public Date getSenddate() {
        return senddate;
    }

    /**
     * 发红包时间
     * @param senddate 发红包时间
     */
    public void setSenddate(Date senddate) {
        this.senddate = senddate;
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