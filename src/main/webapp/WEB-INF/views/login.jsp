<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
Список зарегистрированных пользователей:
<table>
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

<form:form method="POST"
           modelAttribute="userLogin"
           action="check-user"
           class="box login">

    <fieldset class="boxBody">
        <form:label path="userName">Name:</form:label>
        <form:input path="userName"/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/>
    </fieldset>

    <footer>
<%--		<label><input type="checkbox" tabindex="3">Keep me logged in</label>--%>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>
</form:form>
</body>
</html>