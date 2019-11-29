<%@ page
        language="java"
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
List of users:
<br />
<table>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
