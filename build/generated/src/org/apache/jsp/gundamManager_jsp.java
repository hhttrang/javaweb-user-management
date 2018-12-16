package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gundamManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/headerforall1.jsp");
    _jspx_dependants.add("/barforLeader.jsp");
    _jspx_dependants.add("/headerforall2.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <title>Gundam Manager</title>\n");
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
      out.write("\n");
      out.write("        ");
      out.write("    <!-- left menu items -->\n");
      out.write("          \n");
      out.write("          <div class=\"top-nav left-menu\">\n");
      out.write("             <ul class=\"right top-ul chevron\">\n");
      out.write("                <li><a href=\"gundamManager.jsp\">Gundam</a></li>\n");
      out.write("                <li><a href=\"weaponManager.jsp\">Weapon</a></li>\n");
      out.write("                <li><a href=\"pilotManager.jsp\">Pilots</a></li>\n");
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
      out.write("                 <li><a href=\"missionManager.jsp\">Add Mission</a></li>\n");
      out.write("                <li><a href=\"MainController?act=View&viewMissionforLeader=yes\">View Mission</a></li>\n");
      out.write("                <li><a href=\"MainController?act=Log Out\">Log Out</a></li>\n");
      out.write("             </ul> \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>     \n");
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
      out.write("        </header> \n");
      out.write("        \n");
      out.write("          ");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <section class=\"section background-white\">\n");
      out.write("        <div class=\"line text-center\">\n");
      out.write("            <i class=\"icon-sli-heart text-primary text-size-40\"></i>\n");
      out.write("            <h4 class=\"text-crimson text-size-40 text-m-size-40\" style=\"color: crimson\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></h4>\n");
      out.write("            <hr class=\"break background-primary break-small break-center margin-bottom-50\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"line text-center text-dark text-size-20 text-m-size-20\">\n");
      out.write("            <form action=\"MainController\" class=\"customform\" >\n");
      out.write("                <div class=\"line\">  Search Gundam Name:  </div> \n");
      out.write("                <div class=\"line\"><input type=\"text\" name=\"txtSearchGundam\" value=\"\" style=\"width: 50%; text-align:center;\" /> </div>  \n");
      out.write("                <div class=\"line\"> <input type=\"submit\" value=\"Search\" name=\"act\" style=\"width: 50%\" /></div>  \n");
      out.write("            </form>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"line text-center text-dark text-size-30 text-m-size-30\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"section background-dark\" style=\"background-image:url(ProjectImg/gundamCreate.jpg)\"> \n");
      out.write("    <div class=\"s-12 m-12 l-4 center\">\n");
      out.write("        <h3 class=\"text-size-30 margin-bottom-40 text-center\"><b>Create New Gundam</b></h3>\n");
      out.write("        <form class=\"customform text-size-10\" method=\"post\" action=\"MainController\">\n");
      out.write("            <div class=\"line\"> \n");
      out.write("                <div class=\"s-12\">\n");
      out.write("                    <input name=\"txtGundamId\" placeholder=\"Model ID\" type=\"text\" class=\"text-white\" style=\"font-size: 20px;\" />\n");
      out.write("                    <font style=\"color: red\">\n");
      out.write("                    <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidGundamId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </font>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"s-12\">\n");
      out.write("                    <input name=\"txtGundamName\"  placeholder=\"Model Full Name\" type=\"text\" class=\"text-white\" style=\"font-size: 20px;\"  />\n");
      out.write("                    <font style=\"color: red\">\n");
      out.write("                    <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidGundamName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </font>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"s-12\" > \n");
      out.write("                    <select name=\"GundamtypeList\" class=\"text-white\" style=\"font-size: 15px;\" >\n");
      out.write("                        <option value=\"Armor\">Mobile Armor</option> \n");
      out.write("                        <option value=\"MobileSuit\">Mobile Suit</option> \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"line\">\n");
      out.write("                <div class=\"margin\">\n");
      out.write("                    <div class=\"s-12 m-12 l-6\">\n");
      out.write("                        Height:\n");
      out.write("                        <input name=\"txtGundamHeight\" value=\"0\" min=\"0.01\" placeholder=\"Height:\" type=\"number\" class=\"text-white\" style=\"font-size: 20px;\" /> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"s-12 m-12 l-6\">\n");
      out.write("                        Weight:\n");
      out.write("                        <input name=\"txtGundamWeight\" value=\"0\" min=\"0.01\" placeholder=\"Weight:\" type=\"number\" class=\"text-white\" style=\"font-size: 20px;\" /> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>      \n");
      out.write("            <div class=\"line\">  \n");
      out.write("                <div class=\"s-12\">\n");
      out.write("                    <textarea name=\"txtGundamDes\" placeholder=\"Description\" rows=\"3\"  class=\"text-white\" style=\"font-size: 20px;\" ></textarea>\n");
      out.write("                    <font style=\"color: red\">\n");
      out.write("                    <br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.invalidGundamDes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </font>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"s-12\">\n");
      out.write("                    Choose Weapon: \n");
      out.write("                    <select name=\"weaponList\" class=\"text-white\" style=\"font-size: 15px;\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"s-12\"> \n");
      out.write("                    <button class=\"button border-radius text-white background-primary\" type=\"submit\" value=\"Add\" name=\"act\">Add</button></div>\n");
      out.write("            </div>    \n");
      out.write("        </form>\n");
      out.write("    </div>           \n");
      out.write("</section>\n");
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
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.txtSearchGundam != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <h3>Result</h3>\n");
        out.write("                ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.listSearch}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                    ");
        out.write("\n");
        out.write("                    <table border=\"1\">\n");
        out.write("                        <thead>\n");
        out.write("                            <tr>\n");
        out.write("                                <th>No.</th>\n");
        out.write("                                <th>Image</th>\n");
        out.write("                                <th>Model ID</th>\n");
        out.write("                                <th>Model Name</th>\n");
        out.write("                                <th>Classification</th> \n");
        out.write("                                <th>Height</th>\n");
        out.write("                                <th>Weight</th>\n");
        out.write("                                <th colspan=\"2\"></th>  \n");
        out.write("                            </tr>\n");
        out.write("                        </thead>\n");
        out.write("                        <tbody>\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </tbody>\n");
        out.write("                        </table>");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listSearch}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("dto");
    _jspx_th_c_forEach_0.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <form action=\"MainController\"> \n");
          out.write("                                <tr> \n");
          out.write("                                <input type=\"hidden\" name=\"txtLastSearch\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.txtSearchGundam}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" ></td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.modelNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    <input type=\"hidden\" name=\"txtGundamId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.modelNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"txtEditName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.officialName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                </td> \n");
          out.write("                                <td> \n");
          out.write("                                    <input type=\"hidden\" name=\"txtClass\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.classification}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("  \n");
          out.write("                                </td> \n");
          out.write("                                <td><input type=\"number\"   name=\"txtEditHeight\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.height}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" step=\"0.01\" style=\"width: 50px\" /></td>\n");
          out.write("                                <td><input type=\"number\"  name=\"txtEditWeight\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" step=\"0.01\" style=\"width: 50px\" /></td> \n");
          out.write("                                <td><input type=\"submit\" value=\"Edit\" name=\"act\" /> </td>\n");
          out.write("                                <td><input type=\"submit\" value=\"Delete\" name=\"act\" /> </td>\n");
          out.write("                                </tr></form>");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.classification eq 'Armor     '}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                        <select name=\"GundamtypeEditList\">\n");
        out.write("                                            <option value=\"Armor\">Mobile Armor</option> \n");
        out.write("                                            <option value=\"MobileSuit\">Mobile Suit</option> \n");
        out.write("                                        </select>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.classification eq 'MobileSuit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                        <select name=\"GundamtypeEditList\">\n");
        out.write("                                            <option value=\"MobileSuit\">Mobile Suit</option> \n");
        out.write("                                            <option value=\"Armor\">Mobile Armor</option>   \n");
        out.write("                                        </select>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listSearch == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<font style=\"color: red\">Not found gundam</font>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("weaponList1");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.WEAPONLIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${weaponList1.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${weaponList1.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option> \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
