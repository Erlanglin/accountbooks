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
    <title>Title</title>
</head>
<body>
<h1>个人信息：</h1>
<table>
    <tr>
        <td>${boss.bossId}</td>
        <td>${boss.name}</td>
        <td>${boss.accunts}</td>
        <td>${boss.remarks}</td>
        <td>${boss.updateTime}</td>
    </tr>
</table>
</body>
</html>
