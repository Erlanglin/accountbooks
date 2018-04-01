package com.accounts.sixzerotwo.sixzerotwo.dao;

import com.accounts.sixzerotwo.sixzerotwo.entity.Accounts;
import org.apache.ibatis.annotations.Param;

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
	 * 查询所有用户
	 *
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Accounts> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
