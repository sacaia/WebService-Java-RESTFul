package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bd.dbos.*;
import bd.daos.*;
import br.unicamp.Server.*;

public final class consultaRA_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <title>Consulta RA</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 try{ 
        Server server = new Server();
        Aluno aluno = server.consultaIdAluno((String)request.getParameter("ra"));
        //Aluno aluno = Alunos.getAluno((String)request.getParameter("ra"));

      out.write("\r\n");
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
      out.write("                    <tr>\r\n");
      out.write("                            <th  scope=\"row\">\r\n");
      out.write("                                1\r\n");
      out.write("                            </th>\r\n");
      out.write("                            \r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( aluno.getRa() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                            \r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( aluno.getNome() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      out.print( aluno.getEmail() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table> \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("                            \r\n");
      out.write("    <div class=\"row pb-5 pt-2\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <form action=\"Client.jsp\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" class=\"btn btn-dark btn-block\" value=\"Voltar\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
 }
    catch(Exception e) {
            String erro = e.getMessage();
            request.setAttribute("ret", erro);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
            dispatcher.forward( request, response); } 

      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
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
