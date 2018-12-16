package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Account</title>\n");
      out.write("        ");
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
      out.write("          <p class=\"nav-text\"></p>\n");
      out.write("          \n");
      out.write("          <!-- left menu items -->\n");
      out.write("          \n");
      out.write("          <div class=\"top-nav left-menu\">\n");
      out.write("             <ul class=\"right top-ul chevron\">\n");
      out.write("<!--                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"about-us.html\">About Us</a></li>-->\n");
      out.write("                <li><a href=\"http://gundam.wikia.com/wiki/Principality_of_Zeon\">Information</a></li>\n");
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
      out.write("          \n");
      out.write("          <div class=\"top-nav right-menu\">\n");
      out.write("             <ul class=\"top-ul chevron\">\n");
      out.write("<!--                <li>\n");
      out.write("                  <a>Products</a>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a>Product 1</a></li>\n");
      out.write("                    <li><a>Product 2</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"gallery.html\">Gallery</a></li>-->\n");
      out.write("                <li><a href=\"account.jsp\">Create account</a></li>\n");
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
      out.write("         ");
      out.write("\n");
      out.write("    </head> \n");
      out.write("     <section class=\"section background-white\">\n");
      out.write("          <div class=\"line text-center\">\n");
      out.write("            <i class=\"icon-sli-heart text-primary text-size-40\"></i>\n");
      out.write("            <h4 class=\"text-dark text-size-40 text-m-size-40\" style=\"color: crimson\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></h4>\n");
      out.write("            <hr class=\"break background-primary break-small break-center margin-bottom-50\">\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    <!-- Section 3 -->\n");
      out.write("    <section class=\"section background-dark\"> \n");
      out.write("        <div class=\"s-12 m-12 l-4 center\">\n");
      out.write("            <h3 class=\"text-size-30 margin-bottom-40 text-center\"><b>Register Form</b></h3>\n");
      out.write("            <form class=\"customform\" method=\"post\" action=\"MainController\">\n");
      out.write("                <div class=\"line\"> \n");
      out.write("                    <div class=\"s-12\">\n");
      out.write("                        <input name=\"txtnewUsername\" placeholder=\"Username\" type=\"text\" class=\"text-white\" />\n");
      out.write("                        <font style=\"color: red\">\n");
      out.write("                            <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </font>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"s-12\">\n");
      out.write("                        <input name=\"txtnewFullname\"  placeholder=\"Fullname\" type=\"text\" class=\"text-white\" />\n");
      out.write("                            <font style=\"color: red\">\n");
      out.write("                            <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidFullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </font>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"line\">\n");
      out.write("                    <div class=\"margin\">\n");
      out.write("                        <div class=\"s-12 m-12 l-6\">\n");
      out.write("                            <input name=\"txtnewPassword\" placeholder=\"Password\" type=\"password\" class=\"text-white\" />\n");
      out.write("                            <font color=\"red\">\n");
      out.write("                            <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidPassword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </font>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"s-12 m-12 l-6\">\n");
      out.write("                            <input name=\"txtRePassword\"  placeholder=\"RePassword\" type=\"password\" class=\"text-white\" />\n");
      out.write("                            <font color=\"red\">\n");
      out.write("                            <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidRePass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </font>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("                <div class=\"line\">   \n");
      out.write("                    <div class=\"s-12\"> \n");
      out.write("                        <button class=\"button border-radius text-white background-primary\" type=\"submit\" value=\"Regist\" name=\"act\">Regist</button></div>\n");
      out.write("                </div>    \n");
      out.write("            </form>\n");
      out.write("        </div>           \n");
      out.write("    </section>\n");
      out.write("</article>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- FOOTER -->\n");
      out.write("    <footer>\n");
      out.write("      <!-- Social -->\n");
      out.write("<!--      <div class=\"background-primary padding text-center\">\n");
      out.write("        <a href=\"/\"><i class=\"icon-facebook_circle text-size-25 text-dark\"></i></a> \n");
      out.write("        <a href=\"/\"><i class=\"icon-twitter_circle text-size-25 text-dark\"></i></a>\n");
      out.write("        <a href=\"/\"><i class=\"icon-google_plus_circle text-size-25 text-dark\"></i></a>\n");
      out.write("        <a href=\"/\"><i class=\"icon-instagram_circle text-size-25 text-dark\"></i></a> \n");
      out.write("        <a href=\"/\"><i class=\"icon-linked_in_circle text-size-25 text-dark\"></i></a>                                                                       \n");
      out.write("      </div>-->\n");
      out.write("      <!-- Main Footer -->\n");
      out.write("      <section class=\"section background-dark\">\n");
      out.write("        <div class=\"line\"> \n");
      out.write("          <div class=\"margin2x\">\n");
      out.write("            <div class=\"s-12 m-6 l-3 xl-5\">\n");
      out.write("               <h4 class=\"text-white text-strong\">Our Principality</h4>\n");
      out.write("               <p>  \n");
      out.write("                   <b class=\"text-size-20\">The Principality of Zeon </b>, also referred to as the <b class=\"text-size-20\"> Duchy of Zeon</b>  and<b class=\"text-size-20\"> Zeon Dukedom</b>, is a nation featured in Mobile Suit Gundam. It was in control of the colonies of Side 3 and fought against the Earth Federation during the One Year War.\n");
      out.write("       \n");
      out.write("               </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"s-12 m-6 l-3 xl-2\">\n");
      out.write("               <h4 class=\"text-white text-strong margin-m-top-30\">Refenrence Links</h4>\n");
      out.write("               <a class=\"text-primary-hover\" href=\"http://gundam.wikia.com/wiki/Principality_of_Zeon\">Wiki Zeon</a><br>      \n");
      out.write("               <a class=\"text-primary-hover\" href=\"http://gundam.wikia.com/wiki/List_of_Mobile_Weapons\">Wiki Weapon</a><br> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"s-12 m-6 l-3 xl-2\">\n");
      out.write("               <h4 class=\"text-white text-strong margin-m-top-30\">Term of Use</h4>\n");
      out.write("               <a class=\"text-primary-hover\" href=\"file:///D:/HHTT/template/index.html\">Terms and Conditions</a><br>\n");
      out.write("               <a class=\"text-primary-hover\" href=\"file:///D:/HHTT/template/index.html\">Refund Policy</a><br>\n");
      out.write("               <a class=\"text-primary-hover\" href=\"file:///D:/HHTT/template/index.html\">Disclaimer</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"s-12 m-6 l-3 xl-3\">\n");
      out.write("               <h4 class=\"text-white text-strong margin-m-top-30\">Contact Us</h4>\n");
      out.write("                <p><i class=\"icon-sli-screen-smartphone text-primary\"></i>0964 0101 40</p>\n");
      out.write("                <a class=\"text-primary-hover\" href=\"mailto:contact@sampledomain.com\"><i class=\"icon-sli-mouse text-primary\"></i> hatasatori514@gmail.com</a><br>\n");
      out.write("                <a class=\"text-primary-hover\" href=\"mailto:office@sampledomain.com\"><i class=\"icon-sli-mouse text-primary\"></i> tranghhtse63405@fpt.edu.vn</a>\n");
      out.write("            </div>\n");
      out.write("          </div>  \n");
      out.write("        </div>    \n");
      out.write("      </section>\n");
      out.write("      <div class=\"background-dark\">\n");
      out.write("         <div class=\"line\">\n");
      out.write("            <hr class=\"break margin-top-bottom-0\" style=\"border-color: #777;\">\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Bottom Footer -->\n");
      out.write("      <section class=\"padding-2x background-dark full-width\">\n");
      out.write("        <div class=\"line\">\n");
      out.write("          <div class=\"s-12 l-6\">\n");
      out.write("            <p class=\"text-size-12\">Copyright 2018, Vision Design - graphic zoo</p>\n");
      out.write("            <p class=\"text-size-12\">All images have been purchased from Bigstock. Do not use the images in your website.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"s-12 l-6\">\n");
      out.write("            <a class=\"right text-size-12 text-primary-hover\" href=\"http://www.myresponsee.com\" title=\"Responsee - lightweight responsive framework\">Design and coding<br> by Responsee Team</a>\n");
      out.write("          </div>\n");
      out.write("        </div>  \n");
      out.write("      </section>\n");
      out.write("    </footer>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/responsee.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"owl-carousel/owl.carousel.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/template-scripts.js\"></script> \n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
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
