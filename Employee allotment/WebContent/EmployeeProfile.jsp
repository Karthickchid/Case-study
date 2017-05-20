<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<form name="profile">

    <% ResultSet rs =(ResultSet)session.getAttribute("resultset"); 
      out.println("this is getAttribute of resultset of view profile");

    %>
    <% while(rs.next()){ %> <%rs.getString(1); %>  <% } %>
     <%-- <TABLE>
       
        <% while(rs.next()){ %>
         <TR>
           <TH>Application ID</TH>
        <tr>

            <td> <input type="text" name="empID" value="<%=rs.getString(1) %>"></td>
        </tr>
         <TH>Employee ID</TH>
        <tr>

            <td><input type="text" name="employeeName" value="<%=rs.getString(2) %>"></td>
        </tr>
         <TH>DOJ</TH>
        <tr>

            <td><input type="text" name="" value="<%=rs.getString(3) %>"></td>
        </tr>
        <TH>BU</TH>
        <tr>

            <td><input type="text" name="BU" value="<%=rs.getString(4) %>"></td>
        </tr>
         <TH>Project</TH>
        <tr>

            <td><input type="text" name="Project" value="<%=rs.getString(5) %>"></td>

        </tr>  
         <TH>Designation</TH>
         <tr>

            <td><input type="text" name="Designation" value="<%=rs.getString(6) %>"></td>

        </tr>     
         <TH>Location</TH>
         <tr>

            <td><input type="text" name="Designation" value="<%=rs.getString(7) %>"></td>

        </tr>       
        <% } %>
         </TR>
    </TABLE>    
 --%>


 </form>    