package com.hg.hgc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hg.hgc.core.generic.GenericDao;
import com.hg.hgc.core.generic.GenericServiceImpl;
import com.hg.hgc.web.dao.CustomMapper;
import com.hg.hgc.web.model.Custom;
import com.hg.hgc.web.model.CustomExample;
import com.hg.hgc.web.service.CustomService;

@Service
public class CustomServiceImpl extends GenericServiceImpl<Custom, Integer> implements CustomService {
	@Resource
	CustomMapper mapper;

	@Override
	public List<Custom> selectByExample(CustomExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public long countByExample(CustomExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CustomExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public GenericDao<Custom, Integer> getDao() {
		// TODO Auto-generated method stub
		return mapper;
	}
	


}
