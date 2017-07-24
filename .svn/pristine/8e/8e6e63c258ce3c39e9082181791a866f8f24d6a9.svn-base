<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<form id="pagerForm" method="post" action="<%=basePath %>rest/role/roleList">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<%-- <input type="hidden" name="pageNum" value="${page.pageNo }" />
	<input type="hidden" name="numPerPage" value="${page.pageSize}" /> --%>
	<input type="hidden" name="pageNo" value="${page.pageNo }" />
	<input type="hidden" name="pageSize" value="${page.pageSize}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>


<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=basePath %>rest/role/roleList" method="post">
	<div class="searchBar">
		
		<table class="searchContent">
			<tr>
				<td>
					我的客户：<input type="text" name="keyword" />
				</td>
				<td>
					<select class="combox" name="province">
						<option value="">所有省市</option>
						<option value="北京">北京</option>
						<option value="上海">上海</option>
						<option value="天津">天津</option>
						<option value="重庆">重庆</option>
						<option value="广东">广东</option>
					</select>
				</td>
				<td>
					建档日期：<input type="text" class="date" readonly="true" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
				<li><a class="button" href="demo_page6.html" target="dialog" mask="true" title="查询框"><span>高级检索</span></a></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<%=basePath %>rest/role/toRoleInsert" target="navTab"><span>添加</span></a></li>
			<li><a class="delete" href="<%=basePath %>rest/role/delRole?roleid={sid_user}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="<%=basePath %>rest/role/toRoleModify?roleid={sid_user}" target="navTab"><span>修改</span></a></li>
			<li class="line">line</li>
			<!-- <li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li> -->
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
			
				<th width="80">序列</th>
				<th width="120">角色名</th>
				<th>角色状态</th>
				
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.roleList }" var="row"  varStatus="status">
			<tr target="sid_user" rel="${row.roleid }">
				<td width="80">${status.index+1 }</td>
				<td width="120">${row.rolename }</td>
		
				<td width="80" align="center">
					<c:if test="${row.status == 1 }">启用</c:if>
					<c:if test="${row.status == 0 }">禁用</c:if>
				</td>
	
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20" <c:if test="${page.pageSize == 20 }"> selected="selected"  </c:if> >20</option>
				<option value="50" <c:if test="${page.pageSize == 50 }"> selected="selected"  </c:if>>50</option>
				<option value="100" <c:if test="${page.pageSize == 100 }"> selected="selected"  </c:if>>100</option>
				<option value="200" <c:if test="${page.pageSize == 200 }"> selected="selected"  </c:if>>200</option>
			</select>
			<span>条，共${page.totalCount}条</span>
		</div>

		<div class="pagination" targetType="navTab" totalCount="${page.totalCount}" numPerPage="${page.pageSize }" pageNumShown="10" currentPage="${page.pageNo }"></div>

	</div>
</div>


