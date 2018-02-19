package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Hostel </title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<link href=\"css/popup.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"css/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<link href=\"css/css/style.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<link href=\"layout/styles/bookstyle.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"layout/styles/bookjquery-ui.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\" media=\"all\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\"\n");
      out.write("\tcontent=\"Flight Ticket Booking  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\" />\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\taddEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"top\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"bgded\"\n");
      out.write("\t\tstyle=\"background-image: url('images/demo/backgrounds/01.jpg');\">\n");
      out.write("\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t<div class=\"wrapper row1\">\n");
      out.write("\t\t\t<header id=\"header\" class=\"hoc clear\">\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t\t<div id=\"logo\" class=\"fl_left\">\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t<a href=\"loginForm.do\">Hostel</a>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<nav id=\"mainav\" class=\"fl_right\">\n");
      out.write("\t\t\t\t\t");

						if (session.isNew() || session.getAttribute("isLogin") == "no") {
					
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"clear\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<!-- longin -->\n");
      out.write("\t\t\t\t\t\t<li><a class=\"button\" href=\"#popup1\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"button\" href=\"#popup2\">Register</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"clear\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custFirstname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"profile.do\"><i class=\"fa fa-user fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUser Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"logoutProcess.do\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-sing-out fa-fw\"></i> Logout</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<article id=\"pageintro\" class=\"hoc clear\">\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t\t<h1 class=\"agile-head text-center\">Book a Room</h1>\n");
      out.write("\n");
      out.write("\t\t\t\t");

					if (session.isNew() || session.getAttribute("isLogin") == "no") {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container-w3\">\n");
      out.write("\t\t\t\t\t<div class=\"form_w3layouts\">\n");
      out.write("\t\t\t\t\t\t<form action=\"loginForm.do\" method=\"post\" class=\"agile_form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- form spring ไม่มี type date ให้เปลี่ยนเป็น type text แล้วเอา datepicker มาใช้เอา -->\n");
      out.write("\t\t\t\t\t\t\t<!-- หรือ ส่งค่าผ่าน parameter เฉย ๆ ใช้เป็น input ธรรมดา ตั้ง name ด้วย -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkin agileits-left\">\n");
      out.write("\t\t\t\t\t\t\t\tcheck in <input class=\"date\" id=\"datetimepicker1\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"checkinDate\" type=\"date\" onfocus=\"this.value = '';\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonblur=\"if (this.value == '') {this.value = '';}\"\n");
      out.write("\t\t\t\t\t\t\t\t\trequired=\"required\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkout agileits-right\">\n");
      out.write("\t\t\t\t\t\t\t\tcheck out <input class=\"date\" id=\"datetimepicker2\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"checkoutDate\" type=\"date\" onfocus=\"this.value = '';\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonblur=\"if (this.value == '') {this.value = '';}\"\n");
      out.write("\t\t\t\t\t\t\t\t\trequired=\"required\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"section_class_agileits\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"roomType\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" placeholder=\"Select Room\"></option>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"section_class_agileits\">\n");
      out.write("\t\t\t\t\t\t\t\t<select path=\"bedType\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\" placeholder=\"Select Bed\"></option>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<br></br>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"btn\" type=\"submit\" value=\"Book a room\" />\n");
      out.write("\t\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container-w3\">\n");
      out.write("\t\t\t\t\t<div class=\"form_w3layouts\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!--BOOKING ROOM end -->\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t<!-- <footer><a class=\"btn\" href=\"booking.html\">Book a room</a></footer>  -->\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ################################################################################################ -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Top Background Image Wrapper -->\n");
      out.write("\t<!-- #################ROOM############################################################################### -->\n");
      out.write("\t<div class=\"wrapper row3\">\n");
      out.write("\t\t<section class=\"hoc container clear\">\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t<div class=\"sectiontitle\">\n");
      out.write("\t\t\t\t<h6 class=\"heading\">ROOM</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Bibendum ante neque ultrices eros ac luctus sapien</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"group\">\n");
      out.write("\t\t\t\t<figure class=\"one_quarter first\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"btmspace-30\"\n");
      out.write("\t\t\t\t\t\tsrc=\"images/demo/room01.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h6 class=\"heading font-x1\">Private Double Room</h6>\n");
      out.write("\t\t\t\t\t\t<em class=\"font-xs\">Duis euismod egestas risus</em>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"faico clear\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t\t<figure class=\"one_quarter\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"btmspace-30\"\n");
      out.write("\t\t\t\t\t\tsrc=\"images/demo/room02.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h6 class=\"heading font-x1\">2 Bed Female Dorm</h6>\n");
      out.write("\t\t\t\t\t\t<em class=\"font-xs\">Vel lobortis nulla pulvinar</em>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"faico clear\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t\t<figure class=\"one_quarter\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"btmspace-30\"\n");
      out.write("\t\t\t\t\t\tsrc=\"images/demo/room04.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h6 class=\"heading font-x1\">4 Bed Female Dorm</h6>\n");
      out.write("\t\t\t\t\t\t<em class=\"font-xs\">Et aliquam laoreet sollicitudin</em>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"faico clear\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t\t<figure class=\"one_quarter\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"btmspace-30\"\n");
      out.write("\t\t\t\t\t\tsrc=\"images/demo/room06.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h6 class=\"heading font-x1\">6 Bed Female Dorm</h6>\n");
      out.write("\t\t\t\t\t\t<em class=\"font-xs\">Dolor sit amet luctus velit</em>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"faico clear\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</section>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ###########SERVICE##################################################################################### -->\n");
      out.write("\t<div class=\"wrapper row3\">\n");
      out.write("\t\t<section class=\"hoc container clear\">\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t<div class=\"sectiontitle\">\n");
      out.write("\t\t\t\t<h6 class=\"heading\">Service</h6>\n");
      out.write("\t\t\t\t<p>Turpis egestas praesent a condimentum leo sit</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"group latest\">\n");
      out.write("\t\t\t\t<article class=\"one_third first\">\n");
      out.write("\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/spa01.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t<!-- <figcaption>\n");
      out.write("\t\t\t\t\t\t\t<time datetime=\"2045-04-06T08:15+00:00\"><strong>06</strong> <em>Apr</em></time>\n");
      out.write("\t\t\t\t\t\t</figcaption> -->\n");
      out.write("\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t<div class=\"txtwrap\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"heading\">Spa</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nospace meta\">\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-tag\"></i> <a href=\"#\">discount</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<p>Sollicitudin condimentum lacus morbi vitae sapien ornare\n");
      out.write("\t\t\t\t\t\t\trhoncus purus vel fermentum massa nunc vitae metus risus habitant\n");
      out.write("\t\t\t\t\t\t\t[&hellip;]</p>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<article class=\"one_third\">\n");
      out.write("\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/reservation01.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t<div class=\"txtwrap\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"heading\">Reservation</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nospace meta\">\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-tag\"></i> <a href=\"#\">discount</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<p>Morbi tristique senectus et netus et malesuada fames ac\n");
      out.write("\t\t\t\t\t\t\tturpis egestas nunc eget nibh et ante finibus lacinia integer\n");
      out.write("\t\t\t\t\t\t\t[&hellip;]</p>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<article class=\"one_third\">\n");
      out.write("\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/trip01.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t<div class=\"txtwrap\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"heading\">Booking trip</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nospace meta\">\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-tag\"></i> <a href=\"#\">discount</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<p>Neque sem vulputate id lacus vitae venenatis dignissim enim\n");
      out.write("\t\t\t\t\t\t\tquisque non justo vitae eros sodales varius suspendisse\n");
      out.write("\t\t\t\t\t\t\t[&hellip;]</p>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read More &raquo;</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</section>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ################################################################################################ -->\n");
      out.write("\t<div class=\"wrapper row4\">\n");
      out.write("\t\t<footer id=\"footer\" class=\"hoc clear\">\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t<div align=\"right\" class=\"one_third\">\n");
      out.write("\t\t\t\t<h6 align=\"center\" class=\"heading\">Contact Us</h6>\n");
      out.write("\t\t\t\t<ul class=\"nospace btmspace-30 linklist contact\">\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-map-marker\"></i>\n");
      out.write("\t\t\t\t\t\t<address>333 Moo1, Thasud, Muang, Chiang Rai 57100</address></li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\"></i> 0-5391-6000, 0-5391-7034</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\"></i> info@domain.com</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"faico clear\">\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ################################################################################################ -->\n");
      out.write("\t<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\t<!-- JAVASCRIPTS -->\n");
      out.write("\t<script src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"layout/scripts/jquery.backtotop.js\"></script>\n");
      out.write("\t<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!--start-date-piker-->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\" />\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$('#datetimepicker1').datetimepicker();\n");
      out.write("\t\t$('#datetimepicker2').datetimepicker({\n");
      out.write("\t\t\tuseCurrent : false\n");
      out.write("\t\t//Important! See issue #1075\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#datetimepicker1\").on(\"dp.change\", function(e) {\n");
      out.write("\t\t\t$('#datetimepicker2').data(\"DateTimePicker\").minDate(e.date);\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#datetimepicker1\").on(\"dp.change\", function(e) {\n");
      out.write("\t\t\t$('#datetimepicker2').data(\"DateTimePicker\").maxDate(e.date);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t// \t$(function() {\n");
      out.write("\t// \t\t$(\"#datepicker,#datepicker1\").datepicker();\n");
      out.write("\t// \t});\n");
      out.write("</script>\n");
      out.write("3\n");
      out.write("<!-- /End-date-piker -->\n");
      out.write("\n");
      out.write("<!-- popup1 login start -->\n");
      out.write("<div id=\"popup1\" class=\"overlay\">\n");
      out.write("\t<div class=\"popup\">\n");
      out.write("\t\t<a class=\"close\" href=\"#\">&times;</a>\n");
      out.write("\t\t<div class=\"w3ls-main\">\n");
      out.write("\t\t\t<div class=\"wthree-container\">\n");
      out.write("\t\t\t\t<div class=\"wthree-form\">\n");
      out.write("\t\t\t\t\t<div class=\"agileits-2\">\n");
      out.write("\t\t\t\t\t\t<h2>login</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form method=\"POST\" action=\"loginProcess.do\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-user\">\n");
      out.write("\t\t\t\t\t\t\t<span><i class=\"\" aria-hidden=\"true\"></i></span> <input\n");
      out.write("\t\t\t\t\t\t\t\tname=\"email\" type=\"text\" placeholder=\"Username\" required=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-psw\">\n");
      out.write("\t\t\t\t\t\t\t<span><i class=\"\" aria-hidden=\"true\"></i></span> <input\n");
      out.write("\t\t\t\t\t\t\t\tname=\"pass\" type=\"password\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l\">\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">forgot password ?</a></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l-submit\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"login\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //content -->\n");
      out.write("</div>\n");
      out.write("<!-- popup1 login end-->\n");
      out.write("<!-- popup2 register start -->\n");
      out.write("<div id=\"popup2\" class=\"overlay\">\n");
      out.write("\t<div class=\"popup\">\n");
      out.write("\t\t<a class=\"close\" href=\"#\">&times;</a>\n");
      out.write("\t\t<div class=\"w3ls-main\">\n");
      out.write("\t\t\t<div class=\"center-container\">\n");
      out.write("\t\t\t\t<div class=\"w3ls-header\">\n");
      out.write("\t\t\t\t\t<div class=\"header-main\">\n");
      out.write("\t\t\t\t\t\t<h1>Register</h1>\n");
      out.write("\t\t\t\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-right w3agile\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-left-bottom agileinfo\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //content -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- popup2 Register end-->");
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
    // /index.jsp(146,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(146,9) '${roomList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roomList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(146,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("room");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /index.jsp(155,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(155,9) '${bedList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${bedList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(155,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setVar("bed");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed.bedType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed.bedType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /index.jsp(176,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setAction("billRoom.do");
    // /index.jsp(176,6) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /index.jsp(176,6) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "agile_form");
    // /index.jsp(176,6) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setCommandName("reservation");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"checkin agileits-left\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<!-- form spring ไม่มี type date ให้เปลี่ยนเป็น type text แล้วเอา datepicker มาใช้เอา -->\n");
          out.write("\t\t\t\t\t\t\t\t<!-- หรือ ส่งค่าผ่าน parameter เฉย ๆ ใช้เป็น input ธรรมดา ตั้ง name ด้วย-->\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<h6>check in</h6>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"checkout agileits-right\">\n");
          out.write("\t\t\t\t\t\t\t\t<h6>check out</h6>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"section_class_agileits\">\n");
          out.write("\t\t\t\t\t\t\t\t<h6>ROOM TYPE</h6>\n");
          out.write("\t\t\t\t\t\t\t\t<select name=\"roomType\" >\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</select>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"section_class_agileits\">\n");
          out.write("\t\t\t\t\t\t\t<h1>BED</h1>\n");
          out.write("\t\t\t\t\t\t\t\t<select name=\"bedType\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</select>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<br></br>\n");
          out.write("\t\t\t\t\t\t\t<center>\n");
          out.write("\t\t\t\t\t\t\t\t<input class=\"btn\" type=\"submit\" value=\"Book a room\" />\n");
          out.write("\t\t\t\t\t\t\t</center>\n");
          out.write("\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
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
    // /index.jsp(178,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /index.jsp(179,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f1.setPath("customer.cusId");
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /index.jsp(189,8) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Check in");
    // /index.jsp(189,8) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "date");
    // /index.jsp(189,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setId("datetimepicker1");
    // /index.jsp(189,8) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", "checkinDate");
    // /index.jsp(189,8) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "date");
    // /index.jsp(189,8) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setOnfocus("this.value = '';");
    // /index.jsp(189,8) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setOnblur("if (this.value == '') {this.value = '';}");
    // /index.jsp(189,8) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "required", "required");
    // /index.jsp(189,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f0.setPath("checkinDate");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /index.jsp(197,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", "Check out");
    // /index.jsp(197,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", "date");
    // /index.jsp(197,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setId("datetimepicker2");
    // /index.jsp(197,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", "checkoutDate");
    // /index.jsp(197,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "date");
    // /index.jsp(197,8) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setOnfocus("this.value = '';");
    // /index.jsp(197,8) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setOnblur("if (this.value == '') {this.value = '';}");
    // /index.jsp(197,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "required", "required");
    // /index.jsp(197,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f1.setPath("checkoutDate");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fonfocus_005fonblur_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /index.jsp(210,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(210,9) '${roomList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roomList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(210,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setVar("room");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /index.jsp(219,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(219,9) '${bedList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${bedList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(219,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f3.setVar("bed");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed.bedType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bed.bedType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
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
    // /index.jsp(524,9) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setMethod("post");
    // /index.jsp(524,9) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setAction("saveCustomer.do");
    // /index.jsp(524,9) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f1.setCommandName("customer");
    int[] _jspx_push_body_count_form_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f1 = _jspx_th_form_005fform_005f1.doStartTag();
      if (_jspx_eval_form_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005fhidden_005f2(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-credit-card-alt\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f4(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f5(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f6(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f7(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f8(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-street-view\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f9(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f10(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"bottom\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Register\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_form_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(526,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fhidden_005f2.setPath("cusId");
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

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(530,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f2.setPath("regisPerson");
    // /index.jsp(530,12) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", "text");
    // /index.jsp(530,12) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "placeholder", "Enter your id card");
    // /index.jsp(530,12) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "required", "");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(535,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f3.setPath("custFirstname");
    // /index.jsp(535,12) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", "text");
    // /index.jsp(535,12) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "placeholder", "Enter your firstname");
    // /index.jsp(535,12) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "required", "");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(540,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f4.setPath("custLastname");
    // /index.jsp(540,12) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "type", "text");
    // /index.jsp(540,12) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "placeholder", "Enter your lastname");
    // /index.jsp(540,12) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f4 = _jspx_th_form_005finput_005f4.doStartTag();
      if (_jspx_th_form_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(545,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f5.setPath("nationality");
    // /index.jsp(545,12) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "type", "text");
    // /index.jsp(545,12) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "placeholder", "Enter your nationality");
    // /index.jsp(545,12) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f5 = _jspx_th_form_005finput_005f5.doStartTag();
      if (_jspx_th_form_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f6 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(550,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f6.setPath("race");
    // /index.jsp(550,12) null
    _jspx_th_form_005finput_005f6.setDynamicAttribute(null, "type", "text");
    // /index.jsp(550,12) null
    _jspx_th_form_005finput_005f6.setDynamicAttribute(null, "placeholder", "Enter your race");
    // /index.jsp(550,12) null
    _jspx_th_form_005finput_005f6.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f6 = _jspx_th_form_005finput_005f6.doStartTag();
      if (_jspx_th_form_005finput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f6.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f7 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(555,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f7.setPath("email");
    // /index.jsp(555,12) null
    _jspx_th_form_005finput_005f7.setDynamicAttribute(null, "type", "email");
    // /index.jsp(555,12) null
    _jspx_th_form_005finput_005f7.setDynamicAttribute(null, "placeholder", "Enter your email");
    // /index.jsp(555,12) null
    _jspx_th_form_005finput_005f7.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f7 = _jspx_th_form_005finput_005f7.doStartTag();
      if (_jspx_th_form_005finput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f7.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f8 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(560,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f8.setPath("phone");
    // /index.jsp(560,12) null
    _jspx_th_form_005finput_005f8.setDynamicAttribute(null, "type", "tel");
    // /index.jsp(560,12) null
    _jspx_th_form_005finput_005f8.setDynamicAttribute(null, "placeholder", "Phone number");
    // /index.jsp(560,12) null
    _jspx_th_form_005finput_005f8.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f8 = _jspx_th_form_005finput_005f8.doStartTag();
      if (_jspx_th_form_005finput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f8.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f9 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(565,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f9.setPath("address");
    // /index.jsp(565,12) null
    _jspx_th_form_005finput_005f9.setDynamicAttribute(null, "type", "text");
    // /index.jsp(565,12) null
    _jspx_th_form_005finput_005f9.setDynamicAttribute(null, "placeholder", "Address");
    // /index.jsp(565,12) null
    _jspx_th_form_005finput_005f9.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f9 = _jspx_th_form_005finput_005f9.doStartTag();
      if (_jspx_th_form_005finput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f9.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f10 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /index.jsp(570,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005finput_005f10.setPath("pass");
    // /index.jsp(570,12) null
    _jspx_th_form_005finput_005f10.setDynamicAttribute(null, "type", "password");
    // /index.jsp(570,12) null
    _jspx_th_form_005finput_005f10.setDynamicAttribute(null, "placeholder", "Password");
    // /index.jsp(570,12) null
    _jspx_th_form_005finput_005f10.setDynamicAttribute(null, "required", "");
    int[] _jspx_push_body_count_form_005finput_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f10 = _jspx_th_form_005finput_005f10.doStartTag();
      if (_jspx_th_form_005finput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f10.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f10);
    }
    return false;
  }
}
