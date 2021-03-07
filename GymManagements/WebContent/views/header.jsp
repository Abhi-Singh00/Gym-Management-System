
<%
	String session_username = (String) session.getAttribute("username");
%>

<%
	if (session_username != null) {%>

<div style="float: right">
Welcome <%= session.getAttribute("username") %> |
	<a href="${pageContext.request.contextPath}/logout">LOGOUT</a>
</div>

<div style="float: left">
	<a href="${pageContext.request.contextPath}/add_gym">ADD</a>|
	<a href="${pageContext.request.contextPath}/dashboard">VIEW</a>
</div>

<%}%>
<br>

