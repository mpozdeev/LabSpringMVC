<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
    <title>Insert title here</title>
</head>
<body>
<h1>Welcome to my page</h1>
<p>Hello ${userLogin.userName}!</p>
<p>You password: ${userLogin.password}!</p>
</body>
</html>
