<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result1.jsp</h1>
  <h2>Developer</h2>
  <h2>개발자정보 :  ${requestScope.developer }</h2>
  <h2>사원번호 : ${requestScope.developer.empno }</h2>
  <h2>사원이름 : ${requestScope.developer.ename }</h2>
  <h2>사원나이 : ${requestScope.developer.age }</h2>  
  <hr>
  <h2>Student(sophomore)</h2>
  <h2>학생정보 : ${sessionScope.sophomore }</h2>
  <h2>학생번호 : ${sessionScope.sophomore.studno }</h2>
  <h2>학생이름 : ${sessionScope.sophomore.name }</h2>
  <h2>학과이름 : ${sessionScope.sophomore.department }</h2>
  <hr>
  <h2>Professor</h2>
  <h2>교수번호 : ${requestScope.professor.profNo }</h2>
  <h2>교수이름 : ${requestScope.professor.profName }</h2>
  <h2>학과이름 : ${requestScope.professor.department }</h2>
  <hr>
  <h2>Officer(policeman)</h2>
  <h2>이름 : ${requestScope.policeman.name }</h2>
  <h2>주소 : ${requestScope.policeman.address }</h2>
  <h2>신장 : ${requestScope.policeman.height }</h2>
</body>
</html>







