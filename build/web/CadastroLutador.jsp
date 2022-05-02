<%-- 
    Document   : CadastroLutador
    Created on : 20/04/2022, 18:59:53
    Author     : ALUNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Lutador</title>
    </head>
    <body>
        <center>
            
            <h1>Cadastro de Lutador</h1>

            <form class="form" method="post"  action="LutadorS?a=cadastrar">

                <table class="table">
                    <tr>
                        <td>
                            Nome: 
                        </td>
                        <td>
                            <input type="text" name="nome"  /> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Apelido 
                        </td>
                        <td>
                            <input type="text" name="apelido" /> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Peso(kg)
                        </td>
                        <td>
                            <input type="number" min="0" name="peso" step="0.01" id="input" /> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Altura(M)
                        </td>
                        <td>
                            <input type="number" name="altura"  step="0.01" id="input2" min="0"/> 
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Nascimento 
                        </td>
                        <td>
                            <input type="date" name="dtnascimento"  /> 
                        </td>
                    </tr>
                    
                    <tr>
                        <td> 
                            <div>
                                <input type="checkbox" id="destro" name="destro">
                                <label for="scales">Destro</label>
                            </div>
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            Curso 
                        </td>
                        <td>
                            <input type="text" name="curso"  /> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Arte Marcial 
                        </td>
                        <td>
                            <input type="text" name="artmarcial"  /> 
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Contato Emergencia
                        </td>
                        <td>
                            <input type="text" name="contatoemergencia"  /> 
                        </td>
                    </tr>
                    <tr>
                        <td> 
                            <br>
                            <input type="submit" class="btn btn-primary" value="cadastrar"/>
                        </td>
                    </tr>
                </table> 
            </form>
        </center>
    <script>
        document.getElementById("input").addEventListener("change", function(){
            this.value = parseFloat(this.value).toFixed(2);
        });
        document.getElementById("input2").addEventListener("change", function(){
            this.value = parseFloat(this.value).toFixed(2);
        });
    </script>    
    </body>
</html>
