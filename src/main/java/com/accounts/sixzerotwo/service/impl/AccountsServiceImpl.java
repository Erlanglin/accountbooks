package com.accounts.sixzerotwo.service.impl;

import java.util.List;

import com.accounts.sixzerotwo.enums.AccountsStateEnum;
import com.accounts.sixzerotwo.exception.AccountsException;
import com.accounts.sixzerotwo.exception.RepeatAccountsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accounts.sixzerotwo.dao.AccountsDao;
import com.accounts.sixzerotwo.dao.BossDao;
import com.accounts.sixzerotwo.dto.AccountsExecution;
import com.accounts.sixzerotwo.entity.Accounts;
import com.accounts.sixzerotwo.entity.Boss;
import com.accounts.sixzerotwo.exception.NoNumberException;
import com.accounts.sixzerotwo.service.BossService;

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

	@Override
	@Transactional
	/**
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	public AccountsExecution accounts(int bossId, int studentId) {
		try {
			// 减库存
			int update = bossDao.reduceNumber(bossId);
			if (update <= 0) {// 库存不足
				throw new NoNumberException("no number");
			} else {
				// 执行预约操作
				int insert = accountsDao.insertaccounts(bossId, studentId);
				if (insert <= 0) {// 重复预约
					throw new RepeatAccountsException("repeat appoint");
				} else {// 预约成功
					Accounts accounts = accountsDao.queryByKeyWithboss(bossId, studentId);
					return new AccountsExecution(bossId, AccountsStateEnum.SUCCESS, accounts);
				}
			}
		} catch (NoNumberException e1) {
			throw e1;
		} catch (RepeatAccountsException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 所有编译期异常转换为运行期异常
			throw new AccountsException("appoint inner error:" + e.getMessage());
		}
	}

}
