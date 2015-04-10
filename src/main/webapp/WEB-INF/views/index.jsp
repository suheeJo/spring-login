<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>로그인</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/signin.css" rel="stylesheet">
<script src="/resources/js/jquery-1.11.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
<div class="container">
<form class="form-signin">
	<h2 class="form-signin-heading">Please sign in</h2>
	<label for="inputEmail" class="sr-only">Id</label><input class="form-control" id="id" type="text" placeholder="Id" required autofocus>
	<label for="inputPassword" class="sr-only">Password</label><input class="form-control" id="password" type="password" placeholder="Password" required>
	<button class="btn btn-primary btn-block" type="submit">로그인</button>
	<button class="btn btn-default btn-block" type="reset">회원가입</button>
</form>
</div>
	
</body>
</html>
