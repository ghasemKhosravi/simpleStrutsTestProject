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
    <title>Title</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>WellCome</h1>
<a href="addProduct.jsp">
    <button>add new product</button>
</a>
<table class="productTable">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>category</th>
        <th>price</th>
        <th colspan="2">
            action
        </th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="products" var="product">
        <tr>
            <td>
                <s:property value="#product.id"/>
            </td>
            <td>
                <s:property value="#product.name"/>
            </td>
            <td>
                <s:property value="#product.category"/>
            </td>
            <td>
                <s:property value="#product.price"/>
            </td>
            <td>
                <a href="loadInfoAction?id=<s:property value="#product.id"/>">
                    <button>
                        update
                    </button>
                </a>
            </td>
            <td>
                <a href="DeleteAction?id=<s:property value="#product.id"/>">
                    <button>delete</button>
                </a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
