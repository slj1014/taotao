package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	@RequestMapping("/Item/{itemId}")
	@ResponseBody
	public TbItem getById(@PathVariable Long itemId){
		return testService.selectById(itemId);
	}
	
	public List<TbItem> getPage(){
		return null;
	}

}
