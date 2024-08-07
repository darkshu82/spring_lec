<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result5.jsp</h1>
  <h2>사원번호 : ${requestScope.employee.empno }</h2>
  <h2>사원이름 : ${employee.ename }</h2>
  <h2>사원나이: ${employee.age }</h2>
  <h2>사원키 : ${employee.height }</h2>
  <h2>사원몸무게 : ${employee.weight}</h2>
  <h2>사원업무 : ${employee.job }</h2>
</body>
</html>