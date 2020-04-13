<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 4/13/20
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email list</title>
</head>
<body>
<form>
    <table align="center" bgcolor="aqua" border="1" cellpadding="0">
        <tr>
            <th width="140">Title</th>
            <th width="140">Time</th>
            <th width="140">Author</th>
        </tr>
        <c:forEach items="${emails}" var="e">
            <tr>
                <td>${e.etitle}</td>
                <td>${e.edate}</td>
                <td>${e.sendid}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
