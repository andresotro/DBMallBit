package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iniciar_002dsesion_002dvendedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" style=\"overflow-y: hidden\">\n");
      out.write("    <head>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.css\"/>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Iniciar Sesión</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"cuerpo\">\n");
      out.write("        <nav class=\"pushpin-nav\" data-target=\"primera\">\n");
      out.write("            <div class=\"nav-wrapper lime darken-1\">\n");
      out.write("                <div class=\"col s12\">\n");
      out.write("                    <div id=\"principal-nav\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"brand-logo center\"><i class=\"material-icons\">shopping_basket</i>MallBIT</a>\n");
      out.write("                        <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"block\" id=\"blockis\">\n");
      out.write("            <div class=\"card-panel\">\n");
      out.write("                <form action=\"ControladorVendedor\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"instruccion\" value=\"validarVendedor\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col s10\">\n");
      out.write("                            <p style=\"font-size: 30px\" id=\"titleis\">Inicio de sesión</p>\n");
      out.write("                            <p style=\"font-size: 15px\" id=\"subtitleis\">Acceder a MallBIT</p><br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col s1\">\n");
      out.write("                            <i class=\"material-icons left\" id=\"personas\">people</i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"usuario\" type=\"text\" name=\"usuario\" class=\"validate\">\n");
      out.write("                        <label for=\"usuario\">Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"contraseña\" type=\"password\" name=\"password\" class=\"validate\">\n");
      out.write("                        <label for=\"contraseña\">Contraseña</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center-align\">\n");
      out.write("                        <button class=\"waves-effect waves-light btn lime lighten-2 black-text\" type=\"submit\">Iniciar sesión</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <br>\n");
      out.write("                ");
 String estado = (String) request.getAttribute("RESULTADO"); 
      out.write("\n");
      out.write("                ");
 if (estado == "incorrecto") {
      out.write("\n");
      out.write("                <div class=\"center-align\">\n");
      out.write("                    <style>\n");
      out.write("                        #usuario,#contraseña{\n");
      out.write("                            border-color: red;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("                    <p style=\"color: red\">Usuario o Contraseña Incorrectos</p>\n");
      out.write("                </div>\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                ");
 if (estado == "indefinido") {
      out.write("\n");
      out.write("                <style>\n");
      out.write("                    #register{\n");
      out.write("                        font-size: 18px;\n");
      out.write("                        text-decoration: underline;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                <div class=\"center-align\" id=\"register\">\n");
      out.write("                    ¿No tienes una cuenta?\n");
      out.write("                    <a href=\"ControladorGenero?instruccion=generoVendedor\">\n");
      out.write("                        Regístrate\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
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
