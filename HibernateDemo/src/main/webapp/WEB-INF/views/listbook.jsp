<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Book</title>
    </head>
    <body>
        <c:if test="${user!=null}">
            <h2>Welcome, ${user.person.fullname.firstName}!</h2>
            <a href="logout">Logout</a>
            <a href="borrowlist">Danh sách thuê</a>
        </c:if>
        <h1>List Book</h1>
        <c:if test="${books != null}" >
            <table border="1" style="border-collapse: collapse;">
                <tr>
                    <th>ID</th>
                    <th>Tên sách</th>
                    <th>Tên tác giả</th>
                    <th>Nhà xuất bản</th>
                    <th>Thể loại</th>
                    <th>Giá</th>
                    <th>Thuê</th>
                </tr>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>${book.id}</td>
                        <td>${book.name}</td>
                        <td>${book.author}</td>
                        <td>${book.publisher.name}</td>
                        <td>${book.category.nameCate}</td>
                        <td>${book.price}</td>
                        <td><a href="borrow?id=${book.id}" >Thuê</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
