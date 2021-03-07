<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstlc" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gym Management</title>
</head>
<body style="background-color:red;">
<jsp:include page="header.jsp"></jsp:include>
<fieldset>
<CENTER>
<h1><U><I><B>GYM MEMBERS DETAIL</B></I></U></h1>

</p>		
		<table border="1" cellspacing ="5" cellpading="10">
		 <thead>
		  <th>id</th> 
		  <th>name</th>
		   <th>bloodgroup</th>
		    <th>duration</th>
		    <th>emailid</th>
		    <th>phoneno</th>
		    <th>address</th>
		    <th>state</th>
		    <th>city</th>
		    <th>taluka</th>
		    <th>pincode</th>
		    <th>gender</th>
		    <th>hobbies</th>
		    <th>course</th>
		    <th>Action</th>
		 
		      </thead> 
		      <jstlc:forEach var="gym" items="${gyms_list}"> 
		      <tr> 
		      <td>${gym.id}</td>
		      <td>${gym.name}</td> 
		      <td>${gym.bloodgroup}</td> 
		      <td>${gym.duration}</td> 
		      <td>${gym.emailid}</td> 
		      <td>${gym.phoneno}</td> 
		      <td>${gym.address}</td> 
		      <td>${gym.state}</td> 
		      <td>${gym.city}</td> 
		      <td>${gym.taluka}</td> 
		      <td>${gym.pincode}</td> 
		      <td>${gym.gender}</td> 
		      <td>${gym.hobbies}</td> 
		      <td>${gym.course}</td> 
		      <td>
		      		      
		      <a href="delete?id=${gym.id}" onclick="javascript: return confirm('Are you sure you want to delete?');">Delete</a></td>
		      </tr>
		       </jstlc:forEach>
		        </table>
</CENTER>
</fieldset>
</body>
</html>