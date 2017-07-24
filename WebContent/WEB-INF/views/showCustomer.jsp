<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer title</title>
</head>
<body>
sdjijoi
<br/>
${customer.name}
<br/>
<c:forEach items="${requestScope.customerList }" var="row">
<c:out value="${row.id }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${row.customName }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp; <c:out value="${row.state }"></c:out><br>
</c:forEach>
</body>
</html>