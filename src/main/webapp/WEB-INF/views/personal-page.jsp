<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/css/buttons.css" />" rel="stylesheet">
    <title>Personal page</title>
</head>
<body>
<h3>Личная информация:</h3>
<form:form method="POST"
           modelAttribute="foundUser"
           action="update-user">
    <table>
        <tr>
            <td><form:label path="id">User ID:</form:label></td>
            <td><form:input path="id" value="${foundUser.id}" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="userName">Name:</form:label></td>
            <td><form:input path="userName" value="${foundUser.userName}"/></td>
        </tr>
        <tr>
            <td><form:label path="telNumber">Tel.Number:</form:label></td>
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
            <td><input type="submit" class="button button-green" value="Update" tabindex="4"></td>
        </tr>
    </table>
</form:form>

<h3>Другие зарегистрированные пользователи</h3>
<table>
    <tr>
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
    <tr>
        <td>Book ID</td>
        <td>Title</td>
        <td>Author</td>
        <td>Release year</td>
        <td>Description</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${booksList}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookTitle}</td>
            <td>${book.author}</td>
            <td>${book.releaseYear}</td>
            <td>${book.description}</td>
            <td><a href="" class="button button-green">Edit</a></td>
            <td><a href="" class="button button-red">Delete</a></td>
        </tr>
    </c:forEach>
</table>

<a href="<c:url value='/add-new-book/${user.id}' />"
        class="button button-blue">Добавить книгу</a>
</body>
</html>
