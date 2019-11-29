<%@ page pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<%--    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form:form method="POST"
           modelAttribute="userRegistration"
           action="register-user"
           class="box login">

    <fieldset class="boxBody">
        <form:label path="userName">Name:</form:label>
        <form:input path="userName"/>

        <form:label path="telNumber">telNumber:</form:label>
        <form:input path="telNumber"/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/>

        <form:label path="userRole">Admin:</form:label>
        <form:checkbox path="userRole"/>

    </fieldset>

    <footer>
        <label><input type="checkbox" tabindex="3">Admin</label>
        <input type="submit" class="btnLogin" value="Register" tabindex="4">
    </footer>
</form:form>
</body>
</html>