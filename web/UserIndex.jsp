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
        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle"
                    data-toggle="dropdown">
                Equipos <span class="caret"></span>
            </button>

            <ul class="dropdown-menu" role="menu">
                <li><a href="#">Crear equipo</a></li>
                <li><a href="#">Modificar equipo</a></li>
                <li><a href="#">Borrar equipo</a></li>
                <li><a href="#">Mirar otros equipos</a></li>
            </ul>
        </div>

        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle"
                    data-toggle="dropdown">
                Jugadores y clubes <span class="caret"></span>
            </button>

            <ul class="dropdown-menu" role="menu">
                <li><a href="#">Lista de jugadores</a></li>
                <li><a href="#">Lista de clubes</a></li>
                <li><a href="#">Lista de selecciones</a></li>
                <!--<li class="divider"></li>
                <li><a href="#">Acci�n #4</a></li>-->
            </ul>
        </div>


    </body>
</html>
