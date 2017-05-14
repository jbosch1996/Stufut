<%-- 
    Document   : crearCarta
    Created on : 12-may-2017, 18:56:27
    Author     : 41013277E
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>

    </head>
    <%

        String path = (String) session.getAttribute("filePath");

    %>
    <body>
                <style>
            body {
                font-family: Arial, sans-serif;
                background: url(http://www.fifplay.com/images/public/fifa-17.jpg);
                background-size: cover;
                height: 100vh;
            }
        </style>
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">

                    <form action="NewCarta" method="POST">
                        <input type="hidden" name="path" value="<%=path%>">
                        <div class="form-group">
                            <label for="nombre"><span class="glyphicon glyphicon-user"></span> Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Introduce Nombre de la Carta">
                        </div>
                        <div class="form-group">
                            <label for="media"><span class="glyphicon glyphicon-eye-open"></span> Media</label>
                            <input type="number" class="form-control" id="media" name="media" placeholder="Introduce la Media">
                        </div>
                        <div class="form-group">
                            <label for="posicion"><span class="glyphicon glyphicon-eye-open"></span> Posicion</label>
                            <input type="text" class="form-control" id="posicion" name="posicion" placeholder="Introduce la Posicion">
                        </div>
                        <div class="form-group">
                            <label for="equipo"><span class="glyphicon glyphicon-flag"></span> Equipo</label>
                            <input type="text" class="form-control" id="equipo" name="equipo" placeholder="Introduce el Equipo">
                        </div>
                        <div class="form-group">
                            <label for="pais"><span class="glyphicon glyphicon-globe"></span> Pais</label>
                            <input type="text" class="form-control" id="pais" name="pais" placeholder="Introduce el Pais">
                        </div>
                        <div class="form-group">
                            <label for="velocidad"><span class="	glyphicon glyphicon-flash"></span> Velocidad</label>
                            <input type="text" class="form-control" id="velocidad" name="velocidad" placeholder="Introduce la Velocidad">
                        </div>
                        <div class="form-group">
                            <label for="disparo"><span class="glyphicon glyphicon-screenshot"></span> Disparo</label>
                            <input type="text" class="form-control" id="disparo" name="disparo" placeholder="Introduce el Disparo">
                        </div>
                        <div class="form-group">
                            <label for="pase"><span class="glyphicon glyphicon-chevron-right"></span> Pase</label>
                            <input type="text" class="form-control" id="pase" name="pase" placeholder="Introduce el Pase">
                        </div>
                        <div class="form-group">
                            <label for="regate"><span class="glyphicon glyphicon-move"></span> Regate</label>
                            <input type="text" class="form-control" id="regate" name="regate" placeholder="Introduce el Regate">
                        </div>
                        <div class="form-group">
                            <label for="defensa"><span class="glyphicon glyphicon-eye-open"></span> Defensa</label>
                            <input type="text" class="form-control" id="defensa" name="defensa" placeholder="Introduce la Defensa">
                        </div>
                        <div class="form-group">
                            <label for="fisico"><span class="glyphicon glyphicon-eye-open"></span> Fisico</label>
                            <input type="text" class="form-control" id="fisico" name="fisico" placeholder="Introduce el Físico">
                        </div>
                        <div class="form-group">
                            <label for="tipo"><span class="glyphicon glyphicon-eye-open"></span> Tipo</label>
                            <input type="text" class="form-control" id="tipo" name="tipo" placeholder="Introduce el Tipo">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
