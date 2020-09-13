<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<title>adminMain</title>
</head>
<body>
<div class="container">
<!--파일명 :   adminMain -->
	<h2>스프링 시큐리티 Step2</h2>
	
	<h3>관리자 메인 페이지 입니다.</h3>
	 
	<h4>필요 권한 : ADMIN 만 접근 가능</h4>
	
	
	<form:form method="post" action="${pageContext.request.contextPath}/security2/logout">
		<input type="submit" value="로그아웃"/>
	</form:form>	
	
	<jsp:include page="/resources/common_link.jsp" />
</div>
</body>
</html>