<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/26
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <form action="${ctx}/admin/login" method="post">
    <input type="text" name="username" placeholder="USERNAME"><br>
    <input type="password" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="LOGIN">
  </form>
  ${requestScope.message}
  </body>
</html>
