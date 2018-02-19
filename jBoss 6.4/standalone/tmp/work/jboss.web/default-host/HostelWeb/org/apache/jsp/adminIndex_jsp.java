package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<title>Admin - Home</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"pagesAdmin/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- MetisMenu CSS -->\n");
      out.write("<link href=\"pagesAdmin/css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Timeline CSS -->\n");
      out.write("<link href=\"pagesAdmin/css/timeline.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"pagesAdmin/css/startmin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Morris Charts CSS -->\n");
      out.write("<link href=\"pagesAdmin/css/morris.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"pagesAdmin/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t\t<!-- Navigation -->\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.html\">Admin</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\".navbar-collapse\">\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"nav navbar-right navbar-top-links\">\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>\n");
      out.write("\t\t\t\t\tAdmin <b class=\"caret\"></b>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\tLogout</a></li>\n");
      out.write("\t\t\t\t</ul></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- /.navbar-top-links -->\n");
      out.write("\t\t<div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("\t\t\t<div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav\" id=\"side-menu\">\n");
      out.write("\t\t\t\t\t<li class=\"sidebar-search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group custom-search-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div> <!-- /input-group -->\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\"><i class=\"fa fa-home fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\tHOME</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"manageGuest.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-table fa-fw\"></i> Manage Guest</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"manageRoom.html\"><i class=\"fa fa-table fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\tManage Room</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"managePromotion.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-table fa-fw\"></i> Manage Promotion</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"spa.html\"><i class=\"fa fa-table fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\tManage Spa</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"vehicle.html\"><i class=\"fa fa-table fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\tManage Vehicle rental</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"bookingTrip.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-table fa-fw\"></i> Manage Booking trip</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"manageGoods.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-table fa-fw\"></i> Manage Goods</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<h1 class=\"page-header\"></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.col-lg-12 -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.row -->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-leaf fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"huge\">26</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Spa</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-green\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-car fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"huge\">12</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Reservation</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-yellow\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"huge\">124</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Goods</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-red\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-bullhorn fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"huge\">13</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Trip</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.row -->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-8\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bar-chart-o fa-fw\"></i> Number of Customer per\n");
      out.write("\t\t\t\t\t\t\tmonth\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /.panel-heading -->\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"morris-area-chart\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /.panel-body -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.panel -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.row -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /#page-wrapper -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"pagesAdmin/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t<script src=\"pagesAdmin/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Metis Menu Plugin JavaScript -->\n");
      out.write("\t<script src=\"pagesAdmin/js/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Morris Charts JavaScript -->\n");
      out.write("\t<script src=\"pagesAdmin/js/raphael.min.js\"></script>\n");
      out.write("\t<script src=\"pagesAdmin/js/morris.min.js\"></script>\n");
      out.write("\t<script src=\"pagesAdmin/js/morris-data.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom Theme JavaScript -->\n");
      out.write("\t<script src=\"pagesAdmin/js/startmin.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
