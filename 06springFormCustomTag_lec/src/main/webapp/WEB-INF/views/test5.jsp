<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>test5.jsp</h1>
  <h2>회원 정보 수정 페이지 : Spring Custom Form Tag 방식</h2>
  <h2>Model 의 addAttribute() 로 객체를 request scope 에 올릴 때</h2>
  <h2>참조변수 이름(user)과 클래스 이름(Member)을 다르게 하는 경우 </h2>
  <form:form modelAttribute="person" action="result" >
    이  름 : <form:input path="user_name" /><br>        
    아이디 : <form:input path="user_id" /><br>
    암  호 : <form:password path="user_pw" showPassword="true"/><br>
    우편번호 : <form:input path="user_postcode" /><br>
    주 소 1 : <form:input path="user_address1" /><br>
    주 소 2 : <form:input path="user_address2" /><br>
    <button type="submit">회원정보수정</button>     
  </form:form>
</body>
</html>