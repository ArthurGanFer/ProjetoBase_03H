<%-- 
    Document   : home
    Created on : 30/09/2015, 09:47:23
    Author     : 1147106
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto LP2</title>
    </head>
    <body>
        <h1><%
            out.print("WELCOME "+request.getSession().getAttribute("username").toString());
        %></h1>
    </body>
</html>
