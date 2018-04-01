package com.accounts.sixzerotwo.sixzerotwo.service.impl;

import com.accounts.sixzerotwo.sixzerotwo.dao.AccountsDao;
import com.accounts.sixzerotwo.sixzerotwo.entity.Accounts;
import com.accounts.sixzerotwo.sixzerotwo.service.AccountsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

	// 注入Service依赖
	@Autowired
	private AccountsDao accountsDao;


	@Override
	public Accounts getById(int accountsId) {
		return accountsDao.queryById(accountsId);
	}

	@Override
	public List<Accounts> getList() {
		return accountsDao.queryAll(0, 1000);
	}
}