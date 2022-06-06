<%--
  Created by IntelliJ IDEA.
  author: 雾岛
  Date: 2022/06/02 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入 Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>员工信息列表 —— 显示所有员工信息</small>
                </h1>
            </div>
        </div>
    </div>

    <%--    <a class="btn btn-success" href="${pageContext.request.contextPath}/worker/list">显示全部信息</a>--%>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>员工编号</th>
                    <th>员工名字</th>
                    <th>密码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <c:forEach var="worker" items="${list}">
                    <tr>
                        <td>${worker.wid}</td>
                        <td>${worker.userName}</td>
                        <td>${worker.password}</td>
                        <td>
                            <a class="btn btn-warning" href="worker/toUpdatePaper/${worker.wid}">更改</a>
                            &nbsp;
                            <a class="btn btn-danger" href="worker/deleteById/${worker.wid}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>
