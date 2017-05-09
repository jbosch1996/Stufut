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
        <title>JSP Page</title>
    </head>
    <body>
                <h1>Cartas</h1>
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
        <% }
        %>
        </table>
    </body>
</html>
