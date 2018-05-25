<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrow</title>
    </head>
    <body>
        <h1>Borrow List</h1>
        <c:if test="${borrows != null}">
            <c:if test="${borrows.size()>0}">
                <table border = "1" style="border-collapse: collapse;">
                    <tr>
                        <th>Tên sách</th>
                        <th>Tác giả</th>
                        <th>Nhà xuất bản</th>
                        <th>Đơn giá</th>
                        <th>Số lượng</th>
                    </tr>
                    <c:forEach items="${borrows}" var="borrow">
                        <tr>
                            <td>${borrow.book.name}</td>
                            <td>${borrow.book.author}</td>
                            <td>${borrow.book.publisher.name}</td>
                            <td>${borrow.book.price}</td>
                            <td>${borrow.quantity}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </c:if>
    </body>
</html>
