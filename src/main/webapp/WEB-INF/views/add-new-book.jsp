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
<table>
    <tr>
        <td>User ID</td>
        <td>Name</td>
        <td>Telephone</td>
        <td>Password</td>
        <td>User role</td>
        <td>Active</td>
    </tr>
<%--    <c:forEach items="${userList}" var="user">--%>
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.telNumber}</td>
            <td>${user.password}</td>
            <td>${user.userRole}</td>
            <td>${user.active}</td>
        </tr>
<%--    </c:forEach>--%>
</table>


<form:form method="POST"
           modelAttribute="bookCreator"
           action="create-book">
    <table>
        <tr>
<%--            <td><form:label path="userId">userId:</form:label></td>--%>
            <td><form:input type="hidden" path="userId" value="${user.id}" readonly="true"/></td>
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
