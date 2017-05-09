<%@page import="entities.Carta"%>
<%@page import="java.util.List"%>
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

        <style>
            .snip1581 {
                font-family: 'Poppins:400,700', Arial, sans-serif;
                position: relative;
                display: inline-block;
                overflow: hidden;
                margin: 8px;
                min-width: 250px;
                max-width: 310px;
                width: 100%;
                background-color: #000000;
                color: #ffffff;
                text-align: left;
                font-size: 16px;
                box-shadow: 0 0 5px rgba(0, 0, 0, 0.15);
            }
            .snip1581 * {
                -webkit-transition: all 0.35s;
                transition: all 0.35s;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }
            .snip1581 img {
                max-width: 100%;
                vertical-align: top;
            }
            .snip1581 figcaption {
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                padding: 20px;
                background-image: -webkit-linear-gradient(bottom, rgba(0, 0, 0, 0.8) 0%, transparent 100%);
                background-image: linear-gradient(to top, rgba(0, 0, 0, 0.8) 0%, transparent 100%);
                display: flex;
                flex-direction: column;
                justify-content: flex-end;
            }
            .snip1581 h3 {
                font-size: 44px;
                font-weight: 400;
                line-height: 1;
                letter-spacing: 1px;
                text-transform: uppercase;
                margin: 3px 0;
            }
            .snip1581 .title1 {
                font-weight: 700;
            }
            .snip1581 .title2 {
                color: #a58e7c;
                font-weight: 300;
            }
            .snip1581 .title3 {
                font-weight: 700;
                font-size: 25px;
            }
            .snip1581 a {
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
            }
            .snip1581:hover img,
            .snip1581.hover img {
                -webkit-transform: scale(1.3) rotate(5deg);
                transform: scale(1.3) rotate(5deg);
            }
            /* Demo purposes only */
            body {
                background-color: #212121;
                text-align: center;
            }
        </style>
    <center>
        <figure class="snip1581"><img src="http://www.mundodeportivo.com/r/GODO/MD/p2/Futbol/Imagenes/2014/03/19/MD_54403258441_54403268803.jpg"  width="350px" heght="300px" alt="profile-sample2"/>
            <figcaption>
                <h3 class="title1">Equipos</h3>
            </figcaption><a href="#"></a>
        </figure>
         <figure class="snip1581"><img src="https://scontent-sjc2-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c80.0.919.919/15337085_349055165453499_5098129891203743744_n.jpg?ig_cache_key=MTQwMjI4Mzg4NjUwNzQzMDIxNg%3D%3D.2.c width="350px" heght="300px" alt="profile-sample2"/>
            <figcaption>
                <h3 class="title1">Listado Jugadores</h3>
            </figcaption><a href="AllCartas"></a>
        </figure>
    </center>

</body>
</html>
