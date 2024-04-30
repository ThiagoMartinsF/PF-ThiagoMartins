<%-- 
    Document   : cadastro
    Created on : 30/04/2024, 14:36:37
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <header>

                <br>
                <h1 class="titulo">Cadastro</h1>


                <div class="logo">
                    <h1 class="titulo1">bon</h1>
                    <h1 class="titulo2">appe</h1>
                    <h1 class="titulo3">tit</h1>
                </div>
            </header>

            <main>

                <br> <br>
                <div class="container">
                    <form action="cadastro" method="post">
                        <div>
                            <i class ="fa-solid fa-user"></i> <input name="nome" type="text" placeholder="Nome">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-envelope"></i> <input name="email" type="email" placeholder="Email">
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-lock"></i> <input name="senha" type="password" placeholder="Senha">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-check"></i> <input id="cpf" type="text" name="cpf" onkeypress="return numeros(event)"  placeholder="CPF"  minlength="11" maxlength="11" required>
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-phone"></i> <input id="telefone" type="text" name="telefone" onkeypress="return numeros(event)" placeholder="Telefone" minlength="11" maxlength="11" required>
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-phone"></i> <input id="dataNascimento" type="text" name="dataNascimento" onkeypress="return numeros(event)" placeholder="DataNascimento" minlength="8" maxlength="8" required>
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-phone"></i> <input id="admin" type="text" name="admin" placeholder="Admin">
                            <br> <br>
                        </div>
                        <div class="botoesFinalizar1">
                            <button type="submit" class="btn1">Confirmar</button>
                        </div>
                    </form>



                </div>
                <br>


                <br>

                <div class="botoesFinalizar1">
                    <a href="./Login"><button>Voltar</button></a>
                </div>



            </main>
    </body>
</html>
