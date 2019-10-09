<%--
  Created by IntelliJ IDEA.
  User: alextr
  Date: 10/9/19
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<div class="content">
    <h1>Calculator</h1>
    <form method="post" action="calculator">
        <label>Product Description:</label><br/>
        <input type="text" name="description"/><br/>
        <label>List Price:</label><br/>
        <input type="text" name="price"/><br/>
        <label>Discount Percent:</label><br/>
        <input type="text" name="discount_percent"/><br/>
        <label>&nbsp;</label><br/>
        <button type="submit">Submit!</button>
    </form>
</div>
</body>
</html>
