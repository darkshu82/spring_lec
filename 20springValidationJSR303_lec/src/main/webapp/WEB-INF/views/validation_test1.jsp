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
    
    결혼 : <form:radiobutton path="married" value="true"/> true
           <form:radiobutton path="married" value="false"/> false <br>
           <span class="errors"><form:errors path="married" /></span><br>
           
    졸업 : <form:radiobutton path="gradudated" value="true"/> true
           <form:radiobutton path="gradudated" value="false"/> false <br>
           <span class="errors"><form:errors path="gradudated" /></span><br>
    
    아이디 : <form:input path="id" type="text" /><br>
             <span class="errors"><form:errors path="id" /></span><br>
             
    나이 : <form:input path="age" /><br>
           <span class="errors"><form:errors path="age" /></span><br>
           
    신장 : <form:input path="height" /><br>
           <span class="errors"><form:errors path="height" /></span><br>   
           
    부서이름 : <form:checkbox path="dname" value="Operation" />운영부<br>               
               <span class="errors"><form:errors path="dname" /></span><br>
    
    부서번호 : <form:checkbox path="deptno" value="7713" />운영부번호<br>               
               <span class="errors"><form:errors path="deptno" /></span><br> 
               
    개발자번호 : <form:input path="devNumber" type="text"  /><br> 
                 <span class="errors"><form:errors path="devNumber" /></span><br> 
                     
    <br><br>
    <form:button type="submit">유효성검사하기</form:button>
  </form:form>
</body>
</html>


