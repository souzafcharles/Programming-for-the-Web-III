<%--
  Created by IntelliJ IDEA.
  User: IFSP
  Date: 10/03/2022
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user, password, id;
    if(request.getParameter("user")!=null &&
            request.getParameter("password")!=null){
        user=request.getParameter("user");
        password=request.getParameter("password");

        if (user=="guest" && password=="123456"){

        }
    }
%>
</body>
</html>
