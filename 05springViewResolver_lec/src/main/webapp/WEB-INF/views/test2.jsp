<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>test2.jsp</h1>
  <h2>number1.num1 : ${requestScope.number1.num1 }</h2>
  <h2>number1.num2 : ${requestScope.number1.num2 }</h2>
  <h2>number1.nums : ${requestScope.number1.nums }</h2>
  <h2>number1.nums[0] : ${requestScope.number1.nums[0] }</h2>
  <h2>number1.nums[1] : ${requestScope.number1.nums[1] }</h2>
  <h2>number2.num1 : ${number2.num1 }</h2>
  <h2>number2.num2 : ${number2.num2 }</h2>
  
</body>
</html>