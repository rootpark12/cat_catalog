package com.mvc.cat.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.cat.dto.CatDTO;
import com.mvc.cat.service.CatService;

@Controller
public class HomeController {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired CatService catservice;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("리스트 출력");
		ArrayList<CatDTO> list = catservice.list();
		model.addAttribute("size",list.size());
		model.addAttribute("list",list);	
		return "main";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Model model,@RequestParam HashMap<String, String> params) {
		logger.info("add요청:{}",params);
		catservice.add(params);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String del(Model model,@RequestParam String cat_id) {
		logger.info("삭제요청:{}",cat_id);
		catservice.del(cat_id);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model,@RequestParam HashMap<String, String> params) {
		logger.info("수정요청:{}",params);
		catservice.edit(params);
		return "redirect:/";
	}
	
	
	
	
	
}
