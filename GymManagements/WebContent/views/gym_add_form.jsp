<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Form</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<form action="${pageContext.request.contextPath}/add_gym_action"
		modelAttribute="gym">
		<div class="container">
			<h1>Add Member Detail</h1>
<p>
			<hr>
			<b>Name</b> <input type="text"
				placeholder="Enter Name" name="name" > 
			 <b>Blood group</b> <input type="text"
				placeholder="Enter blood group" name="bloodgroup" >

			<hr>
			 <b>Duration</b> <input type="text"
				placeholder="Enter Duration" name="duration" >
				<b>Enter Your Email :</b> <input type="email"
				placeholder="Enter Email" name="emailid" id="email" >
			<hr>
			<b>Phone No.</b> <input type="text"
				placeholder="Enter Phone No." name="phoneno"> 
			 <b>Address</b> <input type="text"
				placeholder="Enter your permanent address" name="address" >
			<hr>
	<b>State</b> <input type="text"
				placeholder="Enter state" name="state" > 
				<b>City</b> <input type="text"
				placeholder="Enter city" name="city" >
			<hr>
			 <b>Taluka</b> <input type="text"
				placeholder="Enter Taluka" name="taluka" > 
				 <b>Pin code</b> <input type="text"
				placeholder="Enter Pin code" name="pincode" >
			<hr>
			<p>
				<b>Gender</b> <input type="radio" name="gender" value="male">
				Male <input type="radio" name="gender" value="female">
				Female
			</p>
			 <b>Hobbies</b><input type="text"
				placeholder="Enter Hobbies" name="hobbies" >
			<hr>
			 <b>Course</b></label> <select
				id="course" name ="course">
				<option value="functional workout">Functional Workout</option>
				<option value="fat loss">Fat Loss</option>
				<option value="cardio">Cardio</option>
				<option value="muscle gain">Muscle Gain</option>
			</select>
			</p>
			<hr>
			<p>
				By creating an account you agree to our <a href='#'>Terms &
					Privacy</a>.
			</p>
			<input type="submit" name="add" value="Add">
		</div>
	</form>

</body>
</html>