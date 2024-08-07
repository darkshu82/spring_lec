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
  <h2>Member</h2>
  <h2>회원번호 : ${requestScope.member.memberNum }</h2>
  <h2>회원이름 : ${member.name }</h2>
  <h2>아 이 디 : ${member.id }</h2>
  <h2>비밀번호 : ${member.pw }</h2>
  <h2>전화번호 : ${member.phone }</h2>
  <h2>주 소    : ${member.address }</h2>
  <hr>
  <h2>collegeStudent</h2>
  <h2>회원번호 : ${requestScope.sophomore.memberNum }</h2>
  <h2>회원이름 : ${sophomore.name }</h2>
  <h2>아 이 디 : ${sophomore.id }</h2>
  <h2>비밀번호 : ${sophomore.pw }</h2>
  <h2>전화번호 : ${sophomore.phone }</h2>
  <h2>주 소    : ${sophomore.address }</h2>
  <hr>
  <h2>Student</h2>
  <h2>회원번호 : ${requestScope.student.memberNum }</h2>
  <h2>회원이름 : ${student.name }</h2>
  <h2>아 이 디 : ${student.id }</h2>
  <h2>비밀번호 : ${student.pw }</h2>
  <h2>전화번호 : ${student.phone }</h2>
  <h2>주 소    : ${student.address }</h2>
  <hr>
  <h2>Officer</h2>
  <h2>회원번호 : ${requestScope.policeman.memberNum }</h2>
  <h2>회원이름 : ${policeman.name }</h2>
  <h2>아 이 디 : ${policeman.id }</h2>
  <h2>비밀번호 : ${policeman.pw }</h2>
  <h2>전화번호 : ${policeman.phone }</h2>
  <h2>주 소    : ${policeman.address }</h2>
</body>
</html>


