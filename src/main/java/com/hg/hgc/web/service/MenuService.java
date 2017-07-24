package com.hg.hgc.web.service;

import java.util.List;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.generic.GenericService;
import com.hg.hgc.web.model.Menu;
import com.hg.hgc.web.model.MenuExample;

public interface MenuService extends GenericService<Menu, Integer>{
	/**
	 * 分页查询
	 * @param page
	 * @param example
	 * @return
	 */
	 List<Menu> selectByExampleAndPage(Page<Menu> page, MenuExample example);
	 
	 /**
	  * 获取符合条件的总数
	  * @param example
	  * @return
	  */
	 int countByExample(MenuExample example);
}
