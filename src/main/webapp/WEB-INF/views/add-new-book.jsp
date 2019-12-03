<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <%--    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">--%>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <title>Add new book</title>
</head>
<body>
<a href="<c:url value='/personal-page/${user.id}' />"
   class="button button-green">Вернуться в кабинет</a>
<table>
    <tr bgcolor="#9acd32">
        <td>User ID</td>
        <td>Name</td>
        <td>Telephone</td>
        <td>Password</td>
        <td>User role</td>
        <td>Active</td>
    </tr>
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.telNumber}</td>
        <td>${user.password}</td>
        <td>${user.userRole}</td>
        <td>${user.active}</td>
    </tr>
</table>

<form:form method="POST"
           modelAttribute="bookCreator"
           action="create-book">
    <table>
        <tr>
            <td><form:input type="hidden" path="userId" value="${user.id}" /></td>
        </tr>
        <tr>
            <td><form:label path="bookTitle">Title:</form:label></td>
            <td><form:input path="bookTitle"/></td>
        </tr>
        <tr>
            <td><form:label path="author">Author:</form:label></td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td><form:label path="releaseYear">Release year:</form:label></td>
            <td><form:input path="releaseYear"/></td>
        </tr>
        <tr>
            <td><form:label path="description">Description:</form:label></td>
            <td><form:input path="description"/></td>
        </tr>
        <tr>
            <td><input type="submit" class="button button-blue" value="Add book" tabindex="4"></td>
        </tr>
    </table>
</form:form>

</body>
</html>
