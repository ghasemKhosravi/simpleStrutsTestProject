<%--
  Created by IntelliJ IDEA.
  User: ghasem
  Date: 1/16/2024
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <h2>login</h2>
    <s:form action="LoginAction">
        <s:textfield name="userName" label="username"/>
        <s:password name="pass" label="password"/>
        <s:submit value="login"/>
    </s:form>
</div>
</body>
</html>
