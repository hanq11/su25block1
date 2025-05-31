<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 5/31/2025
  Time: 5:56 PM
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
            <th>Ma</th>
            <th>Ten</th>
            <th>Gia</th>
            <th>Chong nuoc</th>
            <th>Hanh dong</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${danhSach}" var="capSach">
            <tr>
                <td>${capSach.id}</td>
                <td>${capSach.ten}</td>
                <td>${capSach.gia}</td>
                <td>${capSach.chongNuoc ? "Co" : "Khong"}</td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
