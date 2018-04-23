<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${msg}</h1>
<form:errors path="student1.*"/>
<form action="enrollmentStatus" method="post">
	<table>
		<tr> <td> Student Name: </td><td><input type="text" name="studentName"></td></tr>
		<tr> <td> Student Street: </td><td><input type="text" name="street"> </td></tr>
		<tr> <td> Student city: </td><td><input type="text" name="city"> </td></tr>
		<tr> <td> Student state: </td><td><input type="text" name="state"> </td></tr>
		<tr> <td> Student zip code: </td><td><input type="text" name="zipcode"> </td></tr>
		<tr> <td> Student Submitted date: </td><td><input type="text" name="submissionDate"> </td></tr>
		<tr> <td> Student subject selected: </td><td><select name="subjects" multiple="multiple"> 
			<option value="maths">Maths</option>
			<option value="telugu">Telugu</option>
			<option value="hindi">Hindi</option>
			<option value="english">English</option>
		</select></td></tr>
		<tr><td><input type="submit" value="submit"></td></tr>
	</table>
</form>
</body>
</html>