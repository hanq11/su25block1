<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 5/22/2025
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Id: ${dongVat.id} <br>
    Ten: ${dongVat.ten} <br>
    Gioi tinh: ${dongVat.gioiTinh == "true" ? "Duc" : "Cai"} <br>
    Gia tien: ${dongVat.giaTien}
</body>
</html>
