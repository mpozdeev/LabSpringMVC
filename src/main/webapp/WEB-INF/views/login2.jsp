<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<%--    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">--%>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<a href="index" class="button button-green">Вернуться на главную</a>
<h3>Список зарегистрированных пользователей:</h3>
<table>
    <tr bgcolor="#9acd32" >
        <td>User ID</td>
        <td>Name</td>
        <td>Telephone</td>
        <td>Password</td>
        <td>User role</td>
        <td>Active</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.telNumber}</td>
            <td>${user.password}</td>
            <td>${user.userRole}</td>
            <td>${user.active}</td>
        </tr>
    </c:forEach>
</table>
<%--modelAttribute="userLogin"--%>
<form:form method="POST"

           action="login/proceed"
           class="box login">

    <fieldset class="boxBody">
        <form:label path="userName" placeholder="username">Name:</form:label>
        <form:input name="userName"/>

        <form:label path="password" placeholder="password">Password:</form:label>
        <form:password path="password"/>
    </fieldset>

    <footer>
		<label><input type="checkbox" tabindex="3">Remember Me</label>
        <input type="submit" class="button button-blue" value="Login" tabindex="4">
    </footer>
</form:form>
</body>
</html>