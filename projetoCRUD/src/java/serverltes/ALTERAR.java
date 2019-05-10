/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverltes;

import bd.daos.Alunos;
import bd.dbos.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.unicamp.Server.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author u17189
 */
@WebServlet(name = "ALTERAR", urlPatterns = {"/ALTERAR"})
public class ALTERAR extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ALTERAR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ALTERAR at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String ra = (String)request.getParameter("ra");
            String nome = (String)request.getParameter("nome");
            String email = (String)request.getParameter("email");

            Aluno aluno = new Aluno(ra, nome, email);
            
            URL objURL = new URL("http://localhost:8080/projetoCRUD/webresources/generic/alterar");
            HttpURLConnection con = (HttpURLConnection)objURL.openConnection();

            con.setDoOutput(true);

            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json");
            
            OutputStream os = con.getOutputStream();
            
            String output = aluno.toJson();
            os.write(output.getBytes());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream())); 
            StringBuffer response1 = new StringBuffer();        
            String inputLine;
        
            while((inputLine = br.readLine())!=null){
                response1.append(inputLine);
        
            }
            
            br.close();
            con.disconnect();
            
            //Server server = new Server();

            //server.alteraAluno(aluno);
            //Alunos.alterar(aluno);

            request.setAttribute("ret", "alterarTrue");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
            dispatcher.forward( request, response);
            //(request, response);
        }
        catch(Exception e) {
            String erro = e.getMessage();
            //e.printStackTrace();
            request.setAttribute("ret", "Erro ao alterar aluno");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
            dispatcher.forward( request, response);
            //processRequest(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
