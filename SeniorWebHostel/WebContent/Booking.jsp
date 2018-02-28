<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Booking</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/popup.css">

<!-- Bootstrap -->
<link href="vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">
<!-- FullCalendar -->
<link href="vendors/fullcalendar/dist/fullcalendar.min.css"
	rel="stylesheet">
<link href="vendors/fullcalendar/dist/fullcalendar.print.css"
	rel="stylesheet" media="print">
<!-- bootstrap-daterangepicker -->
<link href="vendors/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet">
<!-- bootstrap-datetimepicker -->
<link
	href="vendors/bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css"
	rel="stylesheet">
<style>
html, body, h1, h2, h3, h4, h5, h6 {
	font-family: "Roboto", sans-serif;
}

.w3-sidebar {
	z-index: 3;
	width: 250px;
	top: 210px;
	bottom: 0;
	height: inherit;
	right: 0;
}

.bgimg {
	background-image: url('img/room11.jpg');
	min-height: 100%;
}
</style>
<body class="bgimg">

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar" id="myNavbar">
			<a
				class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-right"
				href="javascript:void(0);" onclick="toggleFunction()"
				title="Toggle Navigation Menu"> <i class="fa fa-bars"></i>
			</a> <a href="Home.html" class="w3-bar-item w3-button">HOME</a> <a
				href="#popupLogin"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-user"></i> Log In
			</a> <a href="#about"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-envelope"></i> About
			</a> <a href="#room" class="w3-bar-item w3-button w3-hide-small w3-right">
				<i class="fa fa-bed"></i> Room
			</a> <a href="#statusChecking"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-check-circle"></i> Status Checking
			</a> <a href="#promotion"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-pencil"></i> Promotion
			</a> <a href="#bookroom"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-home"></i> Booking
			</a>

		</div>

		<!-- Navbar on small screens -->
		<div id="navDemo"
			class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium">
			<a href="#home" class="w3-bar-item w3-button">HOME</a> <a
				href="#popupLogin"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-user"></i> Log In
			</a> <a href="#about"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-envelope"></i> About
			</a> <a href="#room" class="w3-bar-item w3-button w3-hide-small w3-right">
				<i class="fa fa-bed"></i> Room
			</a> <a href="#statusChecking"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-check-circle"></i> Status Checking
			</a> <a href="#promotion"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-pencil"></i> Promotion
			</a> <a href="#bookroom"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-home"></i> Booking
			</a>

		</div>
	</div>
	<script>
		window.onscroll = function() {
			myFunction()
		};
		function myFunction() {
			var navbar = document.getElementById("myNavbar");
			if (document.body.scrollTop > 100
					|| document.documentElement.scrollTop > 100) {
				navbar.className = "w3-bar" + " w3-card" + " w3-animate-top"
						+ " w3-white";
			} else {
				navbar.className = navbar.className.replace(
						" w3-card w3-animate-top w3-white", "");
			}
		}
	</script>


	<!-- Header -->
	<div class="w3-container" style="margin-top: 80px" id="booking">
		<h1 class="w3-jumbo">
			<b>Booking</b>
		</h1>
		<hr style="width: 50px; border: 5px solid white" class="w3-round">
	</div>

	<!-- page content -->
	<div class="row">

		<div class="col-md-10 col-sm-12 col-xs-12" style="padding-left: 30px">
			<div class="x_panel">

				<div class="x_content">
					<!-- Smart Wizard -->
					<div id="wizard" class="form_wizard wizard_horizontal">
						<ul class="wizard_steps">
							<li><a href="#step-1"> <span class="step_no">1</span> <span
									class="step_descr"> Step 1 <br /> <small>Book
											Room</small>
								</span>
							</a></li>
							<li><a href="#step-2"> <span class="step_no">2</span> <span
									class="step_descr"> Step 2 <br /> <small>Choose
											Add on</small>
								</span>
							</a></li>
							<li><a href="#step-3"> <span class="step_no">3</span> <span
									class="step_descr"> Step 3 <br /> <small>Confirm</small>
								</span>
							</a></li>
							<li><a href="#step-4"> <span class="step_no">4</span> <span
									class="step_descr"> Step 4 <br /> <small>Payment</small>
								</span>
							</a></li>
						</ul>
						<div id="step-1">
							<!-- <form class="form-horizontal form-label-left"> -->
							<!-- calendar -->
							<!-- page content -->
							<!-- <div class="right_col" role="main">
                                            <div class="">

                                                <div class="clearfix"></div>

                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="x_panel">
                                                            <div class="x_content">

                                                                <div id='calendar'></div>

                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> -->
							<!-- /page content -->
							<!-- /End calendar -->
							<!-- </form> -->
							<!-- form date pickers -->
							<div class="x_panel" style="">
								<div class="x_title">
									<h2>Booking</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<form:form method="post" action="saveBooking.do"
										commandName="bookRoom" class="form-horizontal">
										<div class="from-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												id="choose-date">Choose Date</label>
											<div class="input-prepend input-group">
												<span class="add-on input-group-addon"> <i
													class="glyphicon glyphicon-calendar fa fa-calendar"></i>
												</span> <input style="width: 200px" name="bookDate"
													id="reservation" class="form-control"
													value="01/01/2018 - 01/25/2018">
											</div>

										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												id="room-type">Room Type</label>
											<div class="col-md-3 col-sm-6 col-xs-12">
												<select class="form-control" name="room-type">
													<c:forEach items="${roomList}" var="room">
														<option id="roomType" value="${room.roomType}">${room.roomType}</option>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Number
												of guest</label>
											<div class="col-md-3 col-sm-6 col-xs-12">
												<select id="number-of-guest" class="form-control"
													name="number-of-guest">
													<option value="1">1</option>
													<option value="2">2</option>
													<option value="3">3</option>
													<option value="4">4</option>
												</select>
											</div>
										</div>
									</form:form>


								</div>
							</div>
							<script>
								$('#myDatepicker').datetimepicker();

								$('#myDatepicker2').datetimepicker({
									format : 'DD.MM.YYYY'
								});

								$('#myDatepicker3').datetimepicker({
									format : 'hh:mm A'
								});

								$('#myDatepicker4').datetimepicker({
									ignoreReadonly : true,
									allowInputToggle : true
								});

								$('#datetimepicker6').datetimepicker();

								$('#datetimepicker7').datetimepicker({
									useCurrent : false
								});

								$("#datetimepicker6").on(
										"dp.change",
										function(e) {
											$('#datetimepicker7').data(
													"DateTimePicker").minDate(
													e.date);
										});

								$("#datetimepicker7").on(
										"dp.change",
										function(e) {
											$('#datetimepicker6').data(
													"DateTimePicker").maxDate(
													e.date);
										});
							</script>
							<!-- /form datepicker -->
						</div>


						<div id="step-2">
							<div class="col-md-12 col-sm-6 col-xs-12">
								<div class="x_panel">
									<div class="x_content">
										<div class="col-xs-3">
											<!-- required for floating -->
											<!-- Nav tabs -->
											<ul class="nav nav-tabs tabs-left">
												<li class="active"><a href="#goods" data-toggle="tab">Goods</a>
												</li>
												<li><a href="#trip" data-toggle="tab">Trip</a></li>
												<li><a href="#spa" data-toggle="tab">Spa</a></li>
											</ul>
										</div>

										<div class="col-xs-9">
											<!-- Tab panes -->
											<div class="tab-content">
												<div class="tab-pane active" id="goods">


													<c:forEach items="${productList}" var="product">
														<div class="col-md-4 col-sm-6 col-xs-12">
															<!-- price element -->
															<div class="pricing">
																<div class="title">
																	<h1>${product.productName}</h1>
																</div>
																<div class="x_content">
																	<div class="">
																		<div class="pricing_features">
																			<ul class="list-unstyled text-left">
																				<li><i class="fa fa-times text-success"></i>
																					${product.productDetail}</li>
																				<li><img src="${product.productPic}"
																					width="150" height="50" /></i></li>
																			</ul>
																		</div>
																	</div>
																	<div class="pricing_footer">
																		<a onclick="buyProduct()"
																			class="btn btn-success btn-block" role="button"
																			type="submit">buy <span> now!</span>
																		</a>
																		<script>
																			function myFunction() {
																				var myDate = document
																						.getElementById("myDate").value;
																				document
																						.getElementById("demo").innerHTML = myDate;
																				var y = document
																						.getElementById("my").value;
																				document
																						.getElementById("myD").innerHTML = y;
																			}
																		</script>
																	</div>
																</div>
															</div>
														</div>
													</c:forEach>
													<!-- price element -->
												</div>


												<div class="tab-pane" id="trip">

													<c:forEach items="${tripList}" var="trip">
														<div class="col-md-4 col-sm-6 col-xs-12">
															<!-- price element -->
															<div class="pricing">
																<div class="title">
																	<h1>${trip.tripName}</h1>
																</div>
																<div class="x_content">
																	<div class="">
																		<div class="pricing_features">
																			<ul class="list-unstyled text-left">
																				<li><i class="fa fa-times text-success"></i>
																					${trip.tripDetail}</li>
																				<li><i class="fa fa-times text-success"></i>
																					PIC</li>
																			</ul>
																		</div>
																	</div>
																	<div class="pricing_footer">
																		<a href="javascript:void(0);"
																			class="btn btn-success btn-block" role="button"
																			type="submit">buy <span> now!</span>
																		</a>
																	</div>
																</div>
															</div>
														</div>
													</c:forEach>
													<!-- price element -->
												</div>

												<div class="tab-pane" id="spa">

													<c:forEach items="${spaList}" var="spa">
														<!-- price element -->
														<div class="col-md-4 col-sm-6 col-xs-12">
															<div class="pricing">
																<div class="title">
																	<h2>${spa.spaName}</h2>
																</div>
																<div class="x_content">
																	<div class="">
																		<div class="pricing_features">
																			<ul class="list-unstyled text-left">
																				<li><i class="fa fa-check text-success"></i>
																					${spa.spaDetail} </strong></li>

																				<li><i class="fa fa-check text-success"></i>
																					Pic</li>

																			</ul>
																		</div>
																	</div>
																	<div class="pricing_footer">
																		<a href="javascript:void(0);"
																			class="btn btn-success btn-block" role="button">Buy
																			<span> now!</span>
																		</a>

																	</div>
																</div>
															</div>
														</div>
													</c:forEach>
													<!-- price element -->
												</div>

											</div>
										</div>

										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						</div>
						<div id="step-3">
							<h1 class="StepTitle w3-center">Comfirm Booking</h1>
							<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="x_panel">
									<div class="x_title">
										<h2>Personal Data</h2>
										<div class="clearfix"></div>
									</div>
									<div class="x_content">
										<br />
										<form id="demo-form2" data-parsley-validate
											class="form-horizontal form-label-left">
											<div class="form-group">
												<h2 class="control-label col-md-3 col-sm-3 col-xs-12"
													for="booking-req">Booking Req :</h2>
												<label class="col-md-6 col-sm-6 col-xs-12" for="booking-req">________
													<span class="required">*</span>
												</label>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="first-name">First Name <span class="required">*</span>
												</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="text" id="first-name" required="required"
														class="form-control col-md-7 col-xs-12">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="last-name">Last Name <span class="required">*</span>
												</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="text" id="last-name" name="last-name"
														required="required"
														class="form-control col-md-7 col-xs-12">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="nationality">Nationality <span
													class="required">*</span>
												</label>
												<div class="col-md-3 col-sm-6 col-xs-12">
													<input type="text" id="nationality" name="nationality"
														required="required"
														class="form-control col-md-7 col-xs-12">
												</div>
											</div>
											<div class="form-group">
												<label for="idcard-number"
													class="control-label col-md-3 col-sm-3 col-xs-12">ID
													card Number</label>
												<div class="col-md-3 col-sm-6 col-xs-12">
													<input id="idcard-number"
														class="form-control col-md-7 col-xs-12" type="text"
														name="idcard-number" required="required">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12">Gender</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<div id="gender" class="btn-group" data-toggle="buttons">
														<label class="btn btn-default"
															data-toggle-class="btn-primary"
															data-toggle-passive-class="btn-default"> <input
															type="radio" name="gender" value="male"> &nbsp;
															Male &nbsp;
														</label> <label class="btn btn-primary"
															data-toggle-class="btn-primary"
															data-toggle-passive-class="btn-default"> <input
															type="radio" name="gender" value="female"> Female
														</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12">Age</label>
												<div class="col-md-3 col-sm-6 col-xs-12">
													<select id="age" class="form-control" name="age">
														<option value="20">Under 20</option>
														<option value="21">Over 20</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="email"
													class="control-label col-md-3 col-sm-3 col-xs-12">Email*</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="email" class="form-control col-md-7 col-xs-12"
														type="email" name="email" required="required">
												</div>
											</div>

											<div class="form-group">
												<label for="address"
													class="control-label col-md-3 col-sm-3 col-xs-12">Address</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="address" class="form-control col-md-7 col-xs-12"
														type="text" name="address">
												</div>
											</div>
											<div class="form-group">
												<label for="phone"
													class="control-label col-md-3 col-sm-3 col-xs-12">Phone*</label>
												<div class="col-md-3 col-sm-6 col-xs-12">
													<input id="phone" class="form-control col-md-7 col-xs-12"
														type="text" name="phone" required="required">
												</div>
											</div>
										</form>
									</div>

								</div>
							</div>
							<div class="x_panel">
								<div class="x_title">
									<h2>
										<b>Room</b>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />

									<h4>
										Room type : <i id="bookroomtype"></i>
									</h4>
									<p class="font-gray-dark">
									<h5>
										Date : <i id="roomBookingDate"></i>
									</h5>
									<h5>
										Amount : <i id="booknumguest"></i>
									</h5>
									</p>
									<br /> <br />
								</div>

								<div class="x_title">
									<h2>
										<b>Add-on</b>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />
									<h4>
										<b>Product :</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Amount :</h5>
									</p>
									<br />
									<h4>
										<b>Trip :</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Date :</h5>
									<h5>Number of people :</h5>
									</p>
									<br />
									<h4>
										<b>course:</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Number of people :</h5>
									</p>

									<p class="font-gray-dark ">
									<h4 class="w3-right">
										<b> Total :
											<tr></tr> ... Baht
										</b>
									</h4>
									</p>
								</div>
							</div>

						</div>
						<div id="step-4">

							<div class="x_panel">
								<div class="x_title">
									<h2>
										<b>Personal Data</b>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />

									<h3>Booking Req :</h3>
									<p class="font-gray-dark">
									<h5>
										First name : <i id="firstname"></i>
									</h5>
									<h5>
										Last name : <i id="lastname"></i>
									</h5>
									<h5>
										Nationality : <i id="guestnationality"></i>
									</h5>
									<h5>
										ID Card Number : <i id="idcardnumber"></i>
									</h5>
									<h5>
										Gender : <i id="guestgender"></i>
									</h5>
									<h5>
										Age : <i id="guestage"></i>
									</h5>
									<h5>
										E-mail : <i id="guestemail"></i>
									</h5>
									<h5>
										Address : <i id="guestaddress"></i>
									</h5>
									<h5>
										phone : <i id="guestphone"></i>
									</h5>

									</p>
									<br /> <br />
								</div>
								<div class="x_title">
									<h2>
										<b>Room</b>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />

									<h4>
										Room type : <i id="roomtype"></i>
									</h4>
									<p class="font-gray-dark">
									<h5>
										Date : <i id="bookingDate"></i>
									</h5>
									<h5>
										Amount : <i id="numguest"></i>
									</h5>
									</p>
									<br /> <br />
								</div>

								<div class="x_title">
									<h2>
										<b>Add-on</b>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />
									<h4>
										<b>Product :</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Amount :</h5>
									</p>
									<br />
									<h4>
										<b>Trip :</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Date :</h5>
									<h5>Number of people :</h5>
									</p>
									<br />
									<h4>
										<b>course:</b>
									</h4>
									<p class="font-gray-dark">
									<h5>Number of people :</h5>
									</p>

									<p class="font-gray-dark ">
									<h4 class="w3-right">
										<b> Total :
											<tr></tr> ... Baht
										</b>
									</h4>
									</p>
								</div>
							</div>
						</div>
					</div>
					<!-- End SmartWizard Content -->
					<button type="submit" onclick="myfunction()"
						class="btn btn-success">save</button>
					<button type="save" class="btn btn-danger">finish</button>
					<script>
						function myFunction() {
							var roomBookingDate = document
									.getElementById("reservation").value;
							document.getElementById("bookingDate").innerHTML = roomBookingDate;
							document.getElementById("roomBookingDate").innerHTML = roomBookingDate;

							var roomType = document.getElementById("roomType").value;
							document.getElementById("roomtype").innerHTML = roomType;
							document.getElementById("bookroomtype").innerHTML = roomType;

							var numguest = document
									.getElementById("number-of-guest").value;
							document.getElementById("numguest").innerHTML = numguest;
							document.getElementById("booknumguest").innerHTML = numguest;

							var firstname = document
									.getElementById("first-name").value;
							document.getElementById("firstname").innerHTML = firstname;

							var lastname = document.getElementById("last-name").value;
							document.getElementById("lastname").innerHTML = lastname;

							var nationality = document
									.getElementById("nationality").value;
							document.getElementById("guestnationality").innerHTML = nationality;

							var gender = document.getElementById("gender").value;
							document.getElementById("guestgender").innerHTML = gender;

							var email = document.getElementById("email").value;
							document.getElementById("guestemail").innerHTML = email;

							var address = document.getElementById("address").value;
							document.getElementById("guestaddress").innerHTML = address;

							var phone = document.getElementById("phone").value;
							document.getElementById("guestphone").innerHTML = phone;
						}
					</script>

				</div>

			</div>
		</div>
	</div>

	<!-- Sidebar -->
	<nav
		class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-r5 w3-animate-right"
		id="mySidebar">
		<a href="javascript:void(0)" onclick="w3_close()"
			class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large"
			title="Close Menu"> <i class="fa fa-remove"></i>
		</a>
		<h4 class="w3-bar-item w3-center">
			<b>List</b>
		</h4>
		<div class="x_title">
			<h2>
				<b>Room</b>
			</h2>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
			<br />

			<h4>Room type :</h4>
			<p class="font-gray-dark">
			<h5>Night :</h5>
			<h5>Amount</h5>
			</p>
			<br /> <br />
		</div>

		<div class="x_title">
			<h2>
				<b>Add-on</b>
			</h2>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
			<br />
			<h4>
				<b>Product :</b>
			</h4>
			<p class="font-gray-dark">
			<h5>Amount :</h5>
			</p>
			<br />
			<h4>
				<b>Trip :</b>
			</h4>
			<p class="font-gray-dark">
			<h5>Date :</h5>
			<h5>Number of people :</h5>
			</p>
			<br />
			<h4>
				<b>course:</b>
			</h4>
			<p class="font-gray-dark">
			<h5>Number of people :</h5>
			</p>
	</nav>

	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 300px"></div>



</body>
<!-- jQuery -->
<script src="vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>
<!-- jQuery Smart Wizard -->
<script src="vendors/jQuery-Smart-Wizard/js/jquery.smartWizard.js"></script>
<!-- Custom Theme Scripts -->
<script src="build/js/custom.min.js"></script>
<!-- FullCalendar -->
<script src="vendors/moment/min/moment.min.js"></script>
<script src="vendors/fullcalendar/dist/fullcalendar.min.js"></script>

<!-- bootstrap-daterangepicker -->
<script src="vendors/moment/min/moment.min.js"></script>
<script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- bootstrap-datetimepicker -->
<script
	src="vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>

</html>