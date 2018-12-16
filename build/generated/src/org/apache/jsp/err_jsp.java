package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class err_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/headerforall1.jsp");
  }

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
      out.write("<html> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Error Page</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Virtua - New Amazing HTML5 Template</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/components.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsee.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"owl-carousel/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"owl-carousel/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/lightcase.css\">\n");
      out.write("    <!-- CUSTOM STYLE -->      \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/template-style.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,700,900&amp;subset=latin-ext\" rel=\"stylesheet\"> \n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>   \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"size-1280\"> \n");
      out.write("    <!-- HEADER -->\n");
      out.write("    <header role=\"banner\" class=\"position-absolute\">    \n");
      out.write("      <!-- Top Navigation -->\n");
      out.write("      <nav class=\"background-transparent background-primary-dott full-width sticky\">          \n");
      out.write("        <div class=\"top-nav\"> \n");
      out.write("          <!-- mobile version logo -->              \n");
      out.write("          <div class=\"logo hide-l hide-xl hide-xxl\">\n");
      out.write("             <a href=\"index.html\" class=\"logo\">\n");
      out.write("              <!-- Logo White Version -->\n");
      out.write("              <img class=\"logo-white\" src=\"img/logPREMIIo.svg\" alt=\"\">\n");
      out.write("              <!-- Logo Dark Version -->\n");
      out.write("              <img class=\"logo-dark\" src=\"img/logo-dark.svg\" alt=\"\">\n");
      out.write("            </a>\n");
      out.write("          </div>                  \n");
      out.write("          <p class=\"nav-text\"></p>");
      out.write(" \n");
      out.write("          <main role=\"main\">\n");
      out.write("      <article>    \n");
      out.write("        <!-- Header -->\n");
      out.write("        <header class=\"section background-image text-center\" style=\"background-image:url(ProjectImg/Zeon962739.jpg)\">\n");
      out.write("          <h1 class=\"animated-element slow text-white text-s-size-40 text-m-size-40 text-size-70 text-line-height-1 margin-bottom-30 margin-top-130\">\n");
      out.write("              <b> <font style=\"color: red\">ERROR!</font></b>\n");
      out.write("          </h1>\n");
      out.write("            <b>  <p class=\"animated-element text-grey text-size-25\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.LINKBACK}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Click to go back</a></p></b>\n");
      out.write("           <!-- white full width arrow object -->\n");
      out.write("          <img class=\"arrow-object\" src=\"img/arrow-object-white.svg\" alt=\"\">\n");
      out.write("        </header>   \n");
      out.write("    <body> \n");
      out.write("    </body> \n");
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
