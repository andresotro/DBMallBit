<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" style="overflow-y: hidden">
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link href="css/style.css" rel="stylesheet" />
        <link type="text/css" rel="stylesheet" href="css/materialize.css"/>

        <meta charset="UTF-8">
        <title>Iniciar Sesión</title>
    </head>

    <body id="cuerpo">
        <nav class="pushpin-nav" data-target="primera">
            <div class="nav-wrapper lime darken-1">
                <div class="col s12">
                    <div id="principal-nav">
                        <a href="index.jsp" class="brand-logo center"><i class="material-icons">shopping_basket</i>MallBIT</a>
                        <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                    </div>
                </div>
            </div>
        </nav>
        <div class="block" id="blockis">
            <div class="card-panel">
                <form action="ControladorCliente" method="post">
                    <input type="hidden" name="instruccion" value="validarCliente">
                    <div class="row">
                        <div class="col s10">
                            <p style="font-size: 30px" id="titleis">Inicio de sesión</p>
                            <p style="font-size: 15px" id="subtitleis">Acceder como cliente a MallBIT</p><br>
                        </div>
                        <div class="col s1">
                            <i class="material-icons left" id="personas">people</i>
                        </div>
                    </div>
                    <div class="input-field">
                        <input id="usuario" type="text" name="usuario" class="validate">
                        <label for="usuario">Usuario</label>
                    </div>

                    <div class="input-field">
                        <input id="contraseña" type="password" name="password" class="validate">
                        <label for="contraseña">Contraseña</label>
                    </div>
                    <div class="center-align">
                        <button class="waves-effect waves-light btn lime lighten-2 black-text" type="submit">Iniciar sesión</button>
                    </div>
                </form>
                <br>
                <% String estado = (String) request.getAttribute("RESULTADO"); %>
                <% if (estado == "incorrecto") {%>
                <div class="center-align">
                    <style>
                        #usuario,#contraseña{
                            border-color: red;
                        }
                    </style>
                    <p style="color: red">Usuario o Contraseña Incorrectos</p>
                </div>
                <% } else {%>
                <% if (estado == "indefinido") {%>
                <style>
                    #register{
                        font-size: 18px;
                        text-decoration: underline;
                    }
                </style>
                <% }%>
                <% }%>
                <div class="center-align" id="register">
                    ¿No tienes una cuenta?
                    <a href="ControladorGenero?instruccion=generoCliente">
                        Regístrate
                    </a>
                </div>
                <br>

            </div>

        </div>


        <!--Import jQuery before materialize.js-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>