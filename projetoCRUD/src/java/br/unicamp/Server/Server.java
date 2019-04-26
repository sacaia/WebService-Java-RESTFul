/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.Server;

import bd.dbos.Aluno;
import bd.daos.Alunos;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author u17189
 */
@Path("generic")
public class Server {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Server
     */
    public Server() {
    }

    /**
     * Retrieves representation of an instance of br.unicamp.Server.Server
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of Server
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @GET
    @Path("/excluiAluno/{ra}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String excluiAluno(@PathParam("ra")String ra){
        try
        {
            Alunos.excluir(ra);
            return "O aluno foi excluido com exito";
        }
        catch(Exception e)
        {
           return "Nao foi possivel excluir o aluno";
        }
    }
    
    @GET
    @Path("/consulta/{ra}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno consultaIdAluno(@PathParam("ra")String ra){
        
        Aluno aluno = null;
        
        try
        {
            aluno = Alunos.getAluno(ra);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
         
        return aluno;
    }

    @POST
    @Path("incluir")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String inlcuiAluno(Aluno aluno){
        try
        {
            Alunos.incluir(aluno);
            return "O aluno foi incluido com exito";
        }
        catch(Exception e)
        {
           return "Nao foi possivel inlcuir o aluno";
        }
    }
   
    @PUT
    @Path("alterar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String alteraAluno(Aluno aluno){
        try
        {
            Alunos.alterar(aluno);
            return "O aluno foi alterado com exito";
        }
        catch(Exception e)
        {
           return "Nao foi possivel alterar o aluno";
        }
    }

}
