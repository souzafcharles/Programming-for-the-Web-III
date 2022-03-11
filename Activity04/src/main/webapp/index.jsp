<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,java.io.*"%>

<!DOCTYPE html>
<head>
    <title>Authentic System</title>
    <%
        String name;
        String code;

        if (session.getAttribute("id")==null){


    %>
</head>
<form>
    <h1>Authentic System</h1>
    <form action="authentic.jsp" method="post"/>
    <label for="user">User</label>
    <input id="user" name="user" type="text"></br>
    <label for="password">Password</label>
    <input id="password" name="password" type="password"></br>
    <input type="submit" value="OK">
</form>
<%
}else{
    name=(String)session.getAttribute("name");
    code=(String)session.getAttribute("id");

%>
<h2>Welcome, <%=name%>!</h2>
<a href="authentic.jsp?id=<%=code%>">logout</a>
<%
    }
%>
</body>
</html>
