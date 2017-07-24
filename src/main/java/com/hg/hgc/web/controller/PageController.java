package com.hg.hgc.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.SSOToken;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.hg.hgc.core.util.CaptchaUtil;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author smile_pengbin
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/rest")
public class PageController {

    /**
     * 登录页
     */
	@Login(action = Action.Skip)
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response) {
		SSOToken st = SSOHelper.getToken(request);
		if (st != null) {
			return "index";
		}
		//verify(request,response);
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
    	System.out.println("dashboard");
        return "dashboard";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }
    /**
   	 * 验证码 （注解跳过权限验证）
   	 */
   	@Login(action = Action.Skip)
   	@ResponseBody
   	@RequestMapping("/verify")
   	public void verify(HttpServletRequest request,HttpServletResponse response) {
   		try {
   			String verifyCode = CaptchaUtil.outputImage(response.getOutputStream());
   			request.getSession().setAttribute("verifyCode", verifyCode.toUpperCase());
   			System.out.println("验证码:" + verifyCode);
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
   	}
  
}