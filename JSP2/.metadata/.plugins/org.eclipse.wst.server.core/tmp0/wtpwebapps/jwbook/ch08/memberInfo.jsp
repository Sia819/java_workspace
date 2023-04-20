<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보 조회</title>
</head>
<body>
	<h2>회원정보 조회</h2>
	<hr>
	<ul>
		<li>아이디 : ${m.id}</li>
		<li>이메일 : ${m.email}</li>
		<li>비밀번호 : ${m.password}</li>
		<li>이름 : ${m.name}</li>
	</ul>
</body>
</html>
