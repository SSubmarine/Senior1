package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class billroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
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

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("Template Name: Gogopo\r\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\r\n");
      out.write("Author URI: http://www.os-templates.com/\r\n");
      out.write("Licence: Free to use under our free template licence terms\r\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"\">\r\n");
      out.write("<!-- To declare your language - read more here: https://www.w3.org/International/questions/qa-html-language-declarations -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bill ROOM</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("<link href=\"layout/styles/billeasy-responsive-tabs.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"layout/styles/billfont-awesome.min.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"layout/styles/billstyle.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"css/popup.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"css/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("<link href=\"css/css/style.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- Top Background Image Wrapper -->\r\n");
      out.write("\t<div class=\"bgded\"\r\n");
      out.write("\t\tstyle=\"background-image: url('images/demo/backgrounds/01.jpg');\">\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t<div class=\"wrapper row1\">\r\n");
      out.write("\t\t\t<header id=\"header\" class=\"hoc clear\">\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t\t<div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"loginForm.do\">Hostel</a>\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<nav id=\"mainav\" class=\"fl_right\">\r\n");
      out.write("\t\t\t\t\t");

						if (session.isNew() || session.getAttribute("isLogin") == "no") {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- longin -->\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"button\" href=\"#popup1\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"button\" href=\"#popup2\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custFirstname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></b>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"profile.do\"><i class=\"fa fa-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUser Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"logoutProcess.do\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-sing-out fa-fw\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Top Background Image Wrapper -->\r\n");
      out.write("\t<!-- main body -->\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t<h1>Booking Detail </h1>\r\n");
      out.write("\t\t\t<div class=\"agileits_earnings\">\r\n");
      out.write("\t\t\t\t<div class=\"agileits_earnings1\">\r\n");
      out.write("\t\t\t\t\t<h3>Booking Detail</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- / main body -->\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<div class=\"wrapper row4\">\r\n");
      out.write("\t\t<footer id=\"footer\" class=\"hoc clear\">\r\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t<div align=\"right\" class=\"one_third\">\r\n");
      out.write("\t\t\t\t<h6 align=\"center\" class=\"heading\">Contact Us</h6>\r\n");
      out.write("\t\t\t\t<ul class=\"nospace btmspace-30 linklist contact\">\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t\t<address>333 Moo1, Thasud, Muang, Chiang Rai 57100</address></li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\"></i> 0-5391-6000, 0-5391-7034</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\"></i> info@domain.com</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"faico clear\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("\t<!-- JAVASCRIPTS -->\r\n");
      out.write("\t<script src=\"layout/scripts/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"layout/scripts/jquery.backtotop.js\"></script>\r\n");
      out.write("\t<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- popup1 login start -->\r\n");
      out.write("<!-- <div id=\"popup1\" class=\"overlay\">\r\n");
      out.write("\t<div class=\"popup\">\r\n");
      out.write("\t\t<a class=\"close\" href=\"#\">&times;</a>\r\n");
      out.write("\t\t<div class=\"w3ls-main\">\r\n");
      out.write("\t\t\t<div class=\"wthree-container\">\r\n");
      out.write("\t\t\t\t<div class=\"wthree-form\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-2\">\r\n");
      out.write("\t\t\t\t\t\t<h2>login</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-user\">\r\n");
      out.write("\t\t\t\t\t\t\t<span><i class=\"\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-psw\">\r\n");
      out.write("\t\t\t\t\t\t\t<span><i class=\"\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l\">\r\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">forgot password ?</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l-submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"login\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div> -->\r\n");
      out.write("<!-- popup1 login end-->\r\n");
      out.write("<!-- popup2 register start -->\r\n");
      out.write("<!-- <div id=\"popup2\" class=\"overlay\">\r\n");
      out.write("\t<div class=\"popup\">\r\n");
      out.write("\t\t<a class=\"close\" href=\"#\">&times;</a>\r\n");
      out.write("\t\t<div class=\"w3ls-main\">\r\n");
      out.write("\t\t\t<div class=\"center-container\">\r\n");
      out.write("\t\t\t\t<div class=\"w3ls-header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"header-main\">\r\n");
      out.write("\t\t\t\t\t\t<h1>Register</h1>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-right w3agile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-left-bottom agileinfo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter your name\" required=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" placeholder=\"Enter your email\" required=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" placeholder=\"Phone number\" required=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Create password\" required=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Confirm password\" required=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Register\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("<!-- popup2 login end-->");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /billroom.jsp(112,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /billroom.jsp(112,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setAction("saveReserv.do");
    // /billroom.jsp(112,5) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setCommandName("reservation");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div id=\"parentHorizontalTab\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"resp-tabs-container hor_1\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grids\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>First Name</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custFirstname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>Last Name</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custLastname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>ID card/Password</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.regisPerson }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>nationality</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.nationality }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>race</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.race }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>E-mail</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>Phone</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.phone }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"agileits_earnings1_grid\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h4>Address</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.address }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t\t\t\t\t$(document).ready(function() {\r\n");
          out.write("\t\t\t\t\t\t\t\t//Horizontal Tab\r\n");
          out.write("\t\t\t\t\t\t\t\t$('#parentHorizontalTab').easyResponsiveTabs({\r\n");
          out.write("\t\t\t\t\t\t\t\t\ttype : 'default', //Types: default, vertical, accordion\r\n");
          out.write("\t\t\t\t\t\t\t\t\twidth : 'auto', //auto or any width like 600px\r\n");
          out.write("\t\t\t\t\t\t\t\t\tfit : true, // 100% fit in a container\r\n");
          out.write("\t\t\t\t\t\t\t\t\ttabidentify : 'hor_1', // The tab groups identifier\r\n");
          out.write("\t\t\t\t\t\t\t\t\tactivate : function(event) { // Callback function if tab is switched\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar $tab = $(this);\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar $info = $('#nested-tabInfo');\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar $name = $('span', $info);\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t$name.text($tab.text());\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t$info.show();\r\n");
          out.write("\t\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t});\r\n");
          out.write("\t\t\t\t\t\t\t});\r\n");
          out.write("\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t<div class=\"agileinfo_pricing\">\r\n");
          out.write("\t\t\t\t<div class=\"agileinfo_pricing1\">\r\n");
          out.write("\t\t\t\t\t<h3>Pricing</h3>\r\n");
          out.write("\t\t\t\t\t<ul class=\"w3_agile_price\">\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"\" aria-hidden=\"true\"></i> CHECK IN : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservation.checkinDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t<ul class=\"w3_agile_price\">\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"\" aria-hidden=\"true\"></i>CHECK OUT: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservation.checkoutDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t<ul class=\"w3_agile_price\">\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"\" aria-hidden=\"true\"></i>ROOM: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"\" aria-hidden=\"true\"></i>BED NUMBER: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" bed</li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t<ul class=\"w3_agile_price\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<p>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"index.do\">BACK</a> ToTal<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payment }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" THB</span>\r\n");
          out.write("\t\t\t\t\t</p>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" name=\"typeName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" /> \r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" name=\"bedType\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"agileits_w3layouts_more\">\r\n");
          out.write("\t\t\t\t\t\t<button class=\"\" type=\"submit\">CONFIRM</button>\r\n");
          out.write("\t\t\t\t\t\t<script>\r\n");
          out.write("\t\t\t\t\t\t\tfunction myFunction() {\r\n");
          out.write("\t\t\t\t\t\t\t\talert(\"BOOK ROOM SUCCESS!\");\r\n");
          out.write("\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /billroom.jsp(114,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f0.setPath("reservId");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /billroom.jsp(201,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f1.setPath("checkinDate");
    int[] _jspx_push_body_count_form_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f1 = _jspx_th_form_005fhidden_005f1.doStartTag();
      if (_jspx_th_form_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /billroom.jsp(202,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f2.setPath("checkoutDate");
    int[] _jspx_push_body_count_form_005fhidden_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f2 = _jspx_th_form_005fhidden_005f2.doStartTag();
      if (_jspx_th_form_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f3 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /billroom.jsp(205,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f3.setPath("peopleNumber");
    int[] _jspx_push_body_count_form_005fhidden_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f3 = _jspx_th_form_005fhidden_005f3.doStartTag();
      if (_jspx_th_form_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f4 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /billroom.jsp(206,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f4.setPath("customer.cusId");
    int[] _jspx_push_body_count_form_005fhidden_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f4 = _jspx_th_form_005fhidden_005f4.doStartTag();
      if (_jspx_th_form_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f4);
    }
    return false;
  }
}
