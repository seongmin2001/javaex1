<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" %>
<html>
<head>
	<title>Directives tag12</title>
</head>
<body>
<h4> 에러가 발생 했습니다.</h4>
<h5> exception 내장 객체 변수</h5>
<%
	exception.printStackTrace(new java.io.PrintWriter(out));
%>
</body>
</html>