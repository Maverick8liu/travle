package com.hg.hgc.web.interceptors;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.kisso.SSOAuthorization;
import com.baomidou.kisso.Token;

public class SysAuthorization implements SSOAuthorization{
	private static List<String> permissionList = new ArrayList<String>();


	static {
		/**
		 * 正常情况，该部分数据从数据库中加载。
		 */
		permissionList.add("toaddCustomer");
		permissionList.add("10001");
		permissionList.add("10002");
	}


	/*@Override
	public boolean isPermitted(Token arg0, String arg1) {
		// TODO Auto-generated method stub
		System.out.println("I am is SysAuthorization,welcome!");
		return false;
	}
	*/
	
	@Override
	public boolean isPermitted(Token token, String permission) {
		// TODO Auto-generated method stub
		/**
		 * 循环判断权限编码是否合法，token 获取登录用户ID信息、判断相应权限也可作为缓存主键使用。
		 */
		permissionList.contains(permission);
		for ( String perm : permissionList ) {
			if ( perm.equals(permission) ) {
				return true;
			}
		}
		return false;
	}

}
