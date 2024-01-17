<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ghasem
  Date: 1/17/2024
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <s:form action="UpdateProdcut">
            <s:textfield name="id" label="id" readonly="true"/>
            <s:textfield name="name" label="name"/>
            <s:textfield name="category" label="category"/>
            <s:textfield name="price" label="price"/>
            <s:submit value="update"/>
        </s:form>
    </div>
</body>
</html>
