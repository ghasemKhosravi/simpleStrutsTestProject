<%--
  Created by IntelliJ IDEA.
  User: ghasem
  Date: 1/16/2024
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <div>
        <h1>register</h1>
        <s:form action="RegisterAction">
            <s:textfield name="name" label="name"/>
            <s:textfield name="username" label="username"/>
            <s:password name="pass" label="password"/>
            <s:submit value="register"/>
        </s:form>
    </div>
</body>
</html>
