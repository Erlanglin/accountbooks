package com.accounts.sixzerotwo.dao;

import java.util.List;

import com.accounts.sixzerotwo.entity.Boss;
import org.apache.ibatis.annotations.Param;

public interface BossDao {

	/**
	 * 通过ID查询单本图书
	 * 
	 * @param id
	 * @return
	 */
	Boss queryById(int id);

	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Boss> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 减少馆藏数量
	 * 
	 * @param bossId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int reduceNumber(int bossId);

}
