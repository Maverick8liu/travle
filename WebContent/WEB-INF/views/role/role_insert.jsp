<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>   

<div class="pageContent">
	<form method="post" action="<%=basePath %>rest/role/roleInsert" onsubmit="return validateCallback(this, navTabAjaxDone);" class="pageForm required-validate" >
		<div class="pageFormContent" layoutH="56">
		<!-- 第一项 -->
			<p>
				<label>角色名：</label>
				<input  type="text" name="rolename"/>
			</p>
			<p><label></label></p>
			<!-- 第二项 -->
			<p>
				<label>角色状态：</label>
				<input  type="radio" name="status" value="1" checked="checked"/>启用  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input  type="radio" name="status"  value="0"/>禁用  
			</p>
			<p></p>
			
			
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li> <input type="submit" value="保存">-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button> </div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

