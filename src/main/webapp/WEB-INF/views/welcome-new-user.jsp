<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset='utf-8'>
    <title>Insert title here</title>
</head>
<body>
<h1>Welcome new user</h1>
<p>Name: ${userRegistration.userName}</p>
<p>Tel: ${userRegistration.telNumber}</p>
<p>Passw: ${userRegistration.password}</p>
<p>Admin: ${userRegistration.userRole}</p>
</body>
</html>
