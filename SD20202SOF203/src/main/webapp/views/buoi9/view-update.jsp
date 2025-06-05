<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 6/3/2025
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Update cap sach</h2>
    <form action="/buoi9/update" method="post">
        Id: <input type="text" name="id" value="${capSach.id}"> <br>
        Ten: <input type="text" name="ten" value="${capSach.ten}"> <br>
        Gia: <input type="text" name="gia" value="${capSach.gia}"> <br>
        Chong nuoc: <input type="radio" name="chongNuoc" value="true" ${capSach.chongNuoc == "true" ? "checked" : ""}> Co
        <input type="radio" name="chongNuoc" value="false" ${!capSach.chongNuoc == "true" ? "checked" : ""}> Khong <br>
        <button>Submit</button>
    </form>
</body>
</html>
