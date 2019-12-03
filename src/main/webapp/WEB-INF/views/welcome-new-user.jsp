<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <title>Welcome new user</title>
</head>
<body>
<a href="index" class="button button-green">Вернуться на главную</a>
<h3>Welcome new user</h3>
<p>Name: ${userRegistration.userName}</p>
<p>Tel: ${userRegistration.telNumber}</p>
<p>Passw: ${userRegistration.password}</p>
<p>Admin: ${userRegistration.userRole}</p>
</body>
</html>
