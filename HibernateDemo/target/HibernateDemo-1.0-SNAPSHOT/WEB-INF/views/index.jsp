<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <c:if test="${msg == 'login fail'}">
            <div style="color: red;">
                Login fail!
            </div>
        </c:if>
        <h1>Login</h1>
        <form:form action="login" method="POST">
            <table>
                <tr>
                    <td>User Name</td>
                </tr>
                <tr>
                    <td><form:input path="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                </tr>
                <tr>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td>
                        <a href="registration" >Register now?</a>
                        <input style="text-align: right;" type="submit" value="Login"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
