<%--
  Created by IntelliJ IDEA.
  author: 雾岛
  Date: 2022/06/02 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <small>添加员工信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/worker/updateByIdWorker" method="post">
        <%--前端传递隐藏域(因为id不需要进行修改)--%>
        <input type="hidden" name="wid" value="${worker.wid}">
        <div class="form-group">
            <label>员工姓名:</label>
            <input type="text" class="form-control" name="userName" value="${worker.userName}">
        </div>

        <div class="form-group">
            <label>密码:</label>
            <input type="text" class="form-control" name="password" value="${worker.password}">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改员工信息">
        </div>
    </form>
</div>
</body>
</html>
