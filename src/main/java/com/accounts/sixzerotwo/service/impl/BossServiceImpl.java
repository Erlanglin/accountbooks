package com.accounts.sixzerotwo.service.impl;

import com.accounts.sixzerotwo.dao.AccountsDao;
import com.accounts.sixzerotwo.dao.BossDao;
import com.accounts.sixzerotwo.entity.Boss;
import com.accounts.sixzerotwo.service.BossService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BossServiceImpl implements BossService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private BossDao bossDao;

	@Autowired
	private AccountsDao accountsDao;


	@Override
	public Boss getById(int bossId) {
		return bossDao.queryById(bossId);
	}

	@Override
	public List<Boss> getList() {

		return bossDao.queryAll(0, 1000);
	}

}
