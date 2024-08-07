<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>result.jsp</h1>
  <h3>이  름 : ${requestScope.member.user_name }</h3>
  <h3>아이디 : ${requestScope.member.user_id }</h3>
  <h3>암  호 : ${member.user_pw }</h3>
  <h3>우편번호 : ${requestScope.member.user_postcode }</h3>
  <h3>주 소 1 : ${requestScope.member.user_address1 }</h3>
  <h3>주 소 2 : ${requestScope.member.user_address2 }</h3>
</body>
</html>