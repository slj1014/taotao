package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	/**
	 * 商品列表查询
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		TbItemExample example=new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
        List<TbItem> list=tbItemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo=new PageInfo<>(list);
        return new EUDataGridResult(pageInfo.getTotal(),list);
	}

}
