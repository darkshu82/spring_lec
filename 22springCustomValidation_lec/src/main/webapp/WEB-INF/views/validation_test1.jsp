<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .errors {color: red; font-size: 12px; font-weight: bold;}
</style>
</head>
<body>
  <h1>validation_test1.jsp</h1>
  <form:form action="validation_procedure" modelAttribute="developer" method="post">
    
    이름 : <form:input type="text" path="name" /><br>
           <span class="errors"><form:errors path="name" /></span><br>
    부서이름 : <form:input type="text" path="dname" /><br>
               <span class="errors"><form:errors path="dname" /></span><br>
    메니저이름 : <form:input type="text" path="mgrName" /><br>
               <span class="errors"><form:errors path="mgrName" /></span><br>
    주소 : <form:input type="text" path="address" /><br>
               <span class="errors"><form:errors path="address" /></span><br>
    이메일 : <form:input type="text" path="email" /><br>
               <span class="errors"><form:errors path="email" /></span><br>
    <br><br>
    <form:button type="submit">유효성검사하기</form:button>
  </form:form>
  
  <button type="button" onclick="history.back()">이전 페이지로</button>
</body>
</html>


