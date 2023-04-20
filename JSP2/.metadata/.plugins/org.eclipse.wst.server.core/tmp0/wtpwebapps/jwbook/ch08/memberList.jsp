<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
<h2>회원 목록</h2>
<hr>
<table border="1">
<tr>
	<th>번호</th>
	<th>아이디</th>
	<th>이메일</th>
	<th>이름</th>
</tr>

<c:forEach var="m" varStatus="i" items="${members}">
	<tr>
		<td>${i.count}</td>
		<td>${m.id}</td>
		<td><a href="/jwbook/mcontrol?action=info&id=${m.id}">${m.email}</a></td>
		<td>${m.name}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>