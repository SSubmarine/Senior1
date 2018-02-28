package org.apache.jsp.Pages.production;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!-- Meta, title, CSS, favicons, etc. -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Booking</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://www.w3schools.com/lib/w3-theme-black.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"css/popup.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link href=\"vendors/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- NProgress -->\r\n");
      out.write("<link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom Theme Style -->\r\n");
      out.write("<link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- FullCalendar -->\r\n");
      out.write("<link href=\"vendors/fullcalendar/dist/fullcalendar.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"vendors/fullcalendar/dist/fullcalendar.print.css\"\r\n");
      out.write("\trel=\"stylesheet\" media=\"print\">\r\n");
      out.write("<!-- bootstrap-daterangepicker -->\r\n");
      out.write("<link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- bootstrap-datetimepicker -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"vendors/bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("html, body, h1, h2, h3, h4, h5, h6 {\r\n");
      out.write("\tfont-family: \"Roboto\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".w3-sidebar {\r\n");
      out.write("\tz-index: 3;\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\ttop: 210px;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\theight: inherit;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bgimg {\r\n");
      out.write("\tbackground-image: url('img/room11.jpg');\r\n");
      out.write("\tmin-height: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body class=\"bgimg\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navbar -->\r\n");
      out.write("\t<div class=\"w3-top\">\r\n");
      out.write("\t\t<div class=\"w3-bar\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t<a\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-right\"\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0);\" onclick=\"toggleFunction()\"\r\n");
      out.write("\t\t\t\ttitle=\"Toggle Navigation Menu\"> <i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t</a> <a href=\"Home.html\" class=\"w3-bar-item w3-button\">HOME</a> <a\r\n");
      out.write("\t\t\t\thref=\"#popupLogin\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-user\"></i> Log In\r\n");
      out.write("\t\t\t</a> <a href=\"#about\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-envelope\"></i> About\r\n");
      out.write("\t\t\t</a> <a href=\"#room\" class=\"w3-bar-item w3-button w3-hide-small w3-right\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-bed\"></i> Room\r\n");
      out.write("\t\t\t</a> <a href=\"#statusChecking\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-check-circle\"></i> Status Checking\r\n");
      out.write("\t\t\t</a> <a href=\"#promotion\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-pencil\"></i> Promotion\r\n");
      out.write("\t\t\t</a> <a href=\"#bookroom\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-home\"></i> Booking\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navbar on small screens -->\r\n");
      out.write("\t\t<div id=\"navDemo\"\r\n");
      out.write("\t\t\tclass=\"w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium\">\r\n");
      out.write("\t\t\t<a href=\"#home\" class=\"w3-bar-item w3-button\">HOME</a> <a\r\n");
      out.write("\t\t\t\thref=\"#popupLogin\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-user\"></i> Log In\r\n");
      out.write("\t\t\t</a> <a href=\"#about\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-envelope\"></i> About\r\n");
      out.write("\t\t\t</a> <a href=\"#room\" class=\"w3-bar-item w3-button w3-hide-small w3-right\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-bed\"></i> Room\r\n");
      out.write("\t\t\t</a> <a href=\"#statusChecking\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-check-circle\"></i> Status Checking\r\n");
      out.write("\t\t\t</a> <a href=\"#promotion\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-pencil\"></i> Promotion\r\n");
      out.write("\t\t\t</a> <a href=\"#bookroom\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-hide-small w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-home\"></i> Booking\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\twindow.onscroll = function() {\r\n");
      out.write("\t\t\tmyFunction()\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tfunction myFunction() {\r\n");
      out.write("\t\t\tvar navbar = document.getElementById(\"myNavbar\");\r\n");
      out.write("\t\t\tif (document.body.scrollTop > 100\r\n");
      out.write("\t\t\t\t\t|| document.documentElement.scrollTop > 100) {\r\n");
      out.write("\t\t\t\tnavbar.className = \"w3-bar\" + \" w3-card\" + \" w3-animate-top\"\r\n");
      out.write("\t\t\t\t\t\t+ \" w3-white\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tnavbar.className = navbar.className.replace(\r\n");
      out.write("\t\t\t\t\t\t\" w3-card w3-animate-top w3-white\", \"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div class=\"w3-container\" style=\"margin-top: 80px\" id=\"booking\">\r\n");
      out.write("\t\t<h1 class=\"w3-jumbo\">\r\n");
      out.write("\t\t\t<b>Booking</b>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<hr style=\"width: 50px; border: 5px solid white\" class=\"w3-round\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- page content -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-10 col-sm-12 col-xs-12\" style=\"padding-left: 30px\">\r\n");
      out.write("\t\t\t<div class=\"x_panel\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t<!-- Smart Wizard -->\r\n");
      out.write("\t\t\t\t\t<div id=\"wizard\" class=\"form_wizard wizard_horizontal\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"wizard_steps\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#step-1\"> <span class=\"step_no\">1</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"step_descr\"> Step 1 <br /> <small>Book\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tRoom</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#step-2\"> <span class=\"step_no\">2</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"step_descr\"> Step 2 <br /> <small>Choose\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd on</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#step-3\"> <span class=\"step_no\">3</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"step_descr\"> Step 3 <br /> <small>Confirm</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#step-4\"> <span class=\"step_no\">4</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"step_descr\"> Step 4 <br /> <small>Payment</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"step-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <form class=\"form-horizontal form-label-left\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- calendar -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- page content -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <div class=\"right_col\" role=\"main\">\r\n");
      out.write("                                            <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-md-12\">\r\n");
      out.write("                                                        <div class=\"x_panel\">\r\n");
      out.write("                                                            <div class=\"x_content\">\r\n");
      out.write("\r\n");
      out.write("                                                                <div id='calendar'></div>\r\n");
      out.write("\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /page content -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /End calendar -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- </form> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- form date pickers -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"x_panel\" style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Booking</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#myDatepicker').datetimepicker();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#myDatepicker2').datetimepicker({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformat : 'DD.MM.YYYY'\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#myDatepicker3').datetimepicker({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformat : 'hh:mm A'\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#myDatepicker4').datetimepicker({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tignoreReadonly : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tallowInputToggle : true\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#datetimepicker6').datetimepicker();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#datetimepicker7').datetimepicker({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tuseCurrent : false\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#datetimepicker6\").on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"dp.change\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#datetimepicker7').data(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"DateTimePicker\").minDate(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\te.date);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#datetimepicker7\").on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"dp.change\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#datetimepicker6').data(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"DateTimePicker\").maxDate(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\te.date);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /form datepicker -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"step-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_panel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- required for floating -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Nav tabs -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-tabs tabs-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#goods\" data-toggle=\"tab\">Goods</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#trip\" data-toggle=\"tab\">Trip</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#spa\" data-toggle=\"tab\">Spa</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Tab panes -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-pane active\" id=\"goods\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-pane\" id=\"trip\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-pane\" id=\"spa\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"step-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"StepTitle w3-center\">Comfirm Booking</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_panel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Personal Data</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form id=\"demo-form2\" data-parsley-validate\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-horizontal form-label-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor=\"booking-req\">Booking Req :</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-6 col-sm-6 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"booking-req\">________ <span class=\"required\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"first-name\">First Name <span class=\"required\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"first-name\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control col-md-7 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"last-name\">Last Name <span class=\"required\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"last-name\" name=\"last-name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control col-md-7 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"nationality\">Nationality <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"required\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"nationality\" name=\"nationality\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control col-md-7 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"idcard-number\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"control-label col-md-3 col-sm-3 col-xs-12\">ID\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcard Number</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"idcard-number\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control col-md-7 col-xs-12\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"idcard-number\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\">Gender</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"gender\" class=\"btn-group\" data-toggle=\"buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-toggle-class=\"btn-primary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-toggle-passive-class=\"btn-default\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"gender\" value=\"male\"> &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMale &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label> <label class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-toggle-class=\"btn-primary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-toggle-passive-class=\"btn-default\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"gender\" value=\"female\"> Female\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\">Age</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"age\" class=\"form-control\" name=\"age\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"20\">Under 20</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"21\">Over 20</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"control-label col-md-3 col-sm-3 col-xs-12\">Email*</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"email\" class=\"form-control col-md-7 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"email\" name=\"email\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"address\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"control-label col-md-3 col-sm-3 col-xs-12\">Address</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"address\" class=\"form-control col-md-7 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"control-label col-md-3 col-sm-3 col-xs-12\">Phone*</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"phone\" class=\"form-control col-md-7 col-xs-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"phone\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"x_panel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Room</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRoom type : <i id=\"bookroomtype\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDate : <i id=\"roomBookingDate\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAmount : <i id=\"booknumguest\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Add-on</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Product :</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Amount :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Trip :</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Date :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>course:</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"w3-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b> Total :\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr></tr> ... Baht\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"step-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"x_panel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Personal Data</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Booking Req :</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tFirst name : <i id=\"firstname\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tLast name : <i id=\"lastname\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tNationality : <i id=\"guestnationality\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tID Card Number : <i id=\"idcardnumber\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tGender : <i id=\"guestgender\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAge : <i id=\"guestage\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tE-mail : <i id=\"guestemail\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAddress : <i id=\"guestaddress\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tphone : <i id=\"guestphone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Room</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRoom type : <i id=\"roomtype\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDate : <i id=\"bookingDate\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAmount : <i id=\"numguest\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Add-on</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Product :</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Amount :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>Trip :</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Date :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>course:</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"font-gray-dark \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"w3-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b> Total :\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr></tr> ... Baht\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End SmartWizard Content -->\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" onclick=\"myfunction()\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-success\">save</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"save\" class=\"btn btn-danger\">finish</button>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tfunction myFunction() {\r\n");
      out.write("\t\t\t\t\t\t\tvar roomBookingDate = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.getElementById(\"reservation\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"bookingDate\").innerHTML = roomBookingDate;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"roomBookingDate\").innerHTML = roomBookingDate;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar roomType = document.getElementById(\"roomType\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"roomtype\").innerHTML = roomType;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"bookroomtype\").innerHTML = roomType;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar numguest = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.getElementById(\"number-of-guest\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"numguest\").innerHTML = numguest;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"booknumguest\").innerHTML = numguest;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar firstname = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.getElementById(\"first-name\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"firstname\").innerHTML = firstname;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar lastname = document.getElementById(\"last-name\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"lastname\").innerHTML = lastname;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar nationality = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.getElementById(\"nationality\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"guestnationality\").innerHTML = nationality;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar gender = document.getElementById(\"gender\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"guestgender\").innerHTML = gender;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar email = document.getElementById(\"email\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"guestemail\").innerHTML = email;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar address = document.getElementById(\"address\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"guestaddress\").innerHTML = address;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar phone = document.getElementById(\"phone\").value;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"guestphone\").innerHTML = phone;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Sidebar -->\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-r5 w3-animate-right\"\r\n");
      out.write("\t\tid=\"mySidebar\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" onclick=\"w3_close()\"\r\n");
      out.write("\t\t\tclass=\"w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large\"\r\n");
      out.write("\t\t\ttitle=\"Close Menu\"> <i class=\"fa fa-remove\"></i>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<h4 class=\"w3-bar-item w3-center\">\r\n");
      out.write("\t\t\t<b>List</b>\r\n");
      out.write("\t\t</h4>\r\n");
      out.write("\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<b>Room</b>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4>Room type :</h4>\r\n");
      out.write("\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t<h5>Night :</h5>\r\n");
      out.write("\t\t\t<h5>Amount</h5>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<br /> <br />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"x_title\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<b>Add-on</b>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"x_content\">\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h4>\r\n");
      out.write("\t\t\t\t<b>Product :</b>\r\n");
      out.write("\t\t\t</h4>\r\n");
      out.write("\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t<h5>Amount :</h5>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h4>\r\n");
      out.write("\t\t\t\t<b>Trip :</b>\r\n");
      out.write("\t\t\t</h4>\r\n");
      out.write("\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t<h5>Date :</h5>\r\n");
      out.write("\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h4>\r\n");
      out.write("\t\t\t\t<b>course:</b>\r\n");
      out.write("\t\t\t</h4>\r\n");
      out.write("\t\t\t<p class=\"font-gray-dark\">\r\n");
      out.write("\t\t\t<h5>Number of people :</h5>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Overlay effect when opening sidebar on small screens -->\r\n");
      out.write("\t<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\"\r\n");
      out.write("\t\tstyle=\"cursor: pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->\r\n");
      out.write("\t<div class=\"w3-main\" style=\"margin-left: 300px\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"vendors/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- FastClick -->\r\n");
      out.write("<script src=\"vendors/fastclick/lib/fastclick.js\"></script>\r\n");
      out.write("<!-- NProgress -->\r\n");
      out.write("<script src=\"vendors/nprogress/nprogress.js\"></script>\r\n");
      out.write("<!-- jQuery Smart Wizard -->\r\n");
      out.write("<script src=\"vendors/jQuery-Smart-Wizard/js/jquery.smartWizard.js\"></script>\r\n");
      out.write("<!-- Custom Theme Scripts -->\r\n");
      out.write("<script src=\"build/js/custom.min.js\"></script>\r\n");
      out.write("<!-- FullCalendar -->\r\n");
      out.write("<script src=\"vendors/moment/min/moment.min.js\"></script>\r\n");
      out.write("<script src=\"vendors/fullcalendar/dist/fullcalendar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap-daterangepicker -->\r\n");
      out.write("<script src=\"vendors/moment/min/moment.min.js\"></script>\r\n");
      out.write("<script src=\"vendors/bootstrap-daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!-- bootstrap-datetimepicker -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /Pages/production/Booking.jsp(213,9) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /Pages/production/Booking.jsp(213,9) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setAction("saveBooking.do");
    // /Pages/production/Booking.jsp(213,9) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_form_005fform_005f0.setCommandName("bookRoom");
    // /Pages/production/Booking.jsp(213,9) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"from-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"choose-date\">Choose Date</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-prepend input-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"add-on input-group-addon\"> <i\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-calendar fa fa-calendar\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span> <input style=\"width: 200px\" name=\"bookDate\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"reservation\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"01/01/2018 - 01/25/2018\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"room-type\">Room Type</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"room-type\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label col-md-3 col-sm-3 col-xs-12\">Number\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tof guest</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"number-of-guest\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"number-of-guest\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /Pages/production/Booking.jsp(232,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/Booking.jsp(232,13) '${roomList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roomList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/Booking.jsp(232,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("room");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option id=\"roomType\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
    // /Pages/production/Booking.jsp(319,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/Booking.jsp(319,13) '${productList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${productList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/Booking.jsp(319,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setVar("product");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_features\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-unstyled text-left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-times text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-times text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPIC</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_footer\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a onclick=\"buyProduct()\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success btn-block\" role=\"button\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"submit\">buy <span> now!</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction myFunction() {\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar myDate = document.getElementById(\"myDate\").value;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"demo\").innerHTML = myDate;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = document.getElementById(\"my\").value;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"myD\").innerHTML = y;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /Pages/production/Booking.jsp(361,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/Booking.jsp(361,13) '${tripList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${tripList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/Booking.jsp(361,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setVar("trip");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_features\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-unstyled text-left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-times text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.tripDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-times text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPIC</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_footer\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success btn-block\" role=\"button\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"submit\">buy <span> now!</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /Pages/production/Booking.jsp(394,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/Pages/production/Booking.jsp(394,13) '${spaList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${spaList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Pages/production/Booking.jsp(394,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f3.setVar("spa");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- price element -->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"x_content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_features\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-unstyled text-left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-check text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spa.spaDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </strong></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-check text-success\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPic</li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"pricing_footer\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success btn-block\" role=\"button\">Buy\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> now!</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
}
