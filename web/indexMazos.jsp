<%-- 
    Document   : indexCartas
    Created on : 09-may-2017, 17:38:53
    Author     : 53298857Z
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Mazo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>Mazos</title>
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
            </div>
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
        <h1>Listado de Equipos</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Likes</th>
                <th>Usuario</th>
            </tr>
            <%
                List<Mazo> mazos = (List<Mazo>) request.getAttribute("mazos");
                for (Mazo mazo : mazos) {
            %>
            <tr>
                <td><form action="AllMazoCartas" method="POST"><input type="hidden" name="idmazocarta" value="<%= mazo.getIdmazo()%>"><button type="submit"><%= mazo.getNombre()%></button></form></td>
                <td><%= mazo.getLikes()%></td>
                <td><%= mazo.getNombreusu()%></td>
            </tr>
        <% }
        %>
    </table>
</body>
</html>
