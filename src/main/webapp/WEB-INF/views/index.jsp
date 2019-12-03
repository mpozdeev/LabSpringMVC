<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <title>Greeting page!</title>
</head>
<body>
<h2>Greeting page!</h2>
<a href="login" class="button button-green">Login page</a>
<a href="registration" class="button button-green">Registration</a>
<a href="allusers" class="button button-green">Users</a>
</body>
</html>