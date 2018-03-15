<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="build/js/daypilot-all.min.js"></script>
<style type="text/css">
p, body, td {
	font-family: Tahoma, Arial, Helvetica, sans-serif;
	font-size: 10pt;
}

body {
	padding: 0px;
	margin: 0px;
	background-color: #ffffff;
}

a {
	color: #1155a3;
}

.space {
	margin: 10px 0px 10px 0px;
}

.header {
	background: #003267;
	background: linear-gradient(to right, #011329 0%, #00639e 44%, #011329 100%);
	padding: 20px 10px;
	color: white;
	box-shadow: 0px 0px 10px 5px rgba(0, 0, 0, 0.75);
}

.header a {
	color: white;
}

.header h1 a {
	text-decoration: none;
}

.header h1 {
	padding: 0px;
	margin: 0px;
}

.main {
	padding: 10px
}
</style>
</head>
<body>
	<div class="main">
		<div id="dp"></div>
	</div>

	<script>
		var dp = new DayPilot.Scheduler("dp", {
			locale : "en-us",
			cellWidthSpec : "Fixed",
			cellWidth : 40,
			crosshairType : "Header",
			timeHeaders : [ {
				"groupBy" : "Month"
			}, {
				"groupBy" : "Day",
				"format" : "d"
			} ],
			scale : "Day",
			days : DayPilot.Date.today().daysInMonth(),
			startDate : DayPilot.Date.today().firstDayOfMonth(),
			showNonBusiness : true,
			businessWeekends : false,
			floatingEvents : true,
			eventHeight : 30,
			eventMovingStartEndEnabled : false,
			eventResizingStartEndEnabled : false,
			timeRangeSelectingStartEndEnabled : false,
			groupConcurrentEvents : false,
			eventStackingLineHeight : 100,
			allowEventOverlap : true,
			timeRangeSelectedHandling : "Enabled",
			onTimeRangeSelected : function(args) {
				var dp = this;
				DayPilot.Modal.prompt("Create a new event:", "Booked").then(
						function(modal) {
							dp.clearSelection();
							if (!modal.result) {
								return;
							}
							dp.events.add(new DayPilot.Event({
								start : args.start,
								end : args.end,
								id : DayPilot.guid(),
								resource : args.resource,
								text : modal.result
							}));
						});
			},
			eventMoveHandling : "Update",
			onEventMoved : function(args) {
				this.message("Event moved");
			},
			eventResizeHandling : "Update",
			onEventResized : function(args) {
				this.message("Event resized");
			},
			eventDeleteHandling : "Update",
			onEventDeleted : function(args) {
				this.message("Event deleted");
			},
			eventClickHandling : "Disabled",
			eventHoverHandling : "Disabled",
			treeEnabled : true,
		});
		dp.resources = [ {
			name : "Resource 1",
			id : "R1"
		}, {
			name : "Resource 2",
			id : "R2"
		} ];
		dp.events.list = [];
		dp.init();
	</script>

</body>
</html>