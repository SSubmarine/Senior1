package org.apache.jsp.Pages.production;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminManageTrip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\" type=h \"image/ico\" />\n");
      out.write("\n");
      out.write("<title>Admin Manage Trip</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link href=\"vendors/font-awesome/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!-- NProgress -->\n");
      out.write("<link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("<!-- iCheck -->\n");
      out.write("<link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- bootstrap-progressbar -->\n");
      out.write("<link\n");
      out.write("\thref=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!-- JQVMap -->\n");
      out.write("<link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\" />\n");
      out.write("<!-- bootstrap-daterangepicker -->\n");
      out.write("<link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Theme Style -->\n");
      out.write("<link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"nav-md\">\n");
      out.write("\t<div class=\"container body\">\n");
      out.write("\t\t<div class=\"main_container\">\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SidebarAdmin.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t<!-- /top navigation -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- page content -->\n");
      out.write("\t\t\t<div class=\"right_col\" role=\"main\">\n");
      out.write("\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t<div class=\"page-title\">\n");
      out.write("\t\t\t\t\t\t<div class=\"title_left\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Search for...\"> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">Go!</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"x_panel\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Manage Trip</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a class=\"btn btn-link\" data-toggle=\"modal\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-target=\"#CalenderModalNew\"> <i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-plus-square\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"\" class=\"table table-striped table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>TripId</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Trip Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Trip Detail</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Trip Picture</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Manage</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /page content -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- footer content -->\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t\t<!-- /footer content -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- calendar modal -->\n");
      out.write("\t<div id=\"CalenderModalNew\" class=\"modal fade\" tabindex=\"-1\"\n");
      out.write("\t\trole=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"CalenderModalEdit\" class=\"modal fade\" tabindex=\"-1\"\n");
      out.write("\t\trole=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_form_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /calendar modal -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- FastClick -->\n");
      out.write("\t<script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("\t<!-- NProgress -->\n");
      out.write("\t<script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("\t<!-- iCheck -->\n");
      out.write("\t<script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("\t<!-- Datatables -->\n");
      out.write("\t<script src=\"vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-keytable/js/dataTables.keyTable.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"vendors/datatables.net-scroller/js/dataTables.scroller.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/jszip/dist/jszip.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/pdfmake/build/pdfmake.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/pdfmake/build/vfs_fonts.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom Theme Scripts -->\n");
      out.write("\t<script src=\"build/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
    // /Pages/production/AdminManageTrip.jsp(101,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/AdminManageTrip.jsp(101,11) '${tripList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${tripList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/AdminManageTrip.jsp(101,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("trip");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Picture</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a class=\"btn btn-info btn-xs\" data-toggle=\"modal\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-target=\"#CalenderModalEdit\"><i\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-pencil\"></i> Edit\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a> <a onclick=\"myFunction()\" class=\"btn btn-danger btn-xs\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"deleteTrip.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><i\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-trash-o\"></i> Delete </a> <script>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction myFunction() {\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"DELET SUCCESS!\");\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script></td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
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
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /Pages/production/AdminManageTrip.jsp(143,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /Pages/production/AdminManageTrip.jsp(143,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setAction("saveTrip.do");
    // /Pages/production/AdminManageTrip.jsp(143,4) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setCommandName("trip");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
          out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
          out.write("\t\t\t\t\t\t\taria-hidden=\"true\">x</button>\n");
          out.write("\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Add Trip</h4>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
          out.write("\t\t\t\t\t\t<div id=\"testmodal\" style=\"padding: 5px 20px;\">\n");
          out.write("\t\t\t\t\t\t\t<form id=\"antoform\" class=\"form-horizontal calender\" role=\"form\">\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Trip Name</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t ");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Trip Detail</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Promotion Picture</label>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-dark\">Update</button>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
          out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary antosubmit\">Save</button>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
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
    // /Pages/production/AdminManageTrip.jsp(156,9) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setPath("tripName");
    // /Pages/production/AdminManageTrip.jsp(156,9) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
    // /Pages/production/AdminManageTrip.jsp(156,9) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageTrip.jsp(156,9) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setId("title");
    // /Pages/production/AdminManageTrip.jsp(156,9) null
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

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /Pages/production/AdminManageTrip.jsp(163,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setPath("tripDetail");
    // /Pages/production/AdminManageTrip.jsp(163,10) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "text");
    // /Pages/production/AdminManageTrip.jsp(163,10) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageTrip.jsp(163,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setId("title");
    // /Pages/production/AdminManageTrip.jsp(163,10) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", "title");
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f1.setParent(null);
    // /Pages/production/AdminManageTrip.jsp(188,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setMethod("post");
    // /Pages/production/AdminManageTrip.jsp(188,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setAction("saveTrip.do");
    // /Pages/production/AdminManageTrip.jsp(188,4) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setCommandName("trip");
    int[] _jspx_push_body_count_form_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f1 = _jspx_th_form_005fform_005f1.doStartTag();
      if (_jspx_eval_form_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"modal-header\">\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
          out.write("\t\t\t\t\t\taria-hidden=\"true\">Close</button>\n");
          out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Edit Trip</h4>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t<div class=\"modal-body\">\n");
          out.write("\t\t\t\t\t<div id=\"testmodal\" style=\"padding: 5px 20px;\">\n");
          out.write("\t\t\t\t\t\t<form id=\"antoform\" class=\"form-horizontal calender\" role=\"form\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Trip Name</label>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Trip Detail</label>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\"> Picture</label>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-dark\">Update</button>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</form>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t<div class=\"modal-footer\">\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary antosubmit\">Save</button>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /Pages/production/AdminManageTrip.jsp(200,9) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f2.setPath("tripName");
    // /Pages/production/AdminManageTrip.jsp(200,9) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", "text");
    // /Pages/production/AdminManageTrip.jsp(200,9) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageTrip.jsp(200,9) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f2.setId("title");
    // /Pages/production/AdminManageTrip.jsp(200,9) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", "title");
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /Pages/production/AdminManageTrip.jsp(206,9) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f3.setPath("tripDetail");
    // /Pages/production/AdminManageTrip.jsp(206,9) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", "text");
    // /Pages/production/AdminManageTrip.jsp(206,9) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "class", "form-control");
    // /Pages/production/AdminManageTrip.jsp(206,9) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f3.setId("title");
    // /Pages/production/AdminManageTrip.jsp(206,9) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "name", "title");
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }
}
