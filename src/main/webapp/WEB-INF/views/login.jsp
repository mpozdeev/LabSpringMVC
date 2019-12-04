<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Sign up</title>
</head>
<body>
<h1>Login</h1>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <td>User:</td>--%>
<%--            <td><input type='text' name='username' value=''></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password:</td>--%>
<%--            <td><input type='password' name='password' /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><input name="submit" type="submit" value="submit" /></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<form action="login/proceed" method="post">
    <div class="group">
        <label>Login</label>
        <input name="login"/>
    </div>
    <div class="group">
        <label>Password</label>
        <input name="password" type="password"/>
    </div>

    <div class="group">
        <button>Confirm</button>
    </div>
</form>
</body>
</html>