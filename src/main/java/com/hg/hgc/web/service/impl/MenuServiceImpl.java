package com.hg.hgc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.generic.GenericDao;
import com.hg.hgc.core.generic.GenericServiceImpl;
import com.hg.hgc.web.dao.MenuMapper;
import com.hg.hgc.web.model.Menu;
import com.hg.hgc.web.model.MenuExample;
import com.hg.hgc.web.service.MenuService;

@Service
public class MenuServiceImpl extends GenericServiceImpl<Menu, Integer> implements MenuService {

	@Resource
	MenuMapper menuMapper;
	
	@Override
	public List<Menu> selectByExampleAndPage(Page<Menu> page, MenuExample example) {
		// TODO Auto-generated method stub
		return menuMapper.selectByExampleAndPage(page, example);
	}

	@Override
	public GenericDao<Menu, Integer> getDao() {
		// TODO Auto-generated method stub
		return menuMapper;
	}

	@Override
	public int countByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return menuMapper.countByExample(example);
	}

}
