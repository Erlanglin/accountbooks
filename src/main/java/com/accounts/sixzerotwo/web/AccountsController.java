package com.accounts.sixzerotwo.sixzerotwo.web;

import com.accounts.sixzerotwo.sixzerotwo.entity.Accounts;
import com.accounts.sixzerotwo.sixzerotwo.service.AccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/accounts") // url:/模块/资源/{id}/细分 /seckill/list
public class AccountsController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AccountsService accountsService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<Accounts> list = accountsService.getList();
		model.addAttribute("list", list);
		logger.info(String.valueOf(list));
		// list.jsp + model = ModelAndView
		return "accountsList";// WEB-INF/jsp/"list".jsp
	}

	@RequestMapping(value = "/{accountsId}/accountsDetail", method = RequestMethod.GET)
	private String detail(@PathVariable("accountsId") int accountsId, Model model) {
		if (accountsId < 0 ) {
			return "redirect:/accounts/accountsList";
		}
		Accounts accounts = accountsService.getById(accountsId);
		if (accounts == null) {
			return "forward:/accounts/accountsList";
		}
		model.addAttribute("accounts", accounts);
		return "accountsDetail";
	}

}
