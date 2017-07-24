<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>   

<div class="pageContent">
	<form method="post" action="<%=basePath %>rest/userGroup/userGroupModify" onsubmit="return validateCallback(this, navTabAjaxDone);" class="pageForm required-validate" >
		<div class="pageFormContent" layoutH="56">
		<input type="hidden" name="groupid" value="${userGroup.groupid }" >
		<!-- 第一项 -->
			<p>
				<label>菜单名：</label>
				<input  type="text" name="groupname" value="${userGroup.groupname }" />
			</p>
			<p><label></label></p>
			
			<p>
				<label>状态：</label>
				<input  type="radio" name="status" value="1" <c:if test="${userGroup.status == 1}">checked="checked"</c:if> />启用  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input  type="radio" name="status"  value="0" <c:if test="${userGroup.status == 0}">checked="checked"</c:if> />禁用  
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

