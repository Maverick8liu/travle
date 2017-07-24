<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>   

<div class="pageContent">
	<form method="post" action="<%=basePath %>rest/menu/menuInsert" onsubmit="return validateCallback(this, navTabAjaxDone);" class="pageForm required-validate" >
		<div class="pageFormContent" layoutH="56">
		<!-- 第一项 -->
			<p>
				<label>菜单名：</label>
				<input  type="text" name="menuname"/>
			</p>
			<p><label></label></p>
			<!-- 第二项 -->
			<p>
				<label>菜单编码：</label>
				<input  type="text" name="menucode"/>
			</p>
			<p></p>
			<!-- 第三项 -->
			<p>
				<label>父菜单编码：</label>
				<input  type="text" name="parentmenucode"/>
			</p>
			<p></p>
			<!-- 第四项 -->
			<p>
				<label>菜单路径：</label>
				<input  type="text" name="url"/>
			</p>
			<p></p>
			<!-- 第五项 -->
			<p>
				<label>菜单级别：</label>
				<input  type="text" name="menulevel" />
			</p>
			<p></p>
			<!-- 第六项 -->
			<p>
				<label>是否有子菜单：</label>
				<input  type="radio" name="isleaf" value="1" />有 
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input  type="radio" name="isleaf" value="0" checked="checked"/>无 
			</p>
			<p></p>
			<!-- 第七项 -->
			<p>
				<label>菜单状态：</label>
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

