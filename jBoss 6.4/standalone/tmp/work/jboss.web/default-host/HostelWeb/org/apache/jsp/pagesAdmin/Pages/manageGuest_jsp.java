package org.apache.jsp.pagesAdmin.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageGuest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Admin - Manage Guest</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- MetisMenu CSS -->\r\n");
      out.write("    <link href=\"css/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- DataTables CSS -->\r\n");
      out.write("    <link href=\"css/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- DataTables Responsive CSS -->\r\n");
      out.write("    <link href=\"css/dataTables/dataTables.responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/startmin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Admin</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-right navbar-top-links\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i> Admin <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"logoutProcess.do\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- /.navbar-top-links -->\r\n");
      out.write("            <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                        <li class=\"sidebar-search\">\r\n");
      out.write("                            <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /input-group -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"indexAdmin.jsp\"><i class=\"fa fa-home fa-fw\"></i> HOME</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"listCustomer.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Guest</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"listRoom.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Room</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"listPromotion.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Promotion</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                          <li>\r\n");
      out.write("                            <a href=\"listReserv.do\"><i class=\"fa fa-table fa-fw\"></i> Manage Reservation</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"spa.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Spa</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"vehicle.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Vehicle rental</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"bookingTrip.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Booking trip</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"manageGoods.html\"><i class=\"fa fa-table fa-fw\"></i> Manage Goods</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.sidebar-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-static-side -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h1 class=\"page-header\">Manage Guest</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-12 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            Data Guest\r\n");
      out.write("                            <a href=\"customerForm.do\"><button type=\"button\" class=\"btn btn-primary btn-circle\"><i class=\"fa fa-plus\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.panel-heading -->\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"dataTable_wrapper\">\r\n");
      out.write("                            \r\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>FirstName</th>\r\n");
      out.write("                                            <th>LastName</th>\r\n");
      out.write("                                            <th>ID card</th>\r\n");
      out.write("                                            <th>Nationality</th>\r\n");
      out.write("                                            <th>Race</th>\r\n");
      out.write("                                            <th>Phone</th>\r\n");
      out.write("                                            <th>E-mail</th>         \r\n");
      out.write("                                            <th>Address</th>\r\n");
      out.write("                                            <th>Edit</th>\r\n");
      out.write("                                            <th>Delete</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.table-responsive -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.panel-body -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.panel -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-12 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /#page-wrapper -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#wrapper -->\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"js/metisMenu.min.js\"></script>\r\n");
      out.write("    <!-- DataTables JavaScript -->\r\n");
      out.write("    <script src=\"js/dataTables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"js/dataTables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"js/startmin.js\"></script>\r\n");
      out.write("    <!-- Page-Level Demo Scripts - Tables - Use for reference -->\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#dataTables-example').DataTable({\r\n");
      out.write("                responsive: true\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pagesAdmin/Pages/manageGuest.jsp(155,36) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pagesAdmin/Pages/manageGuest.jsp(155,36) '${customerList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${customerList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pagesAdmin/Pages/manageGuest.jsp(155,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("customer");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr class=\"odd gradeX\">\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custFirstname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custLastname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.regisPerson}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td> \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.nationality}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.race}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t <td class=\"center\"><a href=\"editCustomer.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.cusId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><button type=\"button\" class=\"btn btn-warning btn-circle\"><i class=\"fa fa-pencil\"></i></button></td>\r\n");
          out.write("                                            <td class=\"center\"><a href=\"deleteCustomer.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.cusId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><button onclick=\"myFunction()\" type=\"button\" class=\"btn btn-danger btn-circle\"><i class=\"fa fa-times\"></i>\r\n");
          out.write("                                                <script>\r\n");
          out.write("                                                    function myFunction() {\r\n");
          out.write("                                                        alert(\"DELET SUCCESS!\");\r\n");
          out.write("                                                    }\r\n");
          out.write("                                                </script>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}