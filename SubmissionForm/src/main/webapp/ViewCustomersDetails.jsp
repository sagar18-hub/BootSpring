<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Swami Samarth</title>
</head>
<body>
	<h1>View Customer Details</h1>
	<h2>Details as submitted as follows:</h2>
	<form action="getdetails" method="post">
		<input type="number" name="cid"><br> <input type="submit"
			value="Submit"><br>
		<%-- <h4>Customer ID: ${cid}</h4>
<h4>Customer Name: ${cname}</h4>
<h4>Customer Email: ${cemail}</h4>	 --%>
	</form>
</body>
</html>