package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interfaz_002dusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" style=\"overflow-y: hidden\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Import materialize.css-->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Usuario</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"cuerpo\">\r\n");
      out.write("        <!--# NOTE: Comienza parte mostrar barra navegaciÃ³n.-->\r\n");
      out.write("        <div id=\"primera\" class=\"scrollspy\">\r\n");
      out.write("            <nav class=\"pushpin-nav z-depth-0\" data-target=\"primera\">\r\n");
      out.write("                <div class=\"nav-wrapper lime darken-1\" id=\"sombra\">\r\n");
      out.write("                    <div class=\"col s12\">\r\n");
      out.write("                        <div id=\"principal-nav\">\r\n");
      out.write("                            <a href=\"#\" class=\"brand-logo\"><i class=\"material-icons\">shopping_basket</i>MallBIT</a>\r\n");
      out.write("                            <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">\r\n");
      out.write("                                <li><a href=\"index.jsp\" onclick=\"");
 session.invalidate(); 
      out.write("\"><i class=\"material-icons left\">exit_to_app</i>Salir</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div style=\"height: 56px;\" id=\"search-nav\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col s10\">\r\n");
      out.write("                                    <div class=\"input-field black-text\">\r\n");
      out.write("                                        <i class=\"material-icons prefix\">search</i>\r\n");
      out.write("                                        <input placeholder=\"Haz click para buscar\" id=\"icon_prefix\" type=\"text\" class=\"validate\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col s2\">\r\n");
      out.write("                                    <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                                        <li><a id=\"search-nav-cancel\" href=\"#\"><i class=\"material-icons left black-text\">cancel</i>Cancelar</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"height: 64px;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\" id=\"main\">\r\n");
      out.write("            <div class=\"col s8\">\r\n");
      out.write("                <div class=\"block\" id=\"bloque\">\r\n");
      out.write("                    <div class=\"card-panel\" id=\"cardp\">\r\n");
      out.write("                        <div class=\"center-align\" id=\"cardtop\">\r\n");
      out.write("                            <p id=\"titleis2\">Alejandro Cubillos Perdigon</p>\r\n");
      out.write("                            <p id=\"subtitleis2\">Cliente</p><br>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"datos\">\r\n");
      out.write("                            <div id=\"datapair\">\r\n");
      out.write("                                <p id=\"datatitle\"><b>Usuario</b></p>\r\n");
      out.write("                                <div class=\"right-align\" id=\"data\">Alejo</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"datapair\">\r\n");
      out.write("                                <p id=\"datatitle\"><b>Correo</b></p>\r\n");
      out.write("                                <div class=\"right-align\" id=\"data\">alejocp236@hotmail.com</div>\r\n");
      out.write("                            </div >\r\n");
      out.write("                            <div id=\"datapair\">\r\n");
      out.write("                                <p id=\"datatitle\"><b>Fecha de Nacimiento</b></p>\r\n");
      out.write("                                <div class=\"right-align\" id=\"data\">16/03/1999</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"datapair\">\r\n");
      out.write("                                <p id=\"datatitle\"><b>GÃ©nero</b></p>\r\n");
      out.write("                                <div class=\"right-align\" id=\"data\">Masculino</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"puntos\">\r\n");
      out.write("                            <div class=\"row\" id=\"points\">\r\n");
      out.write("                                <div class=\"col s0\" id=\"pointstitle\">\r\n");
      out.write("                                    <p id=\"p1\">MallBITs</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col s0\" id=\"pointscount\">\r\n");
      out.write("                                    <p id=\"p2\" class=\"center-align\">10</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col s2\" id=\"opciones\">\r\n");
      out.write("                <div class=\"center-align\">\r\n");
      out.write("                    <a class=\"btn-floating btn-large waves-effect waves-light\" id=\"compras\"><i id=\"comprastext2\">Mis Compras</i><i class=\"material-icons\" id=\"comprastext\">shopping_cart</i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"center-align\">\r\n");
      out.write("                    <a class=\"btn-floating btn-large waves-effect waves-light\" id=\"editar\"><i id=\"editartext2\">Editar</i><i class=\"material-icons\" id=\"editartext\">create</i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"center-align\">\r\n");
      out.write("                    <a class=\"btn-floating btn-large waves-effect waves-light\" id=\"borrar\"><i id=\"borrartext2\">Eliminar</i><i class=\"material-icons\" id=\"borrartext\">clear</i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Import jQuery before materialize.js-->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
      out.write("        <script src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
