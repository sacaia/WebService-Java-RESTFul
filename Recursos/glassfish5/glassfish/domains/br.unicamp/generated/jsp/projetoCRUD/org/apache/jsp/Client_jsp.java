package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bd.dbos.*;
import bd.daos.*;
import br.unicamp.Server.*;

public final class Client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Cliente</title>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <table class=\"table\" style=\"max-height: 100px; height: 100px; overflow-y:scroll;\">\r\n");
      out.write("                <thead class=\"thead-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">RA</th>\r\n");
      out.write("                    <th scope=\"col\">Nome</th>\r\n");
      out.write("                    <th scope=\"col\">Email</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");

                    Aluno[] alunos = Alunos.listar();
	
                    for(int i=0; i < alunos.length; i++)
                    {
                
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                            <th  scope=\"row\">\r\n");
      out.write("                                ");
      out.print( i+1 );
      out.write("\r\n");
      out.write("                            </th>\r\n");
      out.write("                            \r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( alunos[i].getRa() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                            \r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( alunos[i].getNome() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( alunos[i].getEmail() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                ");

		}
                
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>      \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            \r\n");
      out.write("            <h1 class=\"pl-5\"> Consultas:</h1>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"container pl-5 ml-5\">\r\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3 mt-2\" data-toggle=\"modal\" data-target=\"#modal-consulta-ra\">Consultar por RA</button>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button class=\"btn btn-dark btn-lg\" data-toggle=\"modal\" data-target=\"#modal-consulta-nome\">Consultar por Nome</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <h1 class=\"pl-5 pt-5\"> Outras funcionalidades:</h1>\r\n");
      out.write("            <div class=\"container pl-5 ml-5\">\r\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3 mt-2\" data-toggle=\"modal\" data-target=\"#modal-inserir\">Inserir Aluno</button>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3\" data-toggle=\"modal\" data-target=\"#modal-alterar\">Alterar Aluno</button>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3\" data-toggle=\"modal\" data-target=\"#modal-excluir\">Excluir Aluno</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("         \r\n");

    String resposta = null;
    resposta = (String)request.getAttribute("ret");
    if(resposta != null)
    {
        if(resposta.equals("incluirTrue") || resposta == "incluirTrue")
        {

      out.write("\r\n");
      out.write("            <h2 class=\"text-center text-success pb-3 pt-2\">Aluno incluido com sucesso!</h2>\r\n");
  
        }
        else{
            if(resposta.equals("excluirTrue") || resposta == "excluirTrue")
            {

      out.write("\r\n");
      out.write("                <h2 class=\"text-center text-success pb-3 pt-2\">Aluno excluido com sucesso!</h2>\r\n");
  
            }
            else{
                if(resposta.equals("alterarTrue") || resposta == "alterarTrue")
                {

      out.write("\r\n");
      out.write("                    <h2 class=\"text-center text-success pb-3 pt-2\">Aluno alterado com sucesso!</h2>\r\n");
  
                }
                else{
    
      out.write("\r\n");
      out.write("                    <h2 class=\"text-center text-danger pb-3 pt-2\">");
      out.print( resposta );
      out.write("</h2>\r\n");
      out.write("    ");
       
                }
            }
        }
        //request.removeAttribute("include");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
        //dispatcher.forward( request, response);
    }
            

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!---------------------------------MODAL-INSERIR--------------------------------->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal fade\" id=\"modal-inserir\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\r\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h3 class=\"modal-title\">Novo Aluno</h3>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\r\n");
      out.write("                    </button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        \r\n");
      out.write("                        <form method=\"get\" action=\"INCLUIR\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-3\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputRa\">RA:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"ra\" class=\"form-control\" id=\"inputRA\" placeholder=\"RA\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-sm-9\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputNome\">Nome:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\" placeholder=\"Nome\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputEmail\">Email:</label>\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Adicionar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("<!---------------------------------MODAL-ALTERAR--------------------------------->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal fade\" id=\"modal-alterar\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\r\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h3 class=\"modal-title\">Alterar Aluno</h3>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\r\n");
      out.write("                    </button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        \r\n");
      out.write("                        <form method=\"get\" action=\"ALTERAR\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-3\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputRa\">RA:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"ra\" class=\"form-control\" id=\"inputRA\" placeholder=\"RA\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-sm-9\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputNome\">Nome:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\" placeholder=\"Nome\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputEmail\">Email:</label>\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Alterar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("<!---------------------------------MODAL-EXCLUIR--------------------------------->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal fade\" id=\"modal-excluir\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\r\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h3 class=\"modal-title\">Excluir Aluno</h3>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\r\n");
      out.write("                    </button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        \r\n");
      out.write("                        <form method=\"get\" action=\"EXCLUIR\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputRa\">RA:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"ra\" class=\"form-control\" id=\"inputRA\" placeholder=\"RA\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Excluir\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("<!---------------------------------MODAL-CONSULTAR-RA--------------------------------->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal fade\" id=\"modal-consulta-ra\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\r\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h3 class=\"modal-title\">Consultar Aluno</h3>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\r\n");
      out.write("                    </button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"consultaRA.jsp\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputRa\">RA:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"ra\" class=\"form-control\" id=\"inputRA\" placeholder=\"RA\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Consultar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("<!---------------------------------MODAL-CONSULTAR-NOME--------------------------------->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"modal fade\" id=\"modal-consulta-nome\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\r\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h3 class=\"modal-title\">Consultar Aluno</h3>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\r\n");
      out.write("                    </button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"consultaNome.jsp\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                                    <label for=\"inputNome\">Nome:</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\" placeholder=\"Nome\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Consultar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
