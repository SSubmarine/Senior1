package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminManageOrderProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"icon\" href=\"images/favicon.ico\" type=h\"image/ico\" />\n");
      out.write("\n");
      out.write("    <title>Admin Manage Book Product</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <link href=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SidebarAdmin.jsp", out, false);
      out.write("\n");
      out.write("        <!-- /top navigation -->\n");
      out.write("\n");
      out.write("        <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">\n");
      out.write("              <div class=\"title_left\"></div>\n");
      out.write("\n");
      out.write("              <div class=\"\">\n");
      out.write("                <div class=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\">\n");
      out.write("                    <span class=\"input-group-btn\">\n");
      out.write("                      <button class=\"btn btn-default\" type=\"button\">Go!</button>\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Management Order Product</h2>\n");
      out.write("                    \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    \n");
      out.write("                    <table id=\"\" class=\"table table-striped table-bordered\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>BookProductId</th>\n");
      out.write("                          <th>ProductId</th>\n");
      out.write("                          <th>Product Booking Date</th>\n");
      out.write("                          <th>Product Price</th> \n");
      out.write("                          <th>Unit</th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                      <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                          <td>Tiger Nixon</td>\n");
      out.write("                          <td>System Architect</td>\n");
      out.write("                          <td>Edinburgh</td>\n");
      out.write("                          <td>61</td>\n");
      out.write("                          <td>61</td>\n");
      out.write("                        </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /page content -->\n");
      out.write("\n");
      out.write("         <!-- footer content -->\n");
      out.write("         <footer>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("    <!-- Datatables -->\n");
      out.write("    <script src=\"vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-keytable/js/dataTables.keyTable.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-scroller/js/dataTables.scroller.min.js\"></script>\n");
      out.write("    <script src=\"vendors/jszip/dist/jszip.min.js\"></script>\n");
      out.write("    <script src=\"vendors/pdfmake/build/pdfmake.min.js\"></script>\n");
      out.write("    <script src=\"vendors/pdfmake/build/vfs_fonts.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  \n");
      out.write("</html>");
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
