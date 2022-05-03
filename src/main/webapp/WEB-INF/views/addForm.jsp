<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 24.04.2022
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form JSP</title>
</head>
<body>
<h2>Add Book</h2>
<form method="post" action="add">
    <div>
        <label for="isbn">ISNB</label>
        <input name="isbn" id="isbn" type="text">
    </div>
    <div>
        <label for="title">Title</label>
        <input name="title" id="title" type="text">
    </div>
    <div>
        <label for="author">Author</label>
        <input name="author" id="author" type="text">
    </div>
    <div>
        <label for="publisher">Publisher</label>
        <input name="publisher" id="publisher" type="text">
    </div>
    <div>
        <label for="type">Type</label>
        <input name="type" id="type" type="text">
    </div>
    <div>
        <input type="submit">
    </div>
</form>

</body>
</html>
