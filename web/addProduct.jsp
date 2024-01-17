<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ghasem
  Date: 1/17/2024
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addProduct</title>
</head>
<body>
    <div>
        <s:form action="AddAction">
            <s:textfield name="name" label="productName"/>
            <s:textfield name="category" label="Category"/>
            <s:textfield name="price" label="Price"/>
            <s:submit value="addProduct"/>
        </s:form>
    </div>
</body>
</html>
