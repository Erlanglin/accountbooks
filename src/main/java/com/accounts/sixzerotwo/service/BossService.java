package com.accounts.sixzerotwo.service;

import java.util.List;

import com.accounts.sixzerotwo.dto.AccountsExecution;
import com.accounts.sixzerotwo.entity.Boss;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface BossService {

	/**
	 * 查询一本图书
	 * 
	 * @param bossId
	 * @return
	 */
	Boss getById(int bossId);

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<Boss> getList();

	/**
	 * 预约图书
	 * 
	 * @param bossId
	 * @param studentId
	 * @return
	 */
	AccountsExecution accounts(int bossId, int studentId);

}
