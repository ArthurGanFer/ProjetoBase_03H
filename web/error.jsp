<%-- 
    Document   : error
    Created on : 30/09/2015, 09:47:34
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
        <h1>BAD BAD SERVER. NO DONUTS FOR YOU!</h1>
        <h2><%
            out.print(request.getSession().getAttribute("code").toString());
        %></h2>
    </body>
</html>
