package com.accounts.sixzerotwo.service;

import com.accounts.sixzerotwo.entity.Accounts;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface AccountsService {

	/**
	 * 查询单个账单
	 * 
	 * @param
	 * @return
	 */
	Accounts getById(int accountsId);

	/**
	 * 查询所有账单
	 * 
	 * @return
	 */
	List<Accounts> getList();

	/**
	 * 插入账单
	 *
	 * @return
	 */
	int insert(Accounts accounts);


}
