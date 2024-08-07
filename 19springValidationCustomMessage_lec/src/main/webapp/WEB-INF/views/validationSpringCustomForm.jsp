<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .errors{ color: red; font-size: 10px; font-weight:bold; }
</style>
</head>
<body>
  <h1>validationSpringCustomForm.jsp</h1>
  <form:form action="validation_procedure" modelAttribute="developer" method="post">
    이름 : <form:input path="name" /><br>
           <span class="errors"><form:errors path="name" /></span><br> 
    나이 : <form:input path="age" /><br>
           <span class="errors"><form:errors path="age" /></span><br>
    <input type="submit" value="유효성검사">
  </form:form>  
</body>
</html>








