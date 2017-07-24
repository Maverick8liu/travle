package com.hg.hgc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.generic.GenericDao;
import com.hg.hgc.core.generic.GenericServiceImpl;
import com.hg.hgc.web.dao.RoleMapper;
import com.hg.hgc.web.model.Role;
import com.hg.hgc.web.model.RoleExample;
import com.hg.hgc.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author smile_pengbin
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Integer> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Integer> getDao() {
        return roleMapper;
    }


	

	@Override
	public List<Role> selectByExampleAndPage(Page<Role> page,RoleExample example) {
		// TODO Auto-generated method stub
		return roleMapper.selectByExampleAndPage(page, example);
	}




	@Override
	public Role selecByExampleByOne(RoleExample example) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int countByExample(RoleExample example) {
		// TODO Auto-generated method stub
		return roleMapper.countByExample(example);
	}




}
