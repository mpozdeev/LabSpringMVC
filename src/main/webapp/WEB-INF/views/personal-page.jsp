<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <%--    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">--%>
    <title>Personal page</title>
</head>
<body>
<h3>Личная информация:</h3>
<form:form method="POST"
           modelAttribute="foundUser"
           action="update-user"
           class="box login">
    <table>
        <tr>
            <td><form:label path="id">User ID:</form:label></td>
            <td><form:input path="id"   value="${foundUser.id}" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="userName">Name:</form:label></td>
            <td><form:input path="userName" value="${foundUser.userName}"/></td>
        </tr>
        <tr>
            <td><form:label path="telNumber">telNumber:</form:label></td>
            <td><form:input path="telNumber" value="${foundUser.telNumber}"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password:</form:label></td>
            <td><form:password path="password" value="${foundUser.password}"/></td>
        </tr>
        <tr>
            <td><form:label path="userRole">Role:</form:label></td>
            <td><form:input path="userRole" value="${foundUser.userRole}" readonly="true"/></td>
        </tr>
        <tr>
            <td><input type="submit" class="btnLogin" value="Update" tabindex="4"></td>
        </tr>
    </table>
</form:form>

<h3>Другие зарегистрированные пользователи</h3>
<table>
    <tr bgcolor="#9acd32">
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

<h3>Список интересуемых книг:</h3>
<table>
    <tr bgcolor="#9acd32">
        <td>Title</td>
        <td>Author</td>
        <td>Release year</td>
        <td>Description</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>

</table>
<a href="add-new-book">Добавить книгу</a>

</body>
</html>
