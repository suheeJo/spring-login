<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
	<title>Bootstrap 101 Template</title>
	
	<!-- Bootstrap -->
	<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
	<form class="form-signin" method="post">
		<h2 class="form-signin-heading">Please sign in</h2>
		<label for="inputEmail" class="sr-only">Email address</label><input type="email" id="inputEmail" class="form-control" placeholder="Email address">
		<label for="inputPassword" class="sr-only">Password</label><input type="password" id="inputPassword" class="form-control" placeholder="Password">
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	</form>
</div>
	
<script src="/resources/js/jquery-1.11.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
</body>
</html>