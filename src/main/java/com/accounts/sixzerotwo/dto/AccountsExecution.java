package com.accounts.sixzerotwo.sixzerotwo.dto;

import com.accounts.sixzerotwo.sixzerotwo.enums.AccountsStateEnum;
import com.accounts.sixzerotwo.sixzerotwo.entity.Accounts;

/**
 * 封装预约执行后结果
 */
public class AccountsExecution {

	// 图书ID
	private long bossId;

	// 秒杀预约结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 预约成功对象
	private Accounts accounts;

	public AccountsExecution() {
	}

	// 预约失败的构造器
	public AccountsExecution(int bossId, AccountsStateEnum stateEnum) {
		this.bossId = bossId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 预约成功的构造器
	public AccountsExecution(long bossId, AccountsStateEnum stateEnum, Accounts accounts) {
		this.bossId = bossId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.accounts = accounts;
	}

	public long getbossId() {
		return bossId;
	}

	public void setbossId(long bossId) {
		this.bossId = bossId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Accounts getaccounts() {
		return accounts;
	}

	public void setaccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "AccountsExecution [bossId=" + bossId + ", state=" + state + ", stateInfo=" + stateInfo + ", accounts="
				+ accounts + "]";
	}

}
