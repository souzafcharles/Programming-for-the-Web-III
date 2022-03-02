<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Programming for the Web III" %>
</h1>
<br/>
<form action="hello-servlet" method="post">
    <label for="name">Name</label>
    <input id="name" type="text" name="name"> <br/>
    <input type="submit" value="OK">

</form>
</body>
</html>