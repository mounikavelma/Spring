<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enrollment Success</h1>
${msg}
<h2> Student details are:</h2>
<h4> Student Name: ${student1.studentName}</h4>
<h4> Student Street: ${student1.street}</h4>
<h4> Student city: ${student1.city}</h4>
<h4> Student state: ${student1.state}</h4>
<h4> Student zipcode: ${student1.zipcode}</h4>
<h4> Student submitted date: ${student1.submissionDate}</h4>
<h4> Student subjects: ${student1.subjects}</h4>
</body>
</html>