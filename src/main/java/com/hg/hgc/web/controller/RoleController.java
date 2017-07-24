package com.hg.hgc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.util.ControllerUtil;
import com.hg.hgc.web.model.Role;
import com.hg.hgc.web.service.RoleService;

@Controller
@RequestMapping(value="role")
public class RoleController {
	@Resource
	RoleService roleService;
	
	/**
	 * 角色列表
	 * @param model
	 * @param record
	 * @param request
	 * @return
	 */
	@Login(action = Action.Skip)
	@RequestMapping(value = "roleList")
	public String roleList(Model model,Page<Role> record,HttpServletRequest request){
		int totalCount = roleService.countByExample(null);
		Page<Role> page = new Page<Role>(record.getPageNum(),record.getNumPerPage());
		
		page.setTotalCount(totalCount);
		
		
		List<Role> list = roleService.selectByExampleAndPage(page, null);
		request.setAttribute("roleList", list);
		request.setAttribute("page", page);
		return "role/role_list";
	}
	
	/**
	 * 跳转到添加
	 * @return
	 */
	@Login(action = Action.Skip)
	@RequestMapping(value = "toRoleInsert")
	public String toRoleInsert(){
		return "role/role_insert";
	}
	
	/**
	 * 添加
	 * @param model
	 * @param role
	 * @return
	 */
	@Login(action = Action.Skip)
	@ResponseBody
	@RequestMapping(value = "roleInsert")
	public String roleInsert(Model model,Role role){
		JSONObject json = new JSONObject();
		int isSuc = roleService.insert(role);
		if(isSuc == 1){
			//json = ControllerUtil.getSuccessJson("保存信息成功！", "roleManager", "", "closeCurrent", "");
		}else{
			json = ControllerUtil.getFaileJson_300("保存信息失败！");
		}
		return json.toJSONString();
	}
	
	/**
	 * 跳转到修改
	 * @return
	 */
	@Login(action = Action.Skip)
	@RequestMapping(value = "toRoleModify")
	public String toRoleModify(Model model,Role record,HttpServletRequest request){
		
		Role role = roleService.selectById(record.getRoleid());
		request.setAttribute("role", role);
		return "role/role_modify";
	}
	
	/**
	 * 修改
	 * @return
	 */
	@Login(action = Action.Skip)
	@ResponseBody
	@RequestMapping(value = "roleModify")
	public String roleModify(Model model,Role role){
		JSONObject json = new JSONObject();
		int isSuc = roleService.update(role);
		if(isSuc == 1){
			//json = ControllerUtil.getSuccessJson("保存信息成功！", "roleManager", "", "closeCurrent", "");
		}else{
			json = ControllerUtil.getFaileJson_300("保存信息失败！");
		}
		
		return json.toJSONString();
	}
	
	/**
	 * 删除
	 * @return
	 */
	@Login(action = Action.Skip)
	@ResponseBody
	@RequestMapping(value = "delRole")
	public String delRole(Model model,Role role){
		JSONObject json = new JSONObject();
		int isSuc = roleService.delete(role.getRoleid());
		if(isSuc == 1){
			//json = ControllerUtil.getSuccessJson("保存信息成功！", "roleManager", "", "closeCurrent", "");
		}else{
			json = ControllerUtil.getFaileJson_300("保存信息失败！");
		}
		return json.toJSONString();
	}
}
