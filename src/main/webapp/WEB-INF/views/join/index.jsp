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
<script type="text/javascript" src="/resources/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="/resources/js/additional-methods.min.js"></script>
<script type="text/javascript" src="/resources/js/messages_ko.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	join.init();
});

var join = {
	init: function() {
		this.$okBtn = $("#okBtn");
		this.$joinForm = $("#joinForm");
		this.$id = $("#id");
		this.$password = $("#password");
		this.$name = $("#name");
		this.$gender = $("input[name='gender']");
		this.$birthday = $("#birthday");
		this.$joinForm = $("#joinForm");
		
		this.bindEvent();
	},
	bindEvent: function() {
		this.$okBtn.on("click", this.insertMember);
		/* this.$joinForm.validate({
			submitHandler: function() {
				if(confirm("회원가이블 완료하시겠습니까?")) {
					return true;
				}
				return false;
			},
			rules: {
				id: {
					required: true,
					minlength: 10
				},
				password: {
					required: true,
					minlength: 20
				},
				repassword: {
					required: true,
					minlength: 20
				},
				name: {
					required: true,
					minlength: 5
				}
			},
			messages: {
				
			}
		}); */
	},
	insertMember: function() {
		var param = {};
		param.id = join.$id.val();
		param.password = join.$password.val();
		param.name = join.$name.val();
		param.gender = join.$gender.val();
		param.birthday = join.$birthday.val();
		
		$.ajax({
			url: "/insertMember",
			type: "POST",
			contentType: "application/json",
			data: JSON.stringify(param),
			dataType: "json",
			success: function(data) {
				console.log(data);
			},
			error: function(xhr, status, error) {
				alert(error);
			}
		});
		
		return false;
	}
};
</script>
</head>
<body>
<div class="container">
<form id="joinForm">
	<h2>회원가입</h2>
	<div class="form-group">
		<label for="userId">아이디</label>
		<input class="form-control" id="id" name="id" type="text" placeholder="아이디" autofocus required>
	</div>
	<div class="form-group">
		<label for="userPassword">비밀번호</label>
		<input class="form-control" id="password" name="password" type="password" placeholder="비밀번호" required>
		<input class="form-control" id="repassword" type="text" placeholder="비밀번호 재확인" required>
	</div>
	<div class="form-group">
		<label for="name">이름</label>
		<input class="form-control" id="name" name="name" type="text" placeholder="이름" required>
	</div>
	<div class="form-group">
		<label for="gender" >성별</label>
		<input name="gender" type="radio" value="M">남 <input name="gender" type="radio" value="W">여
	</div>
	<div class="form-group">
			<label for="birthday">생년월일</label><input class="form-control" id="birthday" type="text" placeholder="생년월일" required>
	</div>
	<button class="btn btn-primary" id="okBtn">확인</button>
	<!-- <input class="btn btn-primary" type="submit" value="확인"> -->
	<button class="btn btn-default" type="reset">초기화</button>
	<a class="btn btn-default" type="reset" href="/login" role="button">로그인</a>
</form>
</div>
	
</body>
</html>
