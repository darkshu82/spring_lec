<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>test6.jsp</h1>
  <h2>figure1.num1 : ${requestScope.figure1.num1 }</h2>
  <h2>figure1.num2 : ${requestScope.figure1.num2 }</h2>
  <h2>figure1.nums : ${requestScope.figure1.nums }</h2>
  <h2>figure1.nums[0] : ${requestScope.figure1.nums[0] }</h2>
  <h2>figure1.nums[1] : ${requestScope.figure1.nums[1] }</h2>
  <h2>figure2.num1 : ${figure2.num1 }</h2>
  <h2>figure2.num2 : ${figure2.num2 }</h2>
</body>
</html>