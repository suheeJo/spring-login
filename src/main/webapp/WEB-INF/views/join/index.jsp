<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>회원가입</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<script src="/resources/js/jquery-1.11.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
<div class="container">
<form>
	<h2>회원가입</h2>
	<div class="form-group">
		<label for="userId">아이디</label>
		<input class="form-control" id="userId" type="text" placeholder="아이디" autofocus required>
	</div>
	<div class="form-group">
		<label for="userPassword">비밀번호</label>
		<input class="form-control" id="userPassword" type="password" placeholder="비밀번호" required>
		<input class="form-control" id="userPassword2" type="password" placeholder="비밀번호 재확인" required>
	</div>
	<div class="form-group">
		<label for="name">이름</label>
		<input class="form-control" id="name" type="text" placeholder="이름" required>
	</div>
	<div class="form-group">
		<label for="gender" >성별</label>
		<input name="gender" type="radio">남 <input name="gender" type="radio">여
	</div>
	<div class="form-group">
			<label for="birthday">생년월일</label><input class="form-control" id="birthday" type="text" placeholder="생년월일" required>
	</div>
	<button class="btn btn-primary">확인</button><button class="btn btn-default" type="reset">초기화</button>
	<a class="btn btn-default" type="reset" href="/login" role="button">로그인</a>
</form>
</div>
	
</body>
</html>
