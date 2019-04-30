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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>Cliente</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">#</th>\n");
      out.write("                    <th scope=\"col\">RA</th>\n");
      out.write("                    <th scope=\"col\">Nome</th>\n");
      out.write("                    <th scope=\"col\">Email</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                ");

                    Aluno[] alunos = Alunos.listar();
	
                    for(int i=0; i < alunos.length; i++)
                    {
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                            <th  scope=\"row\">\n");
      out.write("                                ");
      out.print( i+1 );
      out.write("\n");
      out.write("                            </th>\n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( alunos[i].getRa() );
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( alunos[i].getNome() );
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( alunos[i].getEmail() );
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("\t\t\t\n");
      out.write("                ");

		}
                
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>      \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            \n");
      out.write("            <h1 class=\"pl-5\"> Consultas:</h1>\n");
      out.write("            \n");
      out.write("            <div class=\"container pl-5\">\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3 mt-2\">Consultar por RA</button>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"btn btn-dark btn-lg\">Consultar por Nome</button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h1 class=\"pl-5 pt-5\"> Outras funcionalidades:</h1>\n");
      out.write("            <div class=\"container pl-5\">\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3 mt-2\" data-toggle=\"modal\" data-target=\"#modal-inserir\">Inserir Aluno</button>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3\">Alterar Aluno</button>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"btn btn-dark btn-lg mb-3\">Excluir Aluno</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Incluir.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("<!---------------------------------MODAL-INSERIR--------------------------------->\n");
      out.write("      \n");
      out.write("      <div class=\"modal fade\" id=\"modal-inserir\" tabindex=\"-1\" role=\"dialog\"> <!-- fade = animação -->\n");
      out.write("        <div class=\"modal-dialog modal-md\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("            \n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    \n");
      out.write("                    <h3 class=\"modal-title\">Novo Aluno</h3>\n");
      out.write("                    \n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                        <span>&times;</span><!-- $time; = x -->\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        \n");
      out.write("                        <form action=\"Client.jsp\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-row\">  \n");
      out.write("\n");
      out.write("                                <div class=\"form-group col-sm-3\">\n");
      out.write("\n");
      out.write("                                    <label for=\"inputEndereco\">RA:</label>\n");
      out.write("                                    <input type=\"text\" name=\"ra\" class=\"form-control\" id=\"inputRA\" placeholder=\"RA\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-sm-9\">\n");
      out.write("\n");
      out.write("                                    <label for=\"inputEndereco\">Nome:</label>\n");
      out.write("                                    <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\" placeholder=\"Nome\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">  \n");
      out.write("\n");
      out.write("                                <div class=\"form-group col-sm-12\">\n");
      out.write("\n");
      out.write("                                    <label for=\"inputEndereco\">Email:</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-danger btn-block\" value=\"Adicionar\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
