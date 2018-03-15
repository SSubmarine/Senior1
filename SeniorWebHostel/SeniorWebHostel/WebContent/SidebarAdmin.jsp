<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <!-- Meta, title, CSS, favicons, etc. -->
                    <meta charset="utf-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <link rel="icon" href="images/favicon.ico" type=h "image/ico" />

                    <title>Admin Manage Book Product</title>

                    <!-- Bootstrap -->
                    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
                    <!-- Font Awesome -->
                    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
                    <!-- NProgress -->
                    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
                    <!-- iCheck -->
                    <link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">

                    <!-- bootstrap-progressbar -->
                    <link href="vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
                    <!-- JQVMap -->
                    <link href="vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet" />
                    <!-- bootstrap-daterangepicker -->
                    <link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

                    <!-- Custom Theme Style -->
                    <link href="build/css/custom.min.css" rel="stylesheet">
                </head>

                <body>
                    <div class="col-md-3 left_col">
                        <div class="left_col scroll-view">

                            <!-- sidebar menu -->
                            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                                <div class="menu_section">
                                    <ul class="nav side-menu">
                                        <li>
                                            <a href="AdminHome.html">
                                                <i class="fa fa-home"></i> Home </a>
                                        </li>
                                        <li>
                                            <a href="listInformation.do">
                                                <i class="fa fa-table"></i> Manage information </a>
                                        </li>
                                        <li>
                                            <a href="listReservation.do">
                                                <i class="fa fa-table"></i> Manage Reservstion </a>
                                        </li>
                                         <li>
                                            <a href="listRoom.do">
                                                <i class="fa fa-table"></i> Manage Room </a>
                                        </li>
                                        <li>
                                            <a>
                                                <i class="fa fa-table"></i> Manage Service
                                                <span class="fa fa-chevron-down"></span>
                                            </a>
                                            <ul class="nav child_menu">
                                                <li>
                                                    <a href="listSpa.do">Manage Spa</a>
                                                </li>
                                                <li>
                                                    <a href="listProduct.do">Manage Product</a>
                                                </li>
                                                <li>
                                                    <a href="listTrip.do">Manage Trip</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="listMember.do">
                                                <i class="fa fa-table"></i> Manage Member </a>
                                        </li>
                                        <li>
                                            <a href="listGuest.do">
                                                <i class="fa fa-table"></i> Manage Guest </a>
                                        </li>
                                        <li>
                                            <a href="listPromotion.do">
                                                <i class="fa fa-table"></i> Manage Promotion </a>
                                        </li>
                                        <li>
                                            <a>
                                                <i class="fa fa-table"></i> Manage Booking
                                                <span class="fa fa-chevron-down"></span>
                                            </a>
                                            <ul class="nav child_menu">
                                                <li>
                                                    <a href="listBookRoom.do">Manage Book Room</a>
                                                </li>
                                                <li>
                                                    <a href="listBookSpa.do">Manage Book Spa</a>
                                                </li>
                                                <li>
                                                    <a href="listOrderProduct.do">Manage Order Product</a>
                                                </li>
                                                <li>
                                                    <a href="listBookTrip.do">Manage Book Trip</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="listBill.do">
                                                <i class="fa fa-check"></i> Confirm Payment </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <!-- /sidebar menu -->
                        </div>
                    </div>

                    <!-- top navigation -->
                    <div class="top_nav">
                        <div class="nav_menu">
                            <nav>
                                <div class="nav toggle">
                                    <a id="menu_toggle">
                                        <i class="fa fa-bars"></i>
                                    </a>
                                </div>
                                <ul class="nav navbar-nav navbar-right">
                                    <li class="">
                                        <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                            <i class="fa fa-user" alt=""> Admin</i>
                                            <span class=" fa fa-angle-down"></span>
                                        </a>
                                        <ul class="dropdown-menu dropdown-usermenu pull-right">
                                            <li>
                                                <a href="AdminLogin.html">
                                                    <i class="fa fa-sign-out pull-right"></i> Log Out</a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    <!-- /top navigation -->


                    <!-- Custom Theme Scripts -->
                    <script src="build/js/custom.min.js "></script>
                </body>

                </html>