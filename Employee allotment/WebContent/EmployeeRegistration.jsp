<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title</title>
<script>
  function validate()
  {
	  var q;
	  var qt;
 	if(document.form1.empId.value=="")

	{
	alert("Please enter Employee Id");
	return false;
	}
 	 
 	else if( document.form1.name.value=="")
 		 {
 		  alert(" enter  name");
 		  
 		  return false;
 		 }
 	else if(form1.gender[0].checked==false && form1.gender[1].checked==false)
 		 {
 		 alert("enter your gender");
 		 return false;
 		 }
 		 
 	 var s=document.getElementById("status");
 	 var st= s.options[s.selectedIndex].value;
 	 if(st==0)
 		 {
 		 alert("enter maritial status");
 		 return false;
 		 }
 	 
 	else if(document.form1.textdob.value=="")

	{
	alert("Please enter date");
	return false;
	}
 	 
 	 q=document.getElementById("qua");
 	 
 	 qt= q.options[q.selectedIndex].value;
 	if(qt=="select")
	    {
	    alert("enter an option");
	   return false;
	     }
 	else if(document.form1.agg.value=="")

	{
	alert("Please enter Aggregate");
	return false;
	}
 	else if(1)
 		{
 	 var sk=document.getElementById("skills");
 	 var skill= sk.options[sk.selectedIndex].value;
 	  if(skill=="select")
 		    {
 		    alert("enter an option");
 		   return false;
 		     }
 		
 	 var ss;
 	 ss=document.getElementById("ski");
 	 var s2;
 	 s2= ss.options[ss.selectedIndex].value;
 	
 	  if(s2=="select")
 		 {
 		 alert("enter an option");
 		 return false;
 		 }
 		
 		}
 	 var m;
 	 m=form1.mobileno.value;
 	  if( m==""||isNaN(m)||m.indexOf()!=-1)
 		 {
 		  alert(" enter  valid mobile number");
 		  form1.mobileno.focus();
 		  return false;
 		 }
 	 
 /* 	 var e=form1.email.value;
 	 var at="@";
 	 var dot=".";
 	 var lat= e.indexOf(at);
 	 var lstr= e.length;
 	 var ldot= e.indexOf(dot);
 	 if( e==""||e==null||lat==-1||ldot==-1 )
 		 {
 		  alert(" enter valid email id");
 		  form1.email.focus();
 		  return false;
 		 }
 	 */
 	 if(document.form1.address.value==null)
 		 {
 		 alert("enter address");
 		 return false;
 		 }
 	 
 	 var st;
 	 st=document.getElementById("state");
 	 if(st.options[st.selectedIndex].value=="select")
 		 {
 		 alert("enter a valid state");
 		 return false;
 		 }
 	 var ct=document.getElementById("city");
 	 if(ct.options[ct.selectedIndex].value=="select")
 		 {
 		 alert("enter valid city");
 		 return false;
 		 }
 	 else
 		 {
 		 return true;
 		 } 
  }

  </script> 
  
</head>
<style>
body{
background-color:lightgrey}</style>
<body>
<center><h1><font color="red">Enter Your Details</font></h1></center>
<form name="form1" action="EAPController" >
<table >
<tr>
<td><font color="red">Employee Id</font></td> 
<td><input type="text" name="empid"></td></tr>

<tr>
<td><font color="red"> Name:</font> </td>
<td> <input type="text" name="name" /> </td> </tr>

<tr>
<td><font color="red"> Gender:</font></td>
<td> <input type= "radio"  name="gender" value= "male" ><font color="red"> Male</font>
        <input type= "radio" name="gender" value="female"><font color="red"> Female </font></td> </tr>
<tr>
<td><font color="red"> Marital Status: </font></td>
<td> <select  name="marital" id= "status">
                 <option value="" > </option>
                 <option value="single" >Single </option>
                 <option value="married">Married</option>
                 </select>  </td> </tr>

 <tr>
<td><font color="red">Date</font></td> 
<td><input type="date" name="date"></td>
</tr>

<tr>
<td><font color="red"> Qualification:</font></td>
<td> <select name="qualification" id="qua">
                 <option value="select" > select </option>
				<option value="graduate"> Under Graduate </option>
				<option value= "post graduate"> Post Graduate </option>
				<option value= "diploma"> Diploma </option>
				<option value= "metric"> Metric </option>
				<option value="professional"> Professional </option>
				</select>	</td> </tr>
				<tr>
<td><font color="red">Aggregate:</font></td> 
<td><input type="text" name="agg"></td>
</tr>
<tr>
<td><font color="red"> Choose skill set:</font> </td>
 <td> <select name="skill1" id= "skills">
           <option value="select" > select </option>
           <option value= "c"> C </option>
           <option value= "java"> Java </option>
           <option value= "cpp"> CPP </option>
           <option value= "OS"> OS </option>
</select> </td>
<td> <select name="skill2" id="ski">
       <option value="select" > select </option>
       <option value= "oracle"> Oracle </option>
       <option value= "jsp"> JSP </option>
       <option value= "html"> HTML </option>
       <option value= "PHP"> PHP </option>
      
</select> </td> </tr>

<tr>
<td><font color="red"> Mobile number:</font></td>
<td> <input type="text" name="mobileno" maxlength="10" > </td> </tr>


<tr>
<td> <font color="red">Email id: </font></td>
<td> <input type="email" name="email" /></td></tr>

<tr>
<td> <font color="red">Address: </font></td>
<td> <textarea name= "address" rows="3" > </textarea> </td>
</tr>

<tr>
<td> <font color="red">State</font> </td>
<td> <select name="state" id="state">
       <option value="select" > select </option>
       <option value= "ap"> Andhra Pradesh </option>
       <option value= "tn"> Tamilnadu </option>
       <option value= "kr"> Karnataka </option> 
</select> </td> </tr>

<tr>
<td> <font color="red">City</font> </td>
 <td> <select  name="city" id="city">
       <option value="select"> select </option>
       <option value= "hyd"> Hyderabad </option>
       <option value= "bl"> Banglore </option>
       <option value= "ch"> Chennai </option> 
       <option value= "viz"> Vizag </option>
       <option value= "co">Coimbatore </option>
</select> </td> </tr>

 
<tr>	
  <input type="hidden" value="insert" name="role"/> 
<td> <br><td><center><input type= "submit" name="option"  value= "Submit" style="background-color:white;color:red;"></center></td> </tr>
</table>

			 
</form>

</body>
</html>

