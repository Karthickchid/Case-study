<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function formAction()
{
	if(document.viewStatus.appNo.value=="")

	{
	alert("Please enter application number");
	return false;
	}

	else
		return true;
}
</script>

</head>
<body bgcolor="">
<center>
<h2> Employee Status</h2>

<form name="viewStatus" onSubmit="return formAction()" action="approve.htm">
<table border=2>
<tr>
<td>Application Number:</td>
<td><input type="text" align="middle" name="appNo"></td>
</tr>

</table>
<br>
<input type="submit" align="middle" value="Approve">
<input type="reset"  align="middle" value="Reset">

</form></center>
</body>
</html>