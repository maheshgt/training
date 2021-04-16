<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<P>successfully complete your booking</P>

	<table style="width: 80%;border: 2px">
		<tr>
			<td>Id</td>
			<td>UserId</td>
			<td>RouteId</td>
			<td>Date</td>
		</tr>

		<tr>
			<td>${ride.rideId}</td>
			<td>${ride.userId}</td>
			<td>${ride.routeId}</td>
			<td>${ride.date}</td>
		</tr>


	</table>
</body>
</html>