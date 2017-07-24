package com.hg.hgc.web.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.kisso.SSOConfig;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.SSOToken;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.kisso.web.waf.request.WafRequestWrapper;
import com.hg.hgc.core.util.CaptchaUtil;
import com.hg.hgc.web.security.PermissionSign;
import com.hg.hgc.web.security.RoleSign;

import io.netty.handler.codec.http.HttpRequest;

/**
 * 用户控制器
 * 
 * @author smile_pengbin
 * @since 2014年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

 /*   @Resource
    private UserService userService;

    *//**
     * 用户登录
     * 
     * @param user
     * @param result
     * @return
     *//*
    @Login(action = Action.Skip)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpServletRequest request,HttpServletResponse response) {
       String rstr = "index";
    	try {
        	WafRequestWrapper req = new WafRequestWrapper(request);
        	String verifyCode = req.getParameter("verifyCode");
        	String scode = (String) req.getSession().getAttribute("verifyCode");
        	if(verifyCode.toUpperCase().equals(scode)){
        		 // 验证成功在Session中保存用户信息
                final User authUserInfo = userService.selectByUsername(user.getUsername());
                if (authUserInfo != null) {
        			
        			
        			 * authSSOCookie 设置 cookie 同时改变 jsessionId
        			 
        			SSOToken st = new SSOToken(request);
        			st.setId((long)(authUserInfo.getUserid()));
        			st.setUid("12306");
        			st.setType(1);
        			
        			//记住密码，设置 cookie 时长 1 周 = 604800 秒 【动态设置 maxAge 实现记住密码功能】
        			String rememberMe = req.getParameter("rememberMe");
        			if ( "on".equals(rememberMe) ) {
        				request.setAttribute(SSOConfig.SSO_COOKIE_MAXAGE, 604800); 
        			}else{
        				request.setAttribute(SSOConfig.SSO_COOKIE_MAXAGE, 604800/7); 
        			}
        			SSOHelper.setSSOCookie(request, response, st, true);
        			 request.getSession().setAttribute("userInfo", authUserInfo);
        			
        			 rstr =  "index";
        		}else{
        			 rstr = "login";
        		}
               
               
        	}else{
        		request.setAttribute("errorMessage", "验证码输入不正确！");
        		 rstr = "login";
        	}
           
            
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            e.printStackTrace();
            rstr = "login";
        }
       return rstr;
    }

    *//**
     * 用户登出
     * 
     * @param session
     * @return
     *//*
    @Login(action = Action.Skip)
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        return "login";
    }

    *//**
     * 基于角色 标识的权限控制案例
     *//*
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    *//**
     * 基于权限标识的权限控制案例
     *//*
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }
    */
    
   

}
