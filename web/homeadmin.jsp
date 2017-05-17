<%@page import="java.util.List"%>
<%@page import="entities.Carta"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="jumbotron text-center">
            <div style="float:left;">
             <a href="index.jsp">
                <img width="50px" height="50px "src="img/arrow-back-icon.png" alt=""/>
            </a>
            </div>
            <h1>Admin Page</h1>
        </div>
    <center>
        <div class="container">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Alta Carta</button>
            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal2">Borrar Carta</button>
        </div>
    </center> 
    <!-- Alta Carta -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Alta Carta</h4>
                </div>
                <div class="modal-body">
                    <form action="NewFile" method="POST" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="foto"><span class="glyphicon glyphicon-user"></span> Foto</label>
                            <input type="file" class="file" id="foto" name="foto" >
                        </div>
<!--                        <div class="form-group">
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
                        </div>-->
                        <button type="submit" class="btn btn-default">Siguiente</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>  
        </div>
    </div>

    <!-- Borrar Carta-->
    <div id="myModal2" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Borrar Carta</h4>
                </div>
                <div class="modal-body">
                    <form action="BorrarCarta" method="POST">
                        <div class="form-group">
                            <label for="formacion"><span class="glyphicon glyphicon-user"></span> Cartas: </label><select name="cartaBorrar">
                                <%
                                    List<Carta> cartas = (List<Carta>) request.getAttribute("cartas");
                                    for (Carta carta : cartas) {
                                %>
                                <option value="<%= carta.getIdcarta()%>"><%= carta.getNombre()%></option>
                                <% }
                                %>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>  
        </div>
    </div>
</body>
</html>