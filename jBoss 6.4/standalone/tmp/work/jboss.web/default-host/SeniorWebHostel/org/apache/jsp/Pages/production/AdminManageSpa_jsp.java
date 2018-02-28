package org.apache.jsp.Pages.production;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminManageSpa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.release();
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
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<!DOCTYPE html>\n");
      out.write("\t\t\t\t<html lang=\"en\">\n");
      out.write("\n");
      out.write("\t\t\t\t<head>\n");
      out.write("\t\t\t\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t\t\t\t<!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("\t\t\t\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t\t\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t\t\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t\t\t\t<link rel=\"icon\" href=\"images/favicon.ico\" type=h \"image/ico\" />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<title>Admin Manage Spa</title>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Bootstrap -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t<!-- Font Awesome -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t<!-- NProgress -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t<!-- iCheck -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- bootstrap-progressbar -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t<!-- JQVMap -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\t\t\t\t\t<!-- bootstrap-daterangepicker -->\n");
      out.write("\t\t\t\t\t<link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Custom Theme Style -->\n");
      out.write("\t\t\t\t\t<link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t</head>\n");
      out.write("\n");
      out.write("\t\t\t\t<body class=\"nav-md\">\n");
      out.write("\t\t\t\t\t<div class=\"container body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main_container\">\n");
      out.write("\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SidebarAdmin.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- /top navigation -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- page content -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"right_col\" role=\"main\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"page-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"title_left\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search for...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">Go!</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_panel\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>Manage Spa</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-link\" data-toggle=\"modal\" data-target=\"#CalenderModalNew\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-plus-square\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<table id=\"\" class=\"table table-striped table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Spa Id</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Spa Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Spa Detail</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Spa Picture</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Manage</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!-- /page content -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- footer content -->\n");
      out.write("\t\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t\t<!-- /footer content -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- calendar modal -->\n");
      out.write("\t\t\t\t\t<div id=\"CalenderModalNew\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"CalenderModalEdit\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">Ã</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Edit Spa</h4>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"testmodal\" style=\"padding: 5px 20px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form id=\"antoform\" class=\"form-horizontal calender\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">SpaId</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"RoomId\" name=\"RoomId\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">SpaDetail</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" style=\"height: 55px;\" id=\"descr\" name=\"descr\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">SpaName</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"title\" name=\"title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Spa Picture</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-dark\">Update</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary antosubmit\">Save</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /calendar modal -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- jQuery -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\t\t\t\t\t<!-- Bootstrap -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t\t\t\t<!-- FastClick -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("\t\t\t\t\t<!-- NProgress -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("\t\t\t\t\t<!-- iCheck -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("\t\t\t\t\t<!-- Datatables -->\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-keytable/js/dataTables.keyTable.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/datatables.net-scroller/js/dataTables.scroller.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/jszip/dist/jszip.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/pdfmake/build/pdfmake.min.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"vendors/pdfmake/build/vfs_fonts.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Custom Theme Scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"build/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t</body>\n");
      out.write("\n");
      out.write("\t\t\t\t</html>");
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
    // /Pages/production/AdminManageSpa.jsp(96,15) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/AdminManageSpa.jsp(96,15) '${spaList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${spaList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/AdminManageSpa.jsp(96,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("spa");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaPic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"250\" height=\"250\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-info btn-xs\" data-toggle=\"modal\" data-target=\"#CalenderModalEdit\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-pencil\"></i> Edit\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a onclick=\"myFunction()\" class=\"btn btn-danger btn-xs\" href=\"deleteSpa.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-trash-o\"></i> Delete </a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<script>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction myFunction() {\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"DELET SUCCESS!\");\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /Pages/production/AdminManageSpa.jsp(140,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /Pages/production/AdminManageSpa.jsp(140,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setAction("saveSpa.do");
    // /Pages/production/AdminManageSpa.jsp(140,8) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setCommandName("spa");
    // /Pages/production/AdminManageSpa.jsp(140,8) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">xï¿½</button>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Add Spa</h4>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"testmodal\" style=\"padding: 5px 20px;\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Spa Name</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Spa Detail</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Spa Picture</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"files\" type=\"file\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Saves\" class=\"btn btn-primary antosubmit\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /Pages/production/AdminManageSpa.jsp(152,13) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setPath("spaName");
    // /Pages/production/AdminManageSpa.jsp(152,13) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
    // /Pages/production/AdminManageSpa.jsp(152,13) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageSpa.jsp(152,13) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setId("title");
    // /Pages/production/AdminManageSpa.jsp(152,13) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", "title");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /Pages/production/AdminManageSpa.jsp(159,13) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005ftextarea_005f0.setPath("spaDetail");
    // /Pages/production/AdminManageSpa.jsp(159,13) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageSpa.jsp(159,13) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "style", "height: 55px;");
    // /Pages/production/AdminManageSpa.jsp(159,13) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005ftextarea_005f0.setId("descr");
    // /Pages/production/AdminManageSpa.jsp(159,13) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "name", "descr");
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }
}
