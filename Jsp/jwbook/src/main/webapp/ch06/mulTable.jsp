<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int n1 = Integer.parseInt(request.getParameter("n1"));
String result = "";

if (n1 != 0)
{
	for (int i = 1; i <= 9; i++) 
	{
		result += n1 + "x" + i + "=" + n1*i + "<br>";
	}
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 홈페이지</title>
</head>
<body>
	<h2>구구단 계산결과</h2>
	<hr>
	<%= result %>
	<form method="post" action="mulTableForm.html">
		<input type="submit" value="이전 페이지로 돌아가기"/>
	</form>
</body>
</html>