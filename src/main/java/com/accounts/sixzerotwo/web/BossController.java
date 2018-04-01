package com.accounts.sixzerotwo.sixzerotwo.web;

import com.accounts.sixzerotwo.sixzerotwo.entity.Boss;
import com.accounts.sixzerotwo.sixzerotwo.service.BossService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

	@RequestMapping(value = "/{bossId}/bossDetail", method = RequestMethod.GET)
	private String detail(@PathVariable("bossId") int bossId, Model model) {
		if (bossId < 1 || bossId > 5) {
			return "redirect:/boss/list";
		}
		Boss boss = bossService.getById(bossId);
		System.out.println("=========="+boss);
		model.addAttribute("boss", boss);
		return "bossDetail";
	}

}
