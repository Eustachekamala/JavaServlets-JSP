<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Page Not Found</title>
  <style>
    body {
      font-family: 'JetBrains Mono', monospace;
      background-color: #f8f9fa;
      color: #343a40;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      text-align: center;
    }
    .container {
      max-width: 600px;
      padding: 20px;
      background: #ffffff;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      border-radius: 12px;
      animation: fadeIn 1s ease-in-out;
    }
    @keyframes fadeIn {
      from {
        opacity: 0;
        transform: scale(0.9);
      }
      to {
        opacity: 1;
        transform: scale(1);
      }
    }
    h1 {
      font-size: 2.5rem;
      color: #dc3545;
    }
    p {
      font-size: 1.2rem;
      margin-bottom: 20px;
    }
    a {
      text-decoration: none;
      color: #ffffff;
      background-color: #007bff;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      font-weight: bold;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }
    a:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>404 - Page Not Found</h1>
  <p>Sorry, the page you are looking for does not exist.</p>
  <p><a href="/">Return to Homepage</a></p>
</div>
</body>
</html>