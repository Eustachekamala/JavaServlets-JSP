<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.webapp.model.President" %>
<html>
<head>
    <title>All U.S. Presidents</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #000000;
            text-align: center;
        }
        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }
        .card {
            margin: 10px;
            background: white;
            padding: 15px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            width: 200px;
        }
        .card img {
            width: 100%;
            height: auto;
            border-radius: 8px;
        }
    </style>
</head>
<body>
<h1>All U.S. Presidents</h1>
<div class="container">
    <%
        List<President> presidents = (List<President>) request.getAttribute("presidents");
        for (President p : presidents) {
    %>
    <div class="card">
        <img src="<%= p.getImageUrl() %>" alt="<%= p.getName() %>">
        <h3><%= p.getName() %></h3>
    </div>
    <%
        }
    %>
</div>
</body>
</html>
