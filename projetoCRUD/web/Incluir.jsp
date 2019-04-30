<%-- 
    Document   : Incluir
    Created on : 30/04/2019, 11:49:31
    Author     : u17189
--%>

<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=ISO-8859-1"
    import="bd.dbos.*, bd.daos.*, br.unicamp.Server.*"%>
<!DOCTYPE html>

<% 
    try{
    String ra = (String)request.getParameter("ra");
    String nome = (String)request.getParameter("nome");
    String email = (String)request.getParameter("email");
    
    Aluno aluno = new Aluno(ra, nome, email);
    
    Alunos.incluir(aluno);
%>
    <h2>Aluno inserido com sucesso!</h2>
<%
    }
    catch(Exception e) {
        String erro = e.getMessage();
%>
    <h2><%= erro %></h2>
<%
    }
%>
