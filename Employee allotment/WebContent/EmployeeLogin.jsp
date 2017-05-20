<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>body{background-image:url("leader.jpg");
background-repeat:no-repeat;
background-size:200% 200%;
background-position:centre;}</style>
<body style="background-color:white;"><img src="tm.jpg" alt="tm" width="250" height="100">

<form action="EAPController" align="right"><br><br>
	<br><br>
	<br><br>

	<b><center><font color="red" align="">Login Id :<input type="text" name="userName" maxlength="15" style="background-color:lightgrey" /></center></font></b>
	<br>

	<b><center><font color="red">Password : <input type=password name="password" maxlength="12" style="background-color:lightgrey"></font></center>
	</b>
	<br>
	<input type="hidden" value="EmployeeLogin"name="role">
	<center><input type="submit"value="submit" style="background-color:floralwhite;color:red"></center>
</form>
</body>
</html>