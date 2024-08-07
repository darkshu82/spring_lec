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
  <h2>사원번호 : ${requestScope.developer.empno }</h2>
  <h2>사원이름 : ${developer.ename }</h2>
  <h2>사원나이: ${developer.age }</h2>
  <h2>사원키 : ${developer.height }</h2>
  <h2>사원몸무게 : ${developer.weight}</h2>
  <h2>사원업무 : ${developer.job }</h2>
</body>
</html>