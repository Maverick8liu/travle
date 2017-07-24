package com.hg.hgc.web.service;

import java.util.List;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.generic.GenericService;
import com.hg.hgc.web.model.MenuExample;
import com.hg.hgc.web.model.Role;
import com.hg.hgc.web.model.RoleExample;

/**
 * 角色 业务接口
 * 
 * @author smile_pengbin
 * @since 2014年6月10日 下午4:15:01
 **/
public interface RoleService extends GenericService<Role, Integer> {
	/**
	 * 分页查询
	 * @param page
	 * @param example
	 * @return
	 */
	 List<Role> selectByExampleAndPage(Page<Role> page, RoleExample example);
	 
	 /**
	  * 根据查询条件查询符合条件的一条数据
	  * @param example
	  * @return
	  */
	 Role selecByExampleByOne(RoleExample example);
	 
	 /**
	  * 条件查询数量
	  * @param example
	  * @return
	  */
	 int countByExample(RoleExample example);
}
