package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Admin - Home</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Timeline CSS -->\n");
      out.write("        <link href=\"css/timeline.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/startmin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Morris Charts CSS -->\n");
      out.write("        <link href=\"css/morris.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">Admin</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-right navbar-top-links\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i> Admin <b class=\"caret\"></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"logoutProcess.do\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- /.navbar-top-links -->\n");
      out.write("                <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                        <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                            <li class=\"sidebar-search\">\n");
      out.write("                                <div class=\"input-group custom-search-form\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                            <i class=\"fa fa-search\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                </span>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /input-group -->\n");
      out.write("                                    </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"indexAdmin.jsp\"><i class=\"fa fa-home fa-fw\"></i> HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listCustomer.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Guest</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listRoom.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Room</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listBed.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Bed</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listPromotion.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Promotion</a>\n");
      out.write("                        </li>\n");
      out.write("                          <li>\n");
      out.write("                            <a href=\"listReserv.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Reservation</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"spa.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Spa</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"vehicle.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Vehicle rental</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"bookingTrip.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Booking trip</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"manageGoods.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Goods</a>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\"></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-leaf fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">26</div>\n");
      out.write("                                        <div>Spa</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-green\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-car fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">12</div>\n");
      out.write("                                        <div>Reservation</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-yellow\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">124</div>\n");
      out.write("                                        <div>Goods</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-red\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-bullhorn fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">13</div>\n");
      out.write("                                        <div>Trip</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <i class=\"fa fa-bar-chart-o fa-fw\"></i> Number of Customer per month\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div id=\"morris-area-chart\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("        <script src=\"js/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Morris Charts JavaScript -->\n");
      out.write("        <script src=\"js/raphael.min.js\"></script>\n");
      out.write("        <script src=\"js/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/morris-data.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"js/startmin.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
