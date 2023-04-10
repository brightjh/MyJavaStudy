<%--
  Created by IntelliJ IDEA.
  User: bright
  Date: 2022/10/4
  Time: 下午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello jsp</h1>

    <%
        out.println("hello jsp");
        int i = 3;
    %>

    <%="hello "%>
    <%= i %>



</body>
</html>
