<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h2>Login Form</h2>
<form action="login" action="post">
<input type="hidden" name="requestAction" value="login" />

 <label for="userName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>

</form>
<h2 style="color:red">
	<%	
		if (null != request.getAttribute("errorMessage")) {
	%>
	<%=request.getAttribute("errorMessage")%>
	<%
		}
	%>
	
</center>

</body>
</html>