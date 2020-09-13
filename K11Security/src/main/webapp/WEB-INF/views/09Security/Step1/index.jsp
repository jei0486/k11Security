<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<title>index</title>
</head>
<body>
<div class="container">
<!--파일명 :   index -->
	<h2>스프링 시큐리티 Step1</h2>
	
	<h3>기본 설정으로 구현하기</h3>
	
	<h4>USER 권한을 획득한 후 접속할 수 있는 페이지 입니다.</h4>
	
	<form:form method="post" action="../logout">
		<input type="submit" value="로그아웃"/>
	</form:form>	
</div>
</body>
</html>