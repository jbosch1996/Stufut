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
                background: url(http://www.fifplay.com/images/public/fifa-17.jpg) no-repeat;
                background-size: cover;
                height: 100vh;
            }
        </style>
        <div class="jumbotron text-center"> 
            <h1>STUFUT</h1>
            <%
                String un = (String) session.getAttribute("nombremazo");

                if (un != null) {
            %>
            <p><%=un%>4-2-3-1</p>
            <% } else {
            %>
            <%
                }%>

            <form action="CerrarSesion" method="POST">
                <button type="submit" class="btn btn-success">Logout</button>
            </form>
        </div>



</body>
</html>
