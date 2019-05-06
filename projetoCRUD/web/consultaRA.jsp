<%-- 
    Document   : consultaRA
    Created on : 06/05/2019, 18:07:10
    Author     : u17189
--%>

<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=ISO-8859-1"
    import="bd.dbos.*, bd.daos.*, br.unicamp.Server.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <title>Consulta RA</title>
</head>
<body>
<% try{ 
        Aluno aluno = Alunos.getAluno((String)request.getParameter("ra"));
%>
    <div class="row">
        <div class="col-12">
            <table class="table" style="max-height: 100px; height: 100px; overflow-y:scroll;">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">RA</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Email</th>
                </tr>
                </thead>

                <tbody>
                    <tr>
                            <th  scope="row">
                                1
                            </th>
                            
                            <td>
                                <%= aluno.getRa() %>
                            </td>
                            
                            <td>
                                <%= aluno.getNome() %>
                            </td>

                            <td>
                                <%= aluno.getEmail() %>
                            </td>
                    </tr>
                </tbody>
            </table> 
        </div>
    </div>
                            
    <div class="row pb-5 pt-2">
        <div class="col-12">
            <form action="Client.jsp">
                <div class="container">
                    <input type="submit" name="submit" class="btn btn-dark btn-block" value="Voltar">
                </div>
            </form>
        </div>
    </div>
<% }
    catch(Exception e) {
            String erro = e.getMessage();
            request.setAttribute("ret", erro);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
            dispatcher.forward( request, response); } 
%>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
