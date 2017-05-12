<%@page import="java.util.List"%>
<%@page import="entities.Carta"%>
<%@page import="entities.Mazo"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: url(http://estaticos.marca.com/deporte/futbol/flash/alineaciones/liga-12-13/html/imgs/nuevo_campo_315x481.jpg) no-repeat;
                background-size: 100%;
            }
        </style>
        <div class="jumbotron text-center"> 
            <h1>STUFUT</h1>
            <%
                String un = (String) session.getAttribute("nombremazo");
                Integer idmazo = (Integer) session.getAttribute("idmazo");
                if (un != null) {
            %>
            <p><%=un%>4-3-3</p>
            <% } else {
            %>
            <%
                }%>


            <form action="CerrarSesion" method="POST">
                <button type="submit" class="btn btn-success">Logout</button>
            </form>
        </div>


        <div class="form-group">
            <!--                POR-->
            <form action="AddPlayers" method="POST">
                <input type="hidden" name="nombremazo" value="<%=un%>">
                <div class="row">
                    <input type="hidden" name="idmazo" value="<%=idmazo%>">
                    <label for="jugador1"><span class="glyphicon glyphicon-user"></span>POR</label>
                    <br>
                    <select name="jugador1">
                        <option value="" selected></option>
                        <%
                            List<Carta> cartas = (List<Carta>) request.getAttribute("carta");
                            for (Carta carta : cartas) {
                        %>
                        <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                        <%} %>
                    </select>
                    <%
                    %>
                    <!--                    DEF-->

                </div>
                <br>
                <br>
                <br>
                <div class="row">
                    <div class ="col-xs-3">
                        <label for="jugador2"><span class="glyphicon glyphicon-user"></span> LD</label>
                        <br>
                        <select name="jugador2">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-3">
                        <label for="jugador3"><span class="glyphicon glyphicon-user"></span>DFC</label>
                        <br>
                        <select name="jugador3">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-3">
                        <label for="jugador4"><span class="glyphicon glyphicon-user"></span>DFC</label>
                        <br>
                        <select name="jugador4">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-3">
                        <label for="jugador5"><span class="glyphicon glyphicon-user"></span>LI</label>
                        <br>
                        <select name="jugador5">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                </div>
                <br>
                <br>
                <br>
                <div class="row">
                    <div class ="col-xs-12">
                        <label for="jugador6"><span class="glyphicon glyphicon-user"></span>MCD</label>
                        <br>
                        <select name="jugador6">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                </div>
                <br>
                <br>
                <div class="row">  
                    <div class ="col-xs-6">
                        <label for="jugador7"><span class="glyphicon glyphicon-user"></span>MC</label>
                        <br>
                        <select name="jugador7">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-6">
                        <label for="jugador8"><span class="glyphicon glyphicon-user"></span>MC</label>
                        <br>
                        <select name="jugador8">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                </div>
                <br>
                <br>
                <br>
                <br>
                <br>
                <div class="row">
                    <div class ="col-xs-4">

                        <label for="jugador9"><span class="glyphicon glyphicon-user"></span>ED</label>
                        <br>
                        <select name="jugador9">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-4">
                        <label for="jugador10"><span class="glyphicon glyphicon-user"></span>DC</label>
                        <br>
                        <select name="jugador10">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                    <div class ="col-xs-4">
                        <label for="jugador11"><span class="glyphicon glyphicon-user"></span>EI</label>
                        <br>
                        <select name="jugador11">
                            <option value="" selected></option>
                            <%
                                for (Carta carta : cartas) {
                            %>
                            <option value="<%= carta.getIdcarta()%>"> <%=carta.getNombre()%></option>
                            <%} %>
                        </select>
                        <%
                        %>
                    </div>
                </div>
                    <br>
                     <br>
                      <br>
                       <br>
                <div class ="row">
                     <div >
                    <button type="submit" class="btn btn-default">Submit</button>
                     </div>
                </div>
            </form>
        </div>

    </body>
</html>
