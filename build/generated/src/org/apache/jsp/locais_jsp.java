package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.devcaotics.model.repositorios.RepositorioLocalMemo;
import com.devcaotics.model.negocios.Local;
import java.util.List;

public final class locais_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Locais Cadastrados</h1>\n");
      out.write("        <button class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#localCad\">cadastrar</button>\n");
      out.write("        ");

            String mensagem = (String) session.getAttribute("msg");

            List<Local> locais = (List) request.getAttribute("ls");

            Local l = (Local) request.getAttribute("l");
            
            String altera = request.getParameter("altera");
            

            if (mensagem != null) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <h2 id=\"saida\">");
      out.print( mensagem);
      out.write("</h2>\n");
      out.write("\n");
      out.write("        ");

                session.removeAttribute("msg");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <tr><th>Apelidio</th><th>Endereço</th><th>Capacidade</th><th>Operações</th></tr>\n");
      out.write("\n");
      out.write("            ");

                for (Local lAux : locais) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( lAux.getApelido());
      out.write("</td>\n");
      out.write("                <td>");
 out.println(lAux.getEndereco());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( lAux.getCapacidade());
      out.write("</td>\n");
      out.write("                <td><a href=\"LocalServlet?id=");
      out.print( lAux.getId());
      out.write("\">Visualizar</a>\n");
      out.write("                    <a href=\"LocalServlet?id=");
      out.print( lAux.getId());
      out.write("&altera=\">Alterar</a>\n");
      out.write("                    <a href=\"#\" onclick=\"deletar(");
      out.print( lAux.getId() );
      out.write(")\">deletar</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"localCad\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        ");

                            if(altera != null){
                        
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cadLocal.jsp?id=<%= l.getId() %>", out, false);
      out.write("\n");
      out.write("                        ");
 
                            }else{
                        
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cadLocal.jsp", out, false);
      out.write("\n");
      out.write("                        ");
 
                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("        <script src=\"assets/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        ");
            
            if (altera != null) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var myModal = new bootstrap.Modal(document.getElementById('localCad'), {\n");
      out.write("                keyboard: false\n");
      out.write("            })\n");
      out.write("            myModal.show()\n");
      out.write("        </script>\n");
      out.write("        ");
          
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            if (l != null && altera == null) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal fade show\" id=\"modalVis\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"false\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <table class=\"table\"> \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Apelido:</td>\n");
      out.write("                                <td>");
      out.print( l.getApelido());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Endereço:</td>\n");
      out.write("                                <td>");
      out.print( l.getEndereco());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Capacidade:</td>\n");
      out.write("                                <td>");
      out.print( l.getCapacidade());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                var myModal = new bootstrap.Modal(document.getElementById('modalVis'), {\n");
      out.write("                    keyboard: false\n");
      out.write("                })\n");
      out.write("                myModal.show()\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function deletar(id){\n");
      out.write("                \n");
      out.write("                fetch('http://localhost:8080/StreetIFighterII/LocalServlet?id='+id,{ method: 'DELETE' })\n");
      out.write("                        .then(() => document.getElementById(\"saida\").innerHTML=\"local deletado com sucesso!\")\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
