<%-- 
    Document   : login
    Created on : 30/04/2024, 14:35:36
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <main>

                <form action="senha" class ="container">

                    <div>
                        <i class="fa-solid fa-envelope"></i> <input name ="email" type="text" placeholder="Email">
                        <br> <br>
                    </div>
                    <div>
                        <i class="fa-solid fa-lock"></i> <input name = "senha" type="password" placeholder="Senha">
                        <br> <br>
                    </div>


                    <button class="btn1">Confirmar</button>


                </form>
                <div class="link">
                    <p>Ainda não tem um login? cadastre-se clicando <a href="./Cadastro">aqui</a></p>
                </div>
                </form>

            </main>
    </body>
</html>
