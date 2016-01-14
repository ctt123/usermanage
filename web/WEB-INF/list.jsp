<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2015/7/9
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="addinput.action">添加</a>
<table>

    <tr>
        <td>id</td>
        <td>major</td>
        <td>name</td>
        <td>sex</td>
        <td>操作1</td>
        <td>操作2</td>
    </tr>
    <s:iterator value="#users">
        <tr>
            <td>${id}</td>
            <td>${major}</td>
            <td>${name}</td>
            <td>${sex}</td>
            <td><a href="delete.action?id=${id}">删除</a> </td>
            <td><a href="updateinput.action?id=${id}">更新</a> </td>
        </tr>
    </s:iterator>
</table>

</body>
</html>
