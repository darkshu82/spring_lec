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
  <h1>test1.jsp</h1>
  <form:form modelAttribute="student" action="result">
    <form:hidden path="number"/><br>
    이  름 : <form:input path="name" /><br>
    아이디 : <form:input path="id" /><br>
    암  호 : <form:password path="pw" showPassword="true" /><br>
    게시글 : <form:textarea path="post"/><br>
    <button type="submit">전 송</button>
  </form:form>
</body>
</html>



