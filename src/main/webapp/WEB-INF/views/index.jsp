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
$(document).ready(function() {
	login.init();
});

var login = {
	init: function() {
		this.$login = $("#login");
	},
	bindEvent: function() {
	}
};
</script>
</head>
<body>
<div class="container">
<form class="form-signin">
	<h2 class="form-signin-heading">Please sign in</h2>
	<label for="userId" class="sr-only">Id</label><input class="form-control" id="userId" type="text" placeholder="Id" autofocus>
	<label for="userPassword" class="sr-only">Password</label><input class="form-control" id="userPassword" type="password" placeholder="Password">
	<button class="btn btn-primary btn-block" id="login">로그인</button>
	<a class="btn btn-default btn-block" href="/join">회원가입</a>
</form>
</div>
	
</body>
</html>
