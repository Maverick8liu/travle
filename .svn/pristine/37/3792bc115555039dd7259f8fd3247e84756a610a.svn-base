package com.hg.hgc.core.util;

import com.alibaba.fastjson.JSONObject;

public class ControllerUtil {
	public final static JSONObject json = new JSONObject();
	
	/**
	 * Controller处理，增改删处理后返回的成功的json数据格式，若数据为空传入空字符串，不可传入null
	 * @param message		返回信息内容
	 * @param navTab		跳转到页面菜单的nav
	 * @param rel			
	 * @param callbackType	返回格式
	 * @param forwardUrl	跳转的地址，当callbackType为forward有用，
	 * @return
	 */
	public static JSONObject getSuccessJson(String message,String navTab,String rel,String callbackType,String forwardUrl){
		JSONObject json = new JSONObject();
		json.put("statusCode", 200);
		json.put("message",message);
		json.put("navTabId", navTab);
		json.put("rel", rel);
		json.put("callbackType",callbackType);
		json.put("forwardUrl",forwardUrl);
		
		return json;
	}
	
	/**
	 * Controller处理，增改删处理后返回的失败的json数据格式，若数据为空传入空字符串，不可传入null
	 * @param message		返回信息内容
	 * @return
	 */
	public static JSONObject getFaileJson_300(String message){
		JSONObject json = new JSONObject();
		json.put("statusCode", 300);
		json.put("message",message);
		return json;
	}
	
	/**
	 * Controller处理，增改删处理后返回的失败的json数据格式，若数据为空传入空字符串，不可传入null
	 * @param message		返回信息内容
	 * @return
	 */
	public static JSONObject getFaileJson_301(String message){
		JSONObject json = new JSONObject();
		json.put("statusCode", 301);
		json.put("message",message);
		return json;
	}
}
