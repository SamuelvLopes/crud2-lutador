<%-- 
    Document   : locaisNovo
    Created on : 20/04/2022, 19:08:43
    Author     : ALUNO
--%>

<%@page import="com.devcaotics.model.negocios.Lutador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LocaisCadastrados</h1>
        
        <%
            String mensagem = request.getParameter("msg");
            
            if(mensagem != null){
        %>
        <h3><%= mensagem %></h3>
        <%
            }    
        %>
        
        <%
            List<Lutador> lutadores = (List)request.getAttribute("lutadores");
        %>
        
        <table border="1">
            <tr>
              
                <th>id</th>
                <th>Nome</th>
                <th>Apelido</th>
                <th>Peso</th>
                <th>Altura</th>
                <th>Nascimento</th>
                <th>Destro</th>
                <th>Curso</th>
                <th>Arte Marcial</th>
                <th>Contato Emergencia</th>
                <th>Opções</th>
            </tr>
            
            <% 
                for(Lutador lAux: lutadores){
            %>
            
                <tr>
                    <td><%= lAux.GetId() %></td>
                    <td><%= lAux.getNome() %></td>
                    <td><%= lAux.getApelido()%></td>
                    <td><%= lAux.getPeso() %></td>
                    <td><%= lAux.getAltura() %></td>
                    <td><%= lAux.getNascimento() %></td>
                    <td><%= lAux.isDestro() %></td>
                    <td><%= lAux.getCurso() %></td>
                    <td><%= lAux.getArtMarcial() %></td>
                    <td><%= lAux.getContatoEmergencia() %></td>
                    <td>
                        <a href="LutadorS?a=alt&id=<%= lAux.GetId() %>">alterar </a>
                        <a href="LutadorS?a=del&id=<%= lAux.GetId() %>">deletar </a>
                    </td>
                </tr>
            
            
            <% 
                }
            %>
        </table>
    </body>
</html>
