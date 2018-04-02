package com.accounts.sixzerotwo.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 预约图书实体    // Accounts(accountsId,bossId,consumersId,activityName,monetary,activityTime,updateTime)
 */

public class Accounts {

    private int accountsId;// 账单ID

    private int bossId;// 付款人ID

    private int consumersId;// 消费者ID

    private String activityName;// 活动名称

    private int monetary;// 消费金额

    private Date activityTime;// 活动时间

    private Timestamp updateTime;// 修改时间

    // 多对一的复合属性
    private Boss boss;// 图书实体

    public Accounts() {
    }

    public Accounts(int accountsId, int bossId, int consumersId, String activityName, int monetary, Date activityTime, Timestamp updateTime) {
        this.accountsId = accountsId;
        this.bossId = bossId;
        this.consumersId = consumersId;
        this.activityName = activityName;
        this.monetary = monetary;
        this.activityTime = activityTime;
        this.updateTime = updateTime;
    }

    public Accounts(int accountsId, int bossId, int consumersId, String activityName, int monetary, Date activityTime, Timestamp updateTime, Boss boss) {
        this.accountsId = accountsId;
        this.bossId = bossId;
        this.consumersId = consumersId;
        this.activityName = activityName;
        this.monetary = monetary;
        this.activityTime = activityTime;
        this.updateTime = updateTime;
        this.boss = boss;
    }

    public int getaccountsId() {
        return accountsId;
    }

    public void setaccountsId(int accountsId) {
        this.accountsId = accountsId;
    }

    public int getbossId() {
        return bossId;
    }

    public void setbossId(int bossId) {
        this.bossId = bossId;
    }

    public int getconsumersId() {
        return consumersId;
    }

    public void setconsumersId(int consumersId) {
        this.consumersId = consumersId;
    }

    public String getactivityName() {
        return activityName;
    }

    public void setactivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getMonetary() {
        return monetary;
    }

    public void setMonetary(int monetary) {
        this.monetary = monetary;
    }

    public Date getactivityTime() {
        return activityTime;
    }

    public void setactivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public Timestamp getupdateTime() {
        return updateTime;
    }

    public void setupdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "accounts [accountsId=" + accountsId + ", bossId=" + bossId + ", consumersId=" + consumersId + "activityName=" + activityName + ", monetary=" + monetary + ", activityTime=" + activityTime + ", updateTime=" + updateTime + "]";
    }

}
