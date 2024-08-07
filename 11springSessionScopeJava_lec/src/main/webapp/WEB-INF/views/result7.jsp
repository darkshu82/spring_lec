<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result7.jsp</h1>
  <h2>sessionDeveloper</h2>
  <h2>개발자 : ${sessionScope.sessionDeveloper }</h2>
  <h2>이름 : ${sessionScope.sessionDeveloper.name }</h2>
  <h2>이름 : ${sessionDeveloper.name }</h2>
  <h2>나이 : ${sessionScope.sessionDeveloper.age }</h2>
  <h2>나이 : ${sessionDeveloper.age }</h2>
  <hr>
  <h2>sessionProgrammer</h2>
  <h2>개발자 : ${sessionScope.sessionProgrammer }</h2>
  <h2>이름 : ${sessionScope.sessionProgrammer.name }</h2>
  <h2>이름 : ${sessionProgrammer.name }</h2>
  <h2>나이 : ${sessionScope.sessionProgrammer.age }</h2>
  <h2>나이 : ${sessionProgrammer.age }</h2>
</body>
</html>



