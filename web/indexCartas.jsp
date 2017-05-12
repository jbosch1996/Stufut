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
        <title>Jugadores</title>
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
        </div>

                <h1>Listado de Jugadores</h1>
                <style>
.snip1571 {
  background-color: #000;
  display: inline-block;
  font-family: 'Open Sans', sans-serif;
  font-size: 16px;
  margin: 10px 7px;
  max-width: 315px;
  min-width: 230px;
  overflow: hidden;
  position: relative;
  text-align: center;
  width: 100%;
}
.snip1571 *,
.snip1571 *:before {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  -webkit-transition: all 0.35s ease;
  transition: all 0.35s ease;
}
.snip1571 img {
  backface-visibility: hidden;
  max-width: 100%;
  vertical-align: top;
}
.snip1571 figcaption {
  bottom: 30px;
  left: 0;
  position: absolute;
  z-index: 0;
}
.snip1571 figcaption:before {
  background-color: #ffffff;
  bottom: -5px;
  content: '';
  left: 0;
  position: absolute;
  right: 100%;
  top: -5px;
  z-index: -1;
}
.snip1571 h3 {
  background-color: #c73232;
  color: #ffffff;
  font-size: 0.9em;
  font-weight: 600;
  letter-spacing: 1px;
  margin: 0;
  padding: 5px 10px;
  text-transform: uppercase;
  z-index: 1;
}
.snip1571 a {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  z-index: 1;
}
.snip1571:hover > img,
.snip1571.hover > img {
  opacity: 0.1;
}
.snip1571:hover figcaption:before,
.snip1571.hover figcaption:before {
  right: -5px;
}

                </style>
        <% 
        List<Carta> cartas = (List<Carta>) request.getAttribute("cartas");
        for (Carta carta : cartas) {
            %>
             <figure class="snip1571"><img src="http://cx.comunidadxbox.com/wp-content/imagenes/FUT_Primaryhero-bg-md.jpg" alt="sample103" />
  <figcaption>
      <h3>Nombre: <%= carta.getNombre() %><br>Media: <%= carta.getMedia() %></h3>
  </figcaption>
  <a href="#"></a>
</figure>   
        <% }
        %>
    </body>
</html>
