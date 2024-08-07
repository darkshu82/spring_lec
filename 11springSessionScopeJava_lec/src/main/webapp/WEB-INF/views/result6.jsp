<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result6.jsp</h1>
  <h2>employee</h2>
  <h2>개발자 : ${sessionScope.employee }</h2>
  <h2>이름 : ${sessionScope.employee.name }</h2>
  <h2>이름 : ${employee.name }</h2>
  <h2>나이 : ${sessionScope.employee.age }</h2>
  <h2>나이 : ${employee.age }</h2>
  
</body>
</html>



