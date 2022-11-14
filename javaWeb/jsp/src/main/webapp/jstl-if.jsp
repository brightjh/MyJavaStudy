<%--
  Created by IntelliJ IDEA.
  User: bright
  Date: 2022/10/5
  Time: 上午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<c:if test="true">
    <h1>true</h1>
</c:if>--%>

<h1>jsp</h1>

<c:if test="${value ==1}">
    启用
</c:if>

<c:if test="${value ==0}">
    禁用
</c:if>

<%--    ${value}--%>

</body>
</html>
