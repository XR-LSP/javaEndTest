<%--
  Created by IntelliJ IDEA.
  author: 雾岛
  Date: 2022/06/02 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta charset="UTF-8"/>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Serif+JP:wght@400;600;700;900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" type="text/css" media="all"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font-awesome.min.css" type="text/css"
          media="all">
</head>
<body>
<section class="w3l-hotair-form">
    <h1>Employee information management</h1>
    <div class="container">
        <div class="workinghny-form-grid">
            <div class="main-hotair">
                <div class="content-wthree">
                    <h2>register</h2>
                    <p>Li Long</p>
                    <form action="${pageContext.request.contextPath}/worker/register" method="post">
                        <input type="text" class="text" name="userName" placeholder="User Name" required="">
                        <input type="password" class="password" name="password" placeholder="User Password" required="">
                        <button class="btn" type="submit">register</button>
                    </form>
                    <p class="account">Already have an account, log in! <a href="${pageContext.request.contextPath}/login.jsp">Login</a></p>
                </div>
                <div class="w3l_form align-self">
                    <div class="left_grid_info">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright text-center">
        <p class="copy-footer-29">梁坤沙雕.</p>
    </div>
</section>
</body>
</html>
