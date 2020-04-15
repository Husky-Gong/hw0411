<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 4/13/20
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>listBooks</title>
</head>
<body>
<form>
    <table align="center" bgcolor="aqua" border="1" cellpadding="0">
        <tr>
            <th width="140">Title</th>
            <th width="140">Time</th>
            <th width="140">Author</th>
        </tr>
        <!-- 返回到前端的emails是一个List<Email> -->
        <c:forEach items="${emails}" var="b">
            <tr>
                <td>${b.etitle}</td>
                <td>${b.edate}</td>
                <td>${b.sendid}</td>
            </tr>
        </c:forEach>
    </table>
</form>
