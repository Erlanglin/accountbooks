package com.accounts.sixzerotwo.sixzerotwo.dao;

import com.accounts.sixzerotwo.sixzerotwo.entity.Boss;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BossDao {

	/**
	 * 通过ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	Boss queryById(int id);

	/**
	 * 查询所有用户
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Boss> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
