<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored = "true" %> 
<html>
<head>
	<title>Directives tag</title>
</head>
<body>

<%
	request.setAttribute("RequestAttribute", "request 내장객체");
%>
${requestScope.RequestAttribute} <!-- Expression Language -->

</body>
</html>