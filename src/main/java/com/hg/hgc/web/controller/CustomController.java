package com.hg.hgc.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.hg.hgc.core.util.SHAUtil;
import com.hg.hgc.web.model.Custom;
import com.hg.hgc.web.model.CustomExample;
import com.hg.hgc.web.service.CustomService;

@Controller
@RequestMapping(value = "/custom")
public class CustomController {
	@Resource
	CustomService customService;
	
	@Login(action=Action.Skip)
    @ResponseBody
    @RequestMapping(value = "/regInfo")
    public String regInfo(HttpServletRequest request) {
		JSONObject json = new  JSONObject();
		try {
			String phone = request.getParameter("mobilePhone");
			String pwd = request.getParameter("pwd");
			String verifyCode = request.getParameter("verifyCode"); 
			
			if(verifyCode != null && verifyCode.equals("123456")){
				if(phone != null && pwd != null){
					Custom custom = new Custom();
					custom.setMobile(phone);
					custom.setPwd(SHAUtil.shaEncode(pwd));
					JSONObject customjson = (JSONObject) JSONObject.toJSON(custom);
					json.put("errorcode", 0);
					json.put("message", "ok");
					json.put("custom", customjson.toString());
				}else{
					json.put("errorcode", 1);
					json.put("message", "Input data error！");
				}
			}else{
				json.put("errorcode", 2);
				json.put("message", "Input verifyCode error！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json.put("errorcode", -1);
			json.put("message", "系统繁忙，请重试！");
		}
		
		
		
        return json.toJSONString();
    }
	
	/**
	 * 
	 * @return
	 */
	public String login(){
		JSONObject json = new  JSONObject();
		CustomExample example = new CustomExample();
		return json.toJSONString();
	}

}
