package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SidebarAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("                <html>\r\n");
      out.write("\r\n");
      out.write("                <head>\r\n");
      out.write("                    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("                    <!-- Meta, title, CSS, favicons, etc. -->\r\n");
      out.write("                    <meta charset=\"utf-8\">\r\n");
      out.write("                    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("                    <link rel=\"icon\" href=\"images/favicon.ico\" type=h \"image/ico\" />\r\n");
      out.write("\r\n");
      out.write("                    <title>Admin Manage Book Product</title>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Bootstrap -->\r\n");
      out.write("                    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                    <!-- Font Awesome -->\r\n");
      out.write("                    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                    <!-- NProgress -->\r\n");
      out.write("                    <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\r\n");
      out.write("                    <!-- iCheck -->\r\n");
      out.write("                    <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- bootstrap-progressbar -->\r\n");
      out.write("                    <link href=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                    <!-- JQVMap -->\r\n");
      out.write("                    <link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("                    <!-- bootstrap-daterangepicker -->\r\n");
      out.write("                    <link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Custom Theme Style -->\r\n");
      out.write("                    <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                </head>\r\n");
      out.write("\r\n");
      out.write("                <body>\r\n");
      out.write("                    <div class=\"col-md-3 left_col\">\r\n");
      out.write("                        <div class=\"left_col scroll-view\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- sidebar menu -->\r\n");
      out.write("                            <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("                                <div class=\"menu_section\">\r\n");
      out.write("                                    <ul class=\"nav side-menu\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"AdminHome.html\">\r\n");
      out.write("                                                <i class=\"fa fa-home\"></i> Home </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"listRoom.do\">\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Room </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a>\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Service\r\n");
      out.write("                                                <span class=\"fa fa-chevron-down\"></span>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <ul class=\"nav child_menu\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listSpa.do\">Manage Spa</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listProduct.do\">Manage Product</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listTrip.do\">Manage Trip</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"listMember.do\">\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Member </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"listGuest.do\">\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Guest </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"listPromotion.do\">\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Promotion </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a>\r\n");
      out.write("                                                <i class=\"fa fa-table\"></i> Manage Booking\r\n");
      out.write("                                                <span class=\"fa fa-chevron-down\"></span>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <ul class=\"nav child_menu\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listBookRoom.do\">Manage Book Room</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listBookSpa.do\">Manage Book Spa</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listOrderProduct.do\">Manage Order Product</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"listBookTrip.do\">Manage Book Trip</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"listBill.do\">\r\n");
      out.write("                                                <i class=\"fa fa-check\"></i> Confirm Payment </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /sidebar menu -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- top navigation -->\r\n");
      out.write("                    <div class=\"top_nav\">\r\n");
      out.write("                        <div class=\"nav_menu\">\r\n");
      out.write("                            <nav>\r\n");
      out.write("                                <div class=\"nav toggle\">\r\n");
      out.write("                                    <a id=\"menu_toggle\">\r\n");
      out.write("                                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                            <i class=\"fa fa-user\" alt=\"\"> Admin</i>\r\n");
      out.write("                                            <span class=\" fa fa-angle-down\"></span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"AdminLogin.html\">\r\n");
      out.write("                                                    <i class=\"fa fa-sign-out pull-right\"></i> Log Out</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /top navigation -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- Custom Theme Scripts -->\r\n");
      out.write("                    <script src=\"build/js/custom.min.js \"></script>\r\n");
      out.write("                </body>\r\n");
      out.write("\r\n");
      out.write("                </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
