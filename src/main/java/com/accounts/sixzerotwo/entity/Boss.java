package com.accounts.sixzerotwo.sixzerotwo.entity;

import java.sql.Timestamp;

/**
 * Boss实体
 */
public class Boss {

	private int bossId;// BossID

	private String name;// Boss名字

	private int accunts;// 账单

	private String remarks;// 消费备注

	private Timestamp updateTime;// 更新时间

	public Boss() {
	}

	public Boss(int bossId, String name, int accunts, String remarks, Timestamp updateTime) {
		this.bossId = bossId;
		this.name = name;
		this.accunts = accunts;
		this.remarks = remarks;
		this.updateTime = updateTime;
	}

	public int getBossId() {
		return bossId;
	}

	public void setBossId(int bossId) {
		this.bossId = bossId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccunts() {
		return accunts;
	}

	public void setAccunts(int accunts) {
		this.accunts = accunts;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "boss [bossId=" + bossId + ", name=" + name + ", accunts=" + accunts + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
	}


}
