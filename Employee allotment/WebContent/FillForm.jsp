<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HR Employee Form</h1>
<form action="EAPController">
<table>
<tr><td>Application Number</td><td><input type="text" name="appNo"></td></tr>
<tr><td>EmpID</td><td><input type="text" name="empId"></td></tr>
<tr><td>Date of Joining</td><td><input type="text" name="doj"></td></tr>
<tr><td>BU</td><td><input type="text" name="BU"></td></tr>
<tr><td>Project </td><td><input type="text" name="project"></td></tr>
<tr><td>Designation </td><td><input type="text" name="designation"></td></tr>
<tr><td>Location </td><td><input type="text" name="location"></td></tr>
<input type="hidden" value="Fill Form" name="role">
<tr><td><input type="submit" name="submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>