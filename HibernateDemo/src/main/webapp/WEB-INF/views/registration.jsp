<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <c:if test="${msg == 'exist'}">
            <div style="color: red;">
                Username is exist!
            </div>
        </c:if>
        <c:if test="${msg == 'empty'}">
            <div style="color: red;">
                Has field empty!
            </div>
        </c:if>
        <h1>Registration</h1>
        <form action="registration" method="POST">
            <table>
                <tr>
                    <td>User Name</td>
                </tr>
                <tr>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                </tr>
                <tr>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>Fullname</td>
                </tr>
                <tr>
                    <td><input type="text" name="fullname"/></td>
                </tr>
                <tr>
                    <td>Address</td>
                </tr>
                <tr>
                    <td><input type="text" name="address"/></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Submit"/>
                        <a href="${pageContext.request.contextPath}/logout">Back</a>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
