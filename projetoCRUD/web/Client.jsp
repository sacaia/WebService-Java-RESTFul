<%-- 
    Document   : Client
    Created on : 30/04/2019, 10:56:43
    Author     : u17189
--%>

<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=ISO-8859-1"
    import="bd.dbos.*, bd.daos.*, br.unicamp.Server.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


    <title>Cliente</title>
    
    
</head>
<body>
    
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
                <%
                    Aluno[] alunos = Alunos.listar();
	
                    for(int i=0; i < alunos.length; i++)
                    {
                %>
                    <tr>
                            <th  scope="row">
                                <%= i+1 %>
                            </th>
                            
                            <td>
                                <%= alunos[i].getRa() %>
                            </td>
                            
                            <td>
                                <%= alunos[i].getNome() %>
                            </td>

                            <td>
                                <%= alunos[i].getEmail() %>
                            </td>
                    </tr>
			
                <%
		}
                %>
                </tbody>
            </table>      
        </div>
    </div>
               
                
    <div class="row">
        <div class="col-12">
            
            <h1 class="pl-5"> Consultas:</h1>
            
            <div class="container pl-5">
                <button class="btn btn-dark btn-lg mb-3 mt-2">Consultar por RA</button>
                <br>
                <button class="btn btn-dark btn-lg">Consultar por Nome</button>
            </div>
            
            <h1 class="pl-5 pt-5"> Outras funcionalidades:</h1>
            <div class="container pl-5">
                <button class="btn btn-dark btn-lg mb-3 mt-2" data-toggle="modal" data-target="#modal-inserir">Inserir Aluno</button>
                <br>
                <button class="btn btn-dark btn-lg mb-3" data-toggle="modal" data-target="#modal-alterar">Alterar Aluno</button>
                <br>
                <button class="btn btn-dark btn-lg mb-3" data-toggle="modal" data-target="#modal-excluir">Excluir Aluno</button>
            </div>
        </div>
    </div>
         
<%
    String resposta = null;
    resposta = (String)request.getAttribute("ret");
    if(resposta != null)
    {
        if(resposta.equals("incluirTrue") || resposta == "incluirTrue")
        {
%>
    <h2>Aluno incluido com sucesso!</h2>
<%  
        }
        else
            if(resposta.equals("excluirTrue") || resposta == "excluirTrue")
            {
%>
                <h2>Aluno excluido com sucesso!</h2>
<%  
            }
            if(resposta.equals("alterarTrue") || resposta == "alterarTrue")
            {
%>
                <h2>Aluno alterado com sucesso!</h2>
<%  
            }
                else
                {
    %>
                    <h2><%= resposta %></h2>
    <%       
                }
        //request.removeAttribute("include");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
        //dispatcher.forward( request, response);
    }
            
%>
    
<!---------------------------------MODAL-INSERIR--------------------------------->
      
      <div class="modal fade" id="modal-inserir" tabindex="-1" role="dialog"> <!-- fade = animação -->
        <div class="modal-dialog modal-md" role="document">
            <div class="modal-content">
            
                <div class="modal-header">
                    
                    <h3 class="modal-title">Novo Aluno</h3>
                    
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><!-- $time; = x -->
                    </button>
                    
                </div>
                
                <div class="modal-body">
                    <div class="container-fluid">
                        
                        <form method="get" action="INCLUIR">

                            <div class="form-row">  

                                <div class="form-group col-sm-3">

                                    <label for="inputRa">RA:</label>
                                    <input type="text" name="ra" class="form-control" id="inputRA" placeholder="RA">

                                </div>
                                <div class="form-group col-sm-9">

                                    <label for="inputNome">Nome:</label>
                                    <input type="text" name="nome" class="form-control" id="inputNome" placeholder="Nome">

                                </div>
                                
                            </div>
                            <div class="form-row">  

                                <div class="form-group col-sm-12">

                                    <label for="inputEmail">Email:</label>
                                    <input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email">

                                </div>

                            </div>
                            
                            
                            <div class="modal-footer">
                                <input type="submit" name="submit" class="btn btn-danger btn-block" value="Adicionar">
                            </div>

                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
      </div>

<!---------------------------------MODAL-ALTERAR--------------------------------->
      
      <div class="modal fade" id="modal-alterar" tabindex="-1" role="dialog"> <!-- fade = animação -->
        <div class="modal-dialog modal-md" role="document">
            <div class="modal-content">
            
                <div class="modal-header">
                    
                    <h3 class="modal-title">Alterar Aluno</h3>
                    
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><!-- $time; = x -->
                    </button>
                    
                </div>
                
                <div class="modal-body">
                    <div class="container-fluid">
                        
                        <form method="get" action="ALTERAR">

                            <div class="form-row">  

                                <div class="form-group col-sm-3">

                                    <label for="inputRa">RA:</label>
                                    <input type="text" name="ra" class="form-control" id="inputRA" placeholder="RA">

                                </div>
                                <div class="form-group col-sm-9">

                                    <label for="inputNome">Nome:</label>
                                    <input type="text" name="nome" class="form-control" id="inputNome" placeholder="Nome">

                                </div>
                                
                            </div>
                            <div class="form-row">  

                                <div class="form-group col-sm-12">

                                    <label for="inputEmail">Email:</label>
                                    <input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email">

                                </div>

                            </div>
                            
                            
                            <div class="modal-footer">
                                <input type="submit" name="submit" class="btn btn-danger btn-block" value="Alterar">
                            </div>

                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
      </div>
    
<!---------------------------------MODAL-EXCLUIR--------------------------------->
      
      <div class="modal fade" id="modal-excluir" tabindex="-1" role="dialog"> <!-- fade = animação -->
        <div class="modal-dialog modal-md" role="document">
            <div class="modal-content">
            
                <div class="modal-header">
                    
                    <h3 class="modal-title">Excluir Aluno</h3>
                    
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><!-- $time; = x -->
                    </button>
                    
                </div>
                
                <div class="modal-body">
                    <div class="container-fluid">
                        
                        <form method="get" action="EXCLUIR">

                            <div class="form-row">  

                                <div class="form-group col-sm-12">

                                    <label for="inputRa">RA:</label>
                                    <input type="text" name="ra" class="form-control" id="inputRA" placeholder="RA">

                                </div>
                            
                            </div>
                            
                            
                            <div class="modal-footer">
                                <input type="submit" name="submit" class="btn btn-danger btn-block" value="Excluir">
                            </div>

                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
      </div>
    
    
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
