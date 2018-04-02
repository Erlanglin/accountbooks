package com.accounts.sixzerotwo.dao;

import org.apache.ibatis.annotations.Param;

import com.accounts.sixzerotwo.entity.Accounts;

import java.util.List;

public interface AccountsDao {

	/**
	 * 通过accountsId查询
	 *
	 * @param accountsId
	 * @return
	 */
	Accounts queryById(int accountsId);

	/**
	 * 查询所有账单
	 *
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Accounts> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 更新账单
	 *
	 * @param accounts
	 * @return int 更新记录
	 */
	int insert(Accounts accounts);

}
