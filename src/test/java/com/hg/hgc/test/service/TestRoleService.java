package com.hg.hgc.test.service;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.feature.test.TestSupport;
import com.hg.hgc.web.model.Role;
import com.hg.hgc.web.service.RoleService;

public class TestRoleService extends TestSupport{

	@Resource
	RoleService roleService;
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void test_insert(){
		Role role = new Role();
		role.setRolename("行政部");
		role.setStatus(1);
		
		roleService.insert(role);
	}
	
	
	@Test
	public void test_FindByPage(){
		Page<Role> page = new Page<Role>(1,10);
		List<Role> list = roleService.selectByExampleAndPage(page, null);
		System.out.println(list.size());
		Iterator<Role> iterator = list.iterator();
		
	}
	
	

}
