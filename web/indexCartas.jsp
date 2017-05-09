<%-- 
    Document   : indexCartas
    Created on : 09-may-2017, 17:38:53
    Author     : 53298857Z
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Carta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: url(http://www.fifplay.com/images/public/fifa-17.jpg) no-repeat;
                background-size: cover;
                height: 100vh;
            }
        </style>
        <div class="jumbotron text-center"> 
            <h1>STUFUT</h1>  
            <%
                String un = (String) session.getAttribute("usrname");
                if (un != null) {
            %>
            <p>Usuario Logeado:  <%=un%></p>
            <% } else {
            %>
            <h1>No hay usuario validado.</h1>
            <%
                }%>
            <form action="CerrarSesion" method="POST">
                <button type="submit" class="btn btn-success">Logout</button>
            </form>
        </div>

                <h1>Listado de Jugadores</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Posicion</th>
                <th>Regate</th>
            </tr>
        <% 
        List<Carta> cartas = (List<Carta>) request.getAttribute("cartas");
        for (Carta carta : cartas) {
            %>
            <tr>
                <td><%= carta.getNombre() %></td> 
                <td><%= carta.getPosicion() %></td> 
                <td><%= carta.getRegate() %></td> 
            </tr>
</select>
        <% }
        %>
        </table>
    </body>
</html>
