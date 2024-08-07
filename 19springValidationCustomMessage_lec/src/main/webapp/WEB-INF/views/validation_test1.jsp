<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .errors{ color: red; font-size: 14px; font-weight:bold; }
</style>
</head>
<body>
  <h1>validation_test1.jsp</h1>
  <form action="validation_procedure" method="post">
    이름 : <input type="text" name="name"><br>
    <spring:hasBindErrors name="developer" >
      <c:if test="${errors.hasFieldErrors('name') }" >
         <span class="errors"><spring:message code="${errors.getFieldError('name').codes[0] }" /></span><br>
      </c:if>
    </spring:hasBindErrors>
    나이 : <input type="text" name="age"><br>
    <spring:hasBindErrors name="developer" >
      <c:if test="${errors.hasFieldErrors('age') }" >
         <span class="errors"><spring:message code="${errors.getFieldError('age').codes[0] }" /></span><br>
      </c:if>
    </spring:hasBindErrors>
    <input type="submit" value="유효성검사">
  </form>  
</body>
</html>








