<%-- 
    Document   : index
    Created on : 27-abr-2017, 19:07:49
    Author     : 53298857Z
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>STUFUT</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="jumbotron text-center">
            <h1>Stufut</h1>
            <p>La Base de Datos de Ultimate Team más grande!</p> 
        </div>
    <center>
        <div class="container">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Login</button>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">Registro</button>
        </div>

        <img src="img/ultimate.png" alt=""/>    
    </center> 
    <!-- Login -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Login</h4>
                </div>
                <div class="modal-body">
                    <form action="LoginUser" method="POST">
                    <div class="form-group">
                        <label for="usrname"><span class="glyphicon glyphicon-user"></span> Nombre de Usuario</label>
                        <input type="text" class="form-control" name="usrname" placeholder="Introduce Usuario" required>
                    </div>
                <div class="form-group">
                    <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
                    <input type="password" class="form-control" name="psw" placeholder="Enter password" required>
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
    <!-- Registro -->
    <div id="myModal2" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Registro</h4>
                </div>
                <div class="modal-body">
                    <form action="NewUser" method="POST">
                    <div class="form-group">
                        <label for="usrname"><span class="glyphicon glyphicon-user"></span> Nombre de Usuario</label>
                        <input type="text" class="form-control" name="usrname" placeholder="Introduce Usuario" required>
                    </div>
                    <div class="form-group">
                        <label for="email"><span class="glyphicon glyphicon-envelope"></span> Email</label>
                        <input type="email" class="form-control" name="email" placeholder="Introduce Email" required>
                    </div>
                                        <div class="form-group">
                        <label for="psw"><span class="glyphicon glyphicon-certificate"></span> Password</label>
                        <input type="password" class="form-control" name="psw" placeholder="Introduce Password" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre"><span class="glyphicon glyphicon-user"></span> Nombre</label>
                        <input type="text" class="form-control" name="nombre" placeholder="Introduce Nombre" required>
                    </div>
                    <div class="form-group">
                        <label for="apellido"><span class=" glyphicon glyphicon-user"></span> Apellido</label>
                        <input type="text" class="form-control" name="apellido" placeholder="Introduce Apellido" required>
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