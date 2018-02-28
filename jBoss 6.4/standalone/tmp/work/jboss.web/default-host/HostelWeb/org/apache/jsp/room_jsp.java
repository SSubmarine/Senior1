package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class room_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Room</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("\t<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<link href=\"css/popup.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<link href=\"css/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<link href=\"css/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<!-- Top Background Image Wrapper -->\r\n");
      out.write("\t<div class=\"bgded\" style=\"background-image:url('images/demo/backgrounds/01.jpg');\">\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t<div class=\"wrapper row1\">\r\n");
      out.write("\t\t\t<header id=\"header\" class=\"hoc clear\">\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t\t<div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("\t\t\t\t\t<h1><a href=\"loginForm.do\">Hostel</a></h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<nav id=\"mainav\" class=\"fl_right\">\r\n");
      out.write("\t\t\t\t");
 if(session.isNew() || session.getAttribute("isLogin") == "no"){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!-- longin -->\r\n");
      out.write("\t\t\t\t\t\t<li> <a class=\"button\" href=\"#popup1\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"button\" href=\"#popup2\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"loginForm.do\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"room.jsp\">Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"drop\" href=\"#\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Spa</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Vehical rental</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Booking trip</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.custFirstname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b class=\"caret\"></b>\r\n");
      out.write("                        \t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"profile.do\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"logoutProcess.do\"><i class=\"fa fa-sing-out fa-fw\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Top Background Image Wrapper -->\r\n");
      out.write("\t<!-- #################ROOM############################################################################### -->\r\n");
      out.write("\t<div class=\"wrapper row3\">\r\n");
      out.write("\t\t<main class=\"hoc container clear\">\r\n");
      out.write("\t\t\t<!-- main body -->\r\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"gallery\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1><a>ALL ROOM</a></h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nospace clear\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter first\"><a href=\"#\"><img src=\"images/demo/room01.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">Private Double Room</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>1 Bed</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room011.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">Private Double Room</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>1 Bed</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room111.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">Private Double Room</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>1 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room02.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">2 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>2 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter first\"><a href=\"#\"><img src=\"images/demo/room022.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">2 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>2 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room222.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">2 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>2 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room04.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">4 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>4 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room044.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">4 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>4 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter first\"><a href=\"#\"><img src=\"images/demo/room444.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">4 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>4 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room06.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">6 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>6 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room066.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">6 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>6 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"one_quarter\"><a href=\"#\"><img src=\"images/demo/room666.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"heading font-x1\">6 Bed Female Dorm</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>6 Bed</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Shared bathroom</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t\t<nav class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">&laquo; Previous</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><strong>&hellip;</strong></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">6</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"current\"><strong>7</strong></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">8</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">9</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><strong>&hellip;</strong></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">14</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">15</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Next &raquo;</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t<!-- / main body -->\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</main>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ################################################################################################ -->\r\n");
      out.write("\t<div class=\"wrapper row4\">\r\n");
      out.write("\t\t<footer id=\"footer\" class=\"hoc clear\">\r\n");
      out.write("\t\t\t<!-- ################################################################################################ -->\r\n");
      out.write("\t\t\t<div align=\"right\" class=\"one_third\">\r\n");
      out.write("\t\t\t\t<h6 align=\"center\" class=\"heading\">Contact Us</h6>\r\n");
      out.write("\t\t\t\t<ul class=\"nospace btmspace-30 linklist contact\">\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t\t<address>\r\n");
      out.write("\t\t\t\t\t\t\t333 Moo1, Thasud, Muang, Chiang Rai 57100\r\n");
      out.write("\t\t\t\t\t\t</address>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\"></i> 0-5391-6000, 0-5391-7034</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\"></i> info@domain.com</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"faico clear\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"faicon-google-plus\" href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
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
}
