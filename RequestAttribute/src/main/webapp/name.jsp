<%--
  Created by IntelliJ IDEA.
  User: eustache
  Date: 4/14/25
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Page</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <h1>Name Master 2000</h1>
<hr>

<p class="error">${error}</p>

<p>Hey ${person.firstname} ${person.lastname}, nice to meet you.</p>
<p>You are ${person.age} years old.</p>
</body>
</html>
