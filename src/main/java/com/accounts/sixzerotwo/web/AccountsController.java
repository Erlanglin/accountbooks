package com.accounts.sixzerotwo.web;

import java.util.List;

import com.accounts.sixzerotwo.dto.AccountsExecution;
import com.accounts.sixzerotwo.dto.Result;
import com.accounts.sixzerotwo.entity.Boss;
import com.accounts.sixzerotwo.enums.AccountsStateEnum;
import com.accounts.sixzerotwo.exception.NoNumberException;
import com.accounts.sixzerotwo.exception.RepeatAccountsException;
import com.accounts.sixzerotwo.service.BossService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/boss") // url:/模块/资源/{id}/细分 /seckill/list
public class BossController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BossService bossService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<Boss> list = bossService.getList();
		model.addAttribute("list", list);
		logger.info(String.valueOf(list));
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}

	@RequestMapping(value = "/{bossId}/detail", method = RequestMethod.GET)
	private String detail(@PathVariable("bossId") int bossId, Model model) {
		if (bossId == 0) {
			return "redirect:/boss/list";
		}
		Boss boss = bossService.getById(bossId);
		if (boss == null) {
			return "forward:/boss/list";
		}
		model.addAttribute("boss", boss);
		return "detail";
	}

	// ajax json
	@RequestMapping(value = "/{bossId}/account", method = RequestMethod.POST, produces = {
			"application/json; charset=utf-8" })
	@ResponseBody
	private Result<AccountsExecution> appoint(@PathVariable("bossId") int bossId, @RequestParam("studentId") int studentId) {
		if (studentId == 0) {
			return new Result<AccountsExecution>(false, "学号不能为空");
		}
		AccountsExecution execution = null;
		try {
			execution = bossService.accounts(bossId, studentId);
		} catch (NoNumberException e1) {
			execution = new AccountsExecution(bossId, AccountsStateEnum.NO_NUMBER);
		} catch (RepeatAccountsException e2) {
			execution = new AccountsExecution(bossId, AccountsStateEnum.REPEAT_APPOINT);
		} catch (Exception e) {
			execution = new AccountsExecution(bossId, AccountsStateEnum.INNER_ERROR);
		}
		return new Result<AccountsExecution>(true, execution);
	}

}
