package com.hg.hgc.web.service;

import java.util.List;

import com.hg.hgc.core.generic.GenericService;
import com.hg.hgc.web.model.Custom;
import com.hg.hgc.web.model.CustomExample;

public interface CustomService extends GenericService<Custom, Integer>{

	List<Custom> selectByExample(CustomExample example);
	
	long countByExample(CustomExample example);
	
	int deleteByExample(CustomExample example);
}
