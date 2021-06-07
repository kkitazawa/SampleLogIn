<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SampleLogIn</title>
</head>
<body>

<form action = "../Login.action" method = "post">
	<p>id<input type ="text" name = "login"></p>
	<p>パスワード<input type = "password" name = "password"></p>
	<p><input type = "submit" value ="ログイン"></p>
</form>

</body>
</html>