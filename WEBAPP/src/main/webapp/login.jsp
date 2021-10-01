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

<form action="submit.jsp" method="get">
	Full Name:  <input type="text" id="fname" name="fname"><br>
	Gender: <input type="radio" name="gender" value="male"> Male
			<input type="radio" name="gender" value="female"> Female <br />
	Languages know: <input type="checkbox" name="language" value="english"> English
					<input type="checkbox" name="language" value="hindi"> Hindi
					<input type="checkbox" name="language" value="French"> French <br />
</form>
</body>
</html>