package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <body class=\"size-1280\">\n");
      out.write("    <!-- PREMIUM FEATURES BUTTON -->\n");
      out.write("  \t<a target=\"_blank\" class=\"hide-s\" href=\"../template/virtua-premium-responsive-business-template/\" style=\"position:fixed;top:120px;right:-14px;z-index:10;\"><img src=\"img/premium-features.png\" alt=\"\"></a>\n");
      out.write("    <!-- HEADER -->\n");
      out.write("    <header role=\"banner\" class=\"position-absolute\">    \n");
      out.write("      <!-- Top Navigation -->\n");
      out.write("      <nav class=\"background-transparent background-primary-dott full-width sticky\">          \n");
      out.write("        <div class=\"top-nav\"> \n");
      out.write("          <!-- mobile version logo -->              \n");
      out.write("          <div class=\"logo hide-l hide-xl hide-xxl\">\n");
      out.write("             <a href=\"index.html\" class=\"logo\">\n");
      out.write("              <!-- Logo White Version -->\n");
      out.write("              <img class=\"logo-white\" src=\"img/logo.svg\" alt=\"\">\n");
      out.write("              <!-- Logo Dark Version -->\n");
      out.write("              <img class=\"logo-dark\" src=\"img/logo-dark.svg\" alt=\"\">\n");
      out.write("            </a>\n");
      out.write("          </div>                  \n");
      out.write("          <p class=\"nav-text\"></p>\n");
      out.write("          \n");
      out.write("          <!-- left menu items -->\n");
      out.write("          <div class=\"top-nav left-menu\">\n");
      out.write("             <ul class=\"right top-ul chevron\">\n");
      out.write("                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"about-us.html\">About Us</a></li>\n");
      out.write("                <li><a href=\"services.html\">Our Services</a></li>\n");
      out.write("             </ul>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <!-- logo -->\n");
      out.write("          <ul class=\"logo-menu\">\n");
      out.write("            <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("              <!-- Logo White Version -->\n");
      out.write("              <img class=\"logo-white\" src=\"img/logo.svg\" alt=\"\">\n");
      out.write("              <!-- Logo Dark Version -->\n");
      out.write("              <img class=\"logo-dark\" src=\"img/logo-dark.svg\" alt=\"\">\n");
      out.write("            </a>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("          <!-- right menu items -->\n");
      out.write("          <div class=\"top-nav right-menu\">\n");
      out.write("             <ul class=\"top-ul chevron\">\n");
      out.write("                <li>\n");
      out.write("                  <a>Products</a>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a>Product 1</a></li>\n");
      out.write("                    <li><a>Product 2</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"gallery.html\">Gallery</a></li>\n");
      out.write("                <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("             </ul> \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("     <!-- MAIN -->\n");
      out.write("    <main role=\"main\">\n");
      out.write("      <article>    \n");
      out.write("        <!-- Header -->\n");
      out.write("        <header class=\"section background-image text-center\" style=\"background-image:url(ProjectImg/Gundam_exceed_wallpaper.jpg)\">\n");
      out.write("          <h1 class=\"animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130\">\n");
      out.write("            Gundam Zeon Mobile\n");
      out.write("          </h1>\n");
      out.write("          <p class=\"animated-element text-white\">Principality of Zeon (ジオン公国, Jion Koukoku)</p>\n");
      out.write("           <!-- white full width arrow object -->\n");
      out.write("          <img class=\"arrow-object\" src=\"img/arrow-object-white.svg\" alt=\"\">\n");
      out.write("        </header>\n");
      out.write("         \n");
      out.write("        <!-- Section 1 -->\n");
      out.write("        <section class=\"section background-white\">\n");
      out.write("          <div class=\"line text-center\">\n");
      out.write("            <i class=\"icon-sli-heart text-primary text-size-40\"></i>\n");
      out.write("            <h2 class=\"text-dark text-size-50 text-m-size-40\">Log In</b></h2>\n");
      out.write("            <hr class=\"break background-primary break-small break-center margin-bottom-50\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"line\">\n");
      out.write("            <div class=\"margin2x\">\n");
      out.write("              <div class=\"m-12 l-6 margin-m-bottom-30\">\n");
      out.write("                <form action=\"MainController\" method=\"POST\" style=\"margin: 0 auto\"> \n");
      out.write("            <table> \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20\">Your ID:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtUsername\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20\">Password:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"txtPassword\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"align:center\" colspan=\"2\"><input type=\"submit\" value=\"Log In\" name=\"act\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table> \n");
      out.write(" \n");
      out.write("        </form> \n");
      out.write("              </div>          \n");
      out.write("              <div class=\"m-12 l-6\">\n");
      out.write("                <img src=\"ProjectImg/6688_-_flag_gundam_sieg_zeon_zeon.jpg\" alt=\"\">\n");
      out.write("              </div>\n");
      out.write("            </div>    \n");
      out.write("          </div>  \n");
      out.write("        </section>      \n");
      out.write("      </article>\n");
      out.write("    </main>");
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
