package com.accounts.sixzerotwo.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 预约图书实体
 */

public class Accounts {

    private int accounts_id;// 账单ID

    private int boss_id;// 付款人ID

    private int consumers_id;// 消费者ID

    private String activity_name;// 活动名称

    private int monetary;// 消费金额

    private Date activity_time;// 活动时间

    private Timestamp update_time;// 修改时间

    // 多对一的复合属性
    private Boss boss;// 图书实体

    public Accounts() {
    }

    public Accounts(int accounts_id, int boss_id, int consumers_id, String activity_name, int monetary, Date activity_time, Timestamp update_time) {
        this.accounts_id = accounts_id;
        this.boss_id = boss_id;
        this.consumers_id = consumers_id;
        this.activity_name = activity_name;
        this.monetary = monetary;
        this.activity_time = activity_time;
        this.update_time = update_time;
    }

    public Accounts(int accounts_id, int boss_id, int consumers_id, String activity_name, int monetary, Date activity_time, Timestamp update_time, Boss boss) {
        this.accounts_id = accounts_id;
        this.boss_id = boss_id;
        this.consumers_id = consumers_id;
        this.activity_name = activity_name;
        this.monetary = monetary;
        this.activity_time = activity_time;
        this.update_time = update_time;
        this.boss = boss;
    }

    public int getAccounts_id() {
        return accounts_id;
    }

    public void setAccounts_id(int accounts_id) {
        this.accounts_id = accounts_id;
    }

    public int getBoss_id() {
        return boss_id;
    }

    public void setBoss_id(int boss_id) {
        this.boss_id = boss_id;
    }

    public int getConsumers_id() {
        return consumers_id;
    }

    public void setConsumers_id(int consumers_id) {
        this.consumers_id = consumers_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public int getMonetary() {
        return monetary;
    }

    public void setMonetary(int monetary) {
        this.monetary = monetary;
    }

    public Date getActivity_time() {
        return activity_time;
    }

    public void setActivity_time(Date activity_time) {
        this.activity_time = activity_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "accounts [accounts_id=" + accounts_id + ", boss_id=" + boss_id + ", consumers_id=" + consumers_id + "activity_name=" + activity_name + ", monetary=" + monetary + ", activity_time=" + activity_time + ", update_time=" + update_time + "]";
    }

}
