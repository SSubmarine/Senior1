<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/favicon.ico" type=h "image/ico" />

<title>Admin Manage Spa</title>

<!-- Bootstrap -->
<link href="vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- iCheck -->
<link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">

<!-- bootstrap-progressbar -->
<link
	href="vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet">
<!-- JQVMap -->
<link href="vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet" />
<!-- bootstrap-daterangepicker -->
<link href="vendors/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<jsp:include page="SidebarAdmin.jsp" />
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<div class="page-title">
						<div class="title_left"></div>

						<div class="">
							<div
								class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Search for..."> <span
										class="input-group-btn">
										<button class="btn btn-default" type="button">Go!</button>
									</span>
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>

					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Manage Spa</h2>
									<ul class="nav navbar-right panel_toolbox">
										<li><a class="btn btn-link" data-toggle="modal"
											data-target="#CalenderModalNew"> <i
												class="fa fa-plus-square"></i>
										</a></li>
										</li>
									</ul>
									<div class="clearfix"></div>
								</div>

								<div class="x_content">

									<table id="" class="table table-sspaed table-bordered">
										<thead>
											<tr>
												<th>Spa Id</th>
												<th>Spa Name</th>
												<th>Spa Detail</th>
												<th>Spa Picture</th>
												<th>Manage</th>
											</tr>
										</thead>


										<tbody>
											<c:forEach items="${spaList}" var="spa">
												<tr>
													<td>${spa.spaId}</td>
													<td>${spa.spaName}</td>
													<td>${spa.spaDetail}</td>
													<td><img src="${spa.spaPic}" width="250" height="250" /></td>
													<td><a class="btn btn-info btn-xs" data-toggle="modal"
														data-target="#CalenderModalEdit"><i
															class="fa fa-pencil"></i> Edit </a> <a onclick="myFunction()"
														class="btn btn-danger btn-xs"
														href="deleteSpa.do?id=${spa.spaId}"><i
															class="fa fa-trash-o"></i> Delete </a> <script>
																function myFunction() {
																	alert("DELET SUCCESS!");
																}
															</script></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>


	<!-- calendar modal -->
	<div id="CalenderModalNew" class="modal fade" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form:form method="post" action="saveSpa.do" commandName="spa"
					enctype="multipart/form-data">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">x</button>
						<h4 class="modal-title" id="myModalLabel">Add Spa</h4>
					</div>
					<div class="modal-body">
						<div id="testmodal" style="padding: 5px 20px;">

							<div class="form-group">
								<label class="col-sm-3 control-label">Spa Name</label>
								<div class="col-sm-9">
									<form:input path="spaName" type="text" class="form-control"
										id="title" name="title" />

								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">Spa Detail</label>
								<div class="col-sm-9">
									<form:input path="spaDetail" type="text" class="form-control"
										id="title" name="title" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">Spa Picture</label>
								<div class="col-sm-9">
									<input name="files" type="file" />

								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<input type="submit" value="Save"
							class="btn btn-primary antosubmit" />
					</div>
				</form:form>
			</div>
		</div>
	</div>

	<div id="CalenderModalEdit" class="modal fade" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form:form method="post" action="saveSpa.do" commandName="spa"
					enctype="multipart/form-data">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">Close</button>
						<h4 class="modal-title" id="myModalLabel">Edit Spa</h4>
					</div>
					<div class="modal-body">
						<div id="testmodal" style="padding: 5px 20px;">
							<form id="antoform" class="form-horizontal calender" role="form">
								<div class="form-group">
									<label class="col-sm-3 control-label">Spa Name</label>
									<div class="col-sm-9">
										<form:input path="spaName" type="text" class="form-control"
											id="title" name="title" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Spa Detail</label>
									<div class="col-sm-9">
										<form:input path="spaDetail" type="text" class="form-control"
											id="title" name="title" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label"> Picture</label>
									<div class="col-sm-9">
										<input name="files" type="file" />
									</div>
								</div>
							</form>
						</div>
					</div>
					<div class="modal-footer">
						<input type="submit" value="Save"
							class="btn btn-primary antosubmit" />
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<!-- /calendar modal -->

	<!-- jQuery -->
	<script src="vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="vendors/nprogress/nprogress.js"></script>
	<!-- iCheck -->
	<script src="vendors/iCheck/icheck.min.js"></script>
	<!-- Datatables -->
	<script src="vendors/datatables.net/js/jquery.dataTables.min.js"></script>
	<script src="vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
	<script
		src="vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
	<script
		src="vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
	<script src="vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
	<script src="vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
	<script src="vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
	<script
		src="vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
	<script
		src="vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
	<script
		src="vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
	<script
		src="vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
	<script src="vendors/jszip/dist/jszip.min.js"></script>
	<script src="vendors/pdfmake/build/pdfmake.min.js"></script>
	<script src="vendors/pdfmake/build/vfs_fonts.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="build/js/custom.min.js"></script>

</body>

</html>