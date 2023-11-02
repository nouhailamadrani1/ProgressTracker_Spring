<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h1>Add User</h1>
<form action="${pageContext.request.contextPath}/utilisateurs/add" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="avatar">Avatar:</label>
    <input type="text" id="avatar" name="avatar" required><br>

    <button type="submit">Add User</button>
</form>
</body>
</html>
