<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<title>Hostel Booking</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/popup.css">
<link rel="stylesheet" href="css/stlye.css">


<body>

	<!-- Navbar (sit on top) -->
	<div class="w3-top">
		<div class="w3-bar" id="myNavbar">
			<a
				class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-right"
				href="javascript:void(0);" onclick="toggleFunction()"
				title="Toggle Navigation Menu"> <i class="fa fa-bars"></i>
			</a> <a href="#home" class="w3-bar-item w3-button">HOME</a> <a
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
			</a> <a href="booking.html"
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
			</a> <a href="booking.do"
				class="w3-bar-item w3-button w3-hide-small w3-right"> <i
				class="fa fa-home"></i> Booking
			</a>

		</div>
	</div>

	<!-- First Parallax Image with Logo Text -->
	<div class="bgimg-1 w3-display-container w3-opacity-min" id="home">
		<div class="w3-display-middle" style="white-space: nowrap;">
			<span
				class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity">BOOK
				NOW</span>
		</div>
	</div>
	


	<!-- Container (Promotion Section) -->
	<div class="slideshow-container" id="promotion">

		<!-- Full-width images with number and caption text -->
		<div class="mySlides fade">
			<img src="img/promotion.jpg" style="width: 1000px; height: 400px;">
		</div>

		<div class="mySlides fade">
			<img src="img/promotion2.jpg"
				style="width: 1000px; height: 400px;">
		</div>
		<!-- Next and previous buttons -->
		<a class="prev" onclick="plusSlides(-1)">&#10094;</a> <a class="next"
			onclick="plusSlides(1)">&#10095;</a>
	</div>
	<br>
<!-- The dots/circles -->
	<div style="text-align: center">
		<span class="dot" onclick="currentSlide(1)"></span> <span class="dot"
			onclick="currentSlide(2)"></span>
	</div>
	<script>
		var slideIndex = 1;
		showSlides(slideIndex);

		function plusSlides(n) {
			showSlides(slideIndex += n);
		}

		function currentSlide(n) {
			showSlides(slideIndex = n);
		}

		function showSlides(n) {
			var i;
			var slides = document.getElementsByClassName("mySlides");
			var dots = document.getElementsByClassName("dot");
			if (n > slides.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = slides.length
			}
			for (i = 0; i < slides.length; i++) {
				slides[i].style.display = "none";
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" active", "");
			}
			slides[slideIndex - 1].style.display = "block";
			dots[slideIndex - 1].className += " active";
		}
	</script>
	<!-- End Container (Promotion Section) -->
	<div class="w3-row w3-center w3-dark-grey w3-padding-16">
		<h3 class="w3-center">Service</h3>
		<div class="w3-col m6 l6">
			<div class="container">
				<img src="img/spa.jpg" alt="Avatar" class="image">
				<div class="overlay">
					<div class="text">Spa & massage therapy</div>
				</div>
			</div>
		</div>

		<div class="w3-col m6 l6">
			<div class="container">
				<img src="img/trip.jpg" alt="Avatar" class="image">
				<div class="overlay">
					<div class="text">Trip</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Second Parallax Image with Room Text
    <div class="bgimg-2 w3-display-container w3-opacity-min">
        <div class="w3-display-middle">
            <span class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity" id="room">ROOM</span>
        </div>
    </div> -->

	<!-- Container (Portfolio Section) -->
	<div class="w3-content w3-container w3-padding-64">
		<h3 class="w3-center">ROOM</h3>
		<p class="w3-center">
			<em>Here are some of my latest lorem work ipsum tipsum. <br>
				Click on the images to make them bigger
			</em>
		</p>
		<br>

		<!-- Responsive Grid. Four columns on tablets, laptops and desktops. Will stack on mobile devices/small screens (100% width) -->
		<div class="w3-row-padding w3-center">
			<a> <c:forEach items="${roomList}" var="room"></a>
			<div class="w3-col m3">
				<img src="${room.roomPic}" style="width: 100%" onclick="onClick(this)"
					class="w3-hover-opacity" alt="${room.roomType} ${room.roomDetail}">
			</div>
			</c:forEach>
		</div>
	</div>

	<!-- Modal for full size images on click-->
	<div id="modal01" class="w3-modal w3-black"
		onclick="this.style.display='none'">
		<span class="w3-button w3-large w3-black w3-display-topright"
			title="Close Modal Image"> <i class="fa fa-remove"></i>
		</span>
		<div
			class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
			<img id="img01" class="w3-image">
			<p id="caption" class="w3-opacity w3-large"></p>
		</div>
	</div>

	<!-- Third Parallax Image with Portfolio Text -->
	<div class="bgimg-3 w3-display-container w3-opacity-min">
		<div class="w3-display-middle">
			<span
				class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity">CONTACT</span>
		</div>
	</div>

	<!-- Container (Contact Section) -->
	<div class="w3-content w3-container w3-padding-64" id="contact">
		<h3 class="w3-center">WHERE I WORK</h3>
		<p class="w3-center">
			<em>I'd love your feedback!</em>
		</p>

		<div class="w3-row w3-padding-32 w3-section">
			<div class="w3-col m4 w3-container">
				<!-- Add Google Maps -->
				<div id="googleMap" class="w3-round-large w3-greyscale"
					style="width: 100%; height: 400px;"></div>
			</div>
			<div class="w3-col m8 w3-panel">
				<div class="w3-large w3-margin-bottom">
					<i
						class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
					Chicago, US<br> <i
						class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
					Phone: +00 151515<br> <i
						class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
					Email: mail@mail.com<br>
				</div>
				<p>
					Swing by for a cup of <i class="fa fa-coffee"></i>, or leave me a
					note:
				</p>
				<form action="/action_page.php" target="_blank">
					<div class="w3-row-padding" style="margin: 0 -16px 8px -16px">
						<div class="w3-half">
							<input class="w3-input w3-border" type="text" placeholder="Name"
								required name="Name">
						</div>
						<div class="w3-half">
							<input class="w3-input w3-border" type="text" placeholder="Email"
								required name="Email">
						</div>
					</div>
					<input class="w3-input w3-border" type="text" placeholder="Message"
						required name="Message">
					<button class="w3-button w3-black w3-right w3-section"
						type="submit">
						<i class="fa fa-paper-plane"></i> SEND MESSAGE
					</button>
				</form>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<footer
		class="w3-center w3-black w3-padding-64 w3-opacity w3-hover-opacity-off">
		<a href="#home" class="w3-button w3-light-grey"><i
			class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
		<div class="w3-xlarge w3-section">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
		</div>
		<p>
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-text-green">w3.css</a>
		</p>
	</footer>

	<!-- Add Google Maps -->
	<script>
		function myMap() {
			myCenter = new google.maps.LatLng(41.878114, -87.629798);
			var mapOptions = {
				center : myCenter,
				zoom : 12,
				scrollwheel : false,
				draggable : false,
				mapTypeId : google.maps.MapTypeId.ROADMAP
			};
			var map = new google.maps.Map(document.getElementById("googleMap"),
					mapOptions);

			var marker = new google.maps.Marker({
				position : myCenter,
			});
			marker.setMap(map);
		}

		// Modal Image Gallery
		function onClick(element) {
			document.getElementById("img01").src = element.src;
			document.getElementById("modal01").style.display = "block";
			var captionText = document.getElementById("caption");
			captionText.innerHTML = element.alt;
		}

		// Change style of navbar on scroll
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

		// Used to toggle the menu on small screens when clicking on the menu button
		function toggleFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>
	<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

	<!-- popup1 login start -->
	<div id="popupLogin" class="overlayPopup">
		<div class="popup">
			<a class="close" href="#">&times;</a>
			<div class="w3ls-main">
				<div class="wthree-container">
					<div class="wthree-form">
						<div class="agileits-2">
							<h2>login</h2>
						</div>
						<form action="#" method="post">
							<div class="w3-user">
								<span><i class="" aria-hidden="true"></i></span> <input
									type="text" name="Username" placeholder="Username" required="">
							</div>
							<div class="clear"></div>
							<div class="w3-psw">
								<span><i class="" aria-hidden="true"></i></span> <input
									type="password" name="password" placeholder="Password"
									required="">
							</div>
							<div class="clear"></div>
							<div class="w3l">
								<span><a href="#">forgot password ?</a></span> <span><a
									href="#popupRegister">Register</a></span>
							</div>
							<div class="clear"></div>
							<div class="w3l-submit">
								<input type="submit" value="login">
							</div>
							<div class="clear"></div>
						</form>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
		<!-- //content -->
	</div>
	<!-- popup1 login end-->
	<!-- popup2 register start -->
	<div id="popupRegister" class="overlayPopup">
		<div class="popup">
			<a class="close" href="#">&times;</a>
			<div class="w3ls-main">
				<div class="center-container">
					<div class="w3ls-header">
						<div class="header-main">
							<h1>Register</h1>
							<div class="header-bottom">
								<div class="header-right w3agile">
									<div class="header-left-bottom agileinfo">
										<form action="#" method="post">
											<div class="icon1">
												<i class="fa fa-credit-card-alt" aria-hidden="true"></i> <input
													type="text" placeholder="Enter your id card" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-user" aria-hidden="true"></i> <input
													type="text" placeholder="Enter your name" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-user" aria-hidden="true"></i> <input
													type="text" placeholder="Enter your nationality"
													required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-user" aria-hidden="true"></i> <input
													type="text" placeholder="Enter your race" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-envelope" aria-hidden="true"></i> <input
													type="email" placeholder="Enter your email" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-phone" aria-hidden="true"></i> <input
													type="tel" placeholder="Phone number" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-street-view" aria-hidden="true"></i> <input
													type="password" placeholder="Address" required="" />
											</div>
											<div class="icon1">
												<i class="fa fa-lock" aria-hidden="true"></i> <input
													type="password" placeholder="Password" required="" />
											</div>
											<div class="bottom">
												<input type="submit" value="Register" />
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- //content -->
		</div>
		<!-- popup2 Register end-->
</body>

</html>