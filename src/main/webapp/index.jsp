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
    <title>基帐</title>
</head>
<body>
<h1 align="center">基帐</h1>
<h3 align="center">专为一群单身狗提供的 记账系统，让生活更有品质，让人情更加明了</h3>
    <form  align="center">
        <a href="http://localhost:8080/accounts/list">
            <input type=button value="查accounts账" >
        </a>
        <a href="http://localhost:8080/boss/list">
            <input type=button value="查boss账" >
        </a>
        <a href="http://localhost:8080//boss/list">
            <input type=button value="查boss账" >
        </a>
        <a href=#><button type="submit" value="Submit">记账</button></a>
        <a href=#><button type="submit" value="Submit">清账</button></a>
    </form>
</body>
</html>
