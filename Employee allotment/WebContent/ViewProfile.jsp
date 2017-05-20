<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>profile</title>

<script>
function formAction()
{
	if(document.viewProfile.empId.value=="")

	{
	alert("Please enter Employee Id");
	return false;
	}

	else
		return true;
}
</script>
</head>
<body><center><h2>Enter Employee Id</h2><br>
<form name="viewProfile" onSubmit="return formAction()" action="EAPController">
<table border=2>
<tr>
<td>
Employee Id:</td>
<td><input type="text" name="empId"></td></tr></table>
<br>
<input type="hidden" name="role" value="viewProfile">
<input type="submit" value="View profile">
</form></center>
</body>
</html>