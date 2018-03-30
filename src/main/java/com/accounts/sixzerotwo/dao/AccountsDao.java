package com.accounts.sixzerotwo.dao;

import org.apache.ibatis.annotations.Param;

import com.accounts.sixzerotwo.entity.Accounts;

public interface AccountsDao {

	/**
	 * 插入预约图书记录
	 * 
	 * @param bossId
	 * @param studentId
	 * @return 插入的行数
	 */
	int insertaccounts(@Param("bossId") long bossId, @Param("studentId") long studentId);

	/**
	 * 通过主键查询预约图书记录，并且携带图书实体
	 * 
	 * @param bossId
	 * @param studentId
	 * @return
	 */
	Accounts queryByKeyWithboss(@Param("bossId") long bossId, @Param("studentId") long studentId);

}
