package com.taotao.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
   private TbItemMapper tbItemMapper;
	@Override
	public TbItem selectById(long itemId) {
		// TODO Auto-generated method stub
		TbItemExample example=new TbItemExample();
		Criteria criteria= example.createCriteria();
		criteria.andIdEqualTo(itemId);
	    List<TbItem> list=tbItemMapper.selectByExample(example);
	    if(!list.isEmpty()){
	    	return list.get(0);
	    }
		return null;
	}

}
