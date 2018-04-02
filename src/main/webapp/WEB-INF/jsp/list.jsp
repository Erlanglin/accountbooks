<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/30
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Boss列表</title>
</head>
<body>
<h1>列表：</h1>
<table>
    <thead>
    <th>bossId</th>
    <th>name</th>
    <th>accunts</th>
    <th>remarks</th>
    <th>updateTime</th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.bossId}</td>
            <td>${u.name}</td>
            <td>${u.accunts}</td>
            <td>${u.remarks}</td>
            <td>${u.updateTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
