package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
  private ItemService itemService;
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page,Integer rows){
		return  itemService.getItemList(page, rows);
	}
	
}
