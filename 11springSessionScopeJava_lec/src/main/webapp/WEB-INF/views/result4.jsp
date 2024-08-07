<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result4.jsp</h1>
  <h2>developer</h2>
  <h2>개발자 : ${sessionScope.developer }</h2>
  <h2>이름 : ${sessionScope.developer.name }</h2>
  <h2>이름 : ${developer.name }</h2>
  <h2>나이 : ${sessionScope.developer.age }</h2>
  <h2>나이 : ${developer.age }</h2>
  
</body>
</html>



