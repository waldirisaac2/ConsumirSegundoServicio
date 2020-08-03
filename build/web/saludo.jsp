<%-- 
    Document   : saludo
    Created on : 02/08/2020, 08:31:08 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ServletEgresados" method="POST">
            <input type="text"  name="hola"/>
            <input type="submit"  value="enviar"/>
        </form>
    </body>
</html>
