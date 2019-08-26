<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" name="login" action="/login">
		<p>아이디</p>
		<input name="username" id="username" type="text" /><br />
		<p>비밀번호</p>
		<input name="password" id="password" type="password" /><br />
		<input type="submit" name="login" value="로그인"/>
	</form>
</body>
</html>