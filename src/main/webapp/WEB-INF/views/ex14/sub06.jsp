<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />   
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css" integrity="sha512-GQGU0fMMi238uA+a/bdWJfpUGKUkBdgfFdgBm72SUQ6BeyWjoY/ton0tEjH+OSH9iP4Dfh+7HM0I9f5eR0L/4w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" referrerpolicy="no-referrer"></script>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
<h1>${messege} </h1>
	<h1>새 직원 입력</h1>
	<form action="${pageContext.request.contextPath }/ex14/sub06" method="post">
	퍼스트네임명 : <input type ="text" name="firstName" value = "Sson h.h."/><br />
	라스트네임명:  <input type ="text" name="lastName" value = "wingfoward"/><br />
	사진: <input type ="text" name="photo" value = "seoul gangnam"/><br />
	노트: <input type ="text" name="notes" value = "London"/><br />
	날짜 :<input type ="date" name= "birthDate" value="1999-01-22"/><br />
	
	<button>등록</button>
	
	</form>
</body>
</html>