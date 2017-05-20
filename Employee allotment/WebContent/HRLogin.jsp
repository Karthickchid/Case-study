<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hr Login Page</title>
</head>
<style>
body{
background-color:lightgrey;
background-image:url("lock.jpg");
background-repeat:no-repeat;

background-size:85% 300%;}</style>
<body>
<form action="EAPController">
	<b><center><font color="red">LogIn Page</font></center></b>
	<br><br><br><br>


	<b><center><font color="red">Login Id :<input type="text" name="userName" maxlength="15" style="background-color:lightgrey"/></font></center></b>
	<br>
	
	<b><center><font color="red">Password : <input type=password name="password" maxlength="12" style="background-color:lightgrey"></font></center>
	</b>
	<br>
	<input type="hidden"value="HRLogin"name="role">
	<center><input type="submit"value="submit" style="color:red"></center>
</form>
</body>
</html>