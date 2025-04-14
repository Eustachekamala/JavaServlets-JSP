<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Form</title>
    <style>
        body {
            text-align: center;
            display: flex;
            flex-direction: column;
            gap: 10px;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h1 {
            margin-bottom: 20px;
            font-size: 24px;
            color: #333333;
        }

        label {
            text-align: left;
            font-size: 14px;
            color: #555555;
        }

        input {
            height: 35px;
            width: 100%;
            padding: 6px 10px;
            border: 1px solid #cccccc;
            border-radius: 5px;
            font-size: 14px;
        }

        input:focus {
            outline: none;
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        .error {
            color: red;
            margin-bottom: 10px;
        }

        button {
            width: 100%;
            background-color: #007bff;
            color: #ffffff;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>Register Account</h1>
<% if (request.getAttribute("error") != null) { %>
<p class="error"><%= request.getAttribute("error") %></p>
<% } %>
<form method="post" action="/register">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" placeholder="Enter your email here" required>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name here" required>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" id="confirmPassword" name="confirmPassword" required>

    <button type="submit">Create an account</button>
</form>
</body>
</html>