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
    
    아이디 : <form:input type="text" path="id" /><br>
             <span class="errors"><form:errors path="id" /></span><br>
    
    나이 : <form:input type="text" path="age" /><br>
             <span class="errors"><form:errors path="age" /></span><br>
    
    사원번호 : <form:input type="text" path="empno" /><br>
               <span class="errors"><form:errors path="empno" /></span><br>
    
    주문번호 : <form:input type="text" path="orderno" /><br>
               <span class="errors"><form:errors path="orderno" /></span><br>
    
    부서번호 : <form:input type="text" path="deptno" /><br>
               <span class="errors"><form:errors path="deptno" /></span><br>
    
    이메일 : <form:input type="text" path="email" /><br>
               <span class="errors"><form:errors path="email" /></span><br>
    
    <br><br>
    <form:button type="submit">유효성검사하기</form:button>
  </form:form>
  
  <button type="button" onclick="history.back()">이전 페이지로</button>
</body>
</html>


