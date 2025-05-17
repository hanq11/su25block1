<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 5/17/2025
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Thong tin</h2>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Ten</th>
                <th>Gioi tinh</th>
                <th>Gia</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="dongVat">
                <tr>
                    <td>${dongVat.id}</td>
                    <td>${dongVat.ten}</td>
                    <td>${dongVat.gioiTinh}</td>
                    <td>${dongVat.giaTien}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
