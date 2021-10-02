<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
Login

<form action="<%=request.getContextPath()%>/Controller" method="get">
	Full Name:  <input type="text" id="fname" name="name"><br>
	Gender: <input type="radio" name="gender" value="male"> Male
			<input type="radio" name="gender" value="female"> Female <br />
	Languages know: <input type="checkbox" name="language" value="english"> English
					<input type="checkbox" name="language" value="hindi"> Hindi
					<input type="checkbox" name="language" value="French"> French <br />
	Countries:  <select name="country">
				<option value="India">India</option>
				<option value="USA">USA</option>
				<option value="UK">UK</option>
				<option value="Finland">Finland</option>
				</select><br />
			<input type="submit" value="submit">
</form>
</body>
</html>