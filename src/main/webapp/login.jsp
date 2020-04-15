<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 4/15/20
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
    <base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
    <H3>Login page</H3>
    <form action="userLogin" method="post">
        <p>
            USERNAME:<input type="text" name="uname"/>${requestScope.msg}
        </p>
        <p>
            PASSWORD:<input type="text" name="pwd"/>
        </p>
        <p>
            <input type="submit" value="SUBMIT"/>
        </p>
    </form>
</body>
</html>
