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
<body>

<form action="EAPController" name="approveOffer" onSubmit="return formAction()">
Employee Id:
<input type="text" name="empID">
<input type="hidden" name="role"value="approveOffer">
<input type="submit" value="Approve"></form>
</body>
</html>