<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<div class="pageContent">
	<form method="post" action="<%=basePath %>rest/menu/menuModify" onsubmit="return validateCallback(this, navTabAjaxDone);" class="pageForm required-validate" >
		<input type="hidden" name="menuid" value="${menuModify.menuid }">
		<div class="pageFormContent" layoutH="56">
		<!-- 第一项 -->
			<p>
				<label>菜单名：</label>
				<input  type="text" name="menuname" value="${menuModify.menuname }"/>
			</p>
			<p><label></label></p>
			<!-- 第二项 -->
			<p>
				<label>菜单编码：</label>
				<input  type="text" name="menucode" value="${menuModify.menucode }"/>
			</p>
			<p></p>
			<!-- 第三项 -->
			<p>
				<label>父菜单编码：</label>
				<input  type="text" name="parentmenucode" value="${menuModify.parentmenucode }"/>
			</p>
			<p></p>
			<!-- 第四项 -->
			<p>
				<label>菜单路径：</label>
				<input  type="text" name="url" value="${menuModify.url }"/>
			</p>
			<p></p>
			<!-- 第五项 -->
			<p>
				<label>菜单级别：</label>
				<input  type="text" name="menulevel" value="${menuModify.menulevel }"/>
			</p>
			<p></p>
			<!-- 第六项 -->
			<p>
				<label>是否有子菜单：</label>
				<input  type="radio" name="isleaf" value="1" <c:if test="${menuModify.isleaf == 1 }">checked="checked"</c:if> />有 
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input  type="radio" name="isleaf" value="0" <c:if test="${menuModify.isleaf == 0 }">checked="checked"</c:if> />无 
			</p>
			<p></p>
			<!-- 第七项 -->
			<p>
				<label>菜单状态：</label>
				<input  type="radio" name="status" value="1" <c:if test="${menuModify.status == 1 }">checked="checked"</c:if> />启用  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input  type="radio" name="status"  value="0" <c:if test="${menuModify.status == 0 }">checked="checked"</c:if> />禁用  
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
