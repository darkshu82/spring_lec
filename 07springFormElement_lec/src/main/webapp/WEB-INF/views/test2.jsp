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
  <h1>test2.jsp</h1>
  <form:form modelAttribute="infoClass" action="result2">
    <form:select path="s1">
      <form:option value="info1">info1</form:option>
      <form:option value="info2">info2</form:option>
      <form:option value="info3">info3</form:option>
      <form:option value="info4">info4</form:option>
    </form:select>
    <hr>
    <form:select path="s2">
      <form:options items="${requestScope.infoArray1 }" />
    </form:select>
    <hr>
    <form:select path="s3">
      <form:options items="${requestScope.infoList2 }" />
    </form:select>
    <hr>
    <form:select path="s4">
      <form:options items="${developer_list }" itemLabel="empno" itemValue="ename"/>
    </form:select>
    <hr>
    <form:checkbox path="s5" value="info1" />item1
    <form:checkbox path="s5" value="info2" />item2
    <form:checkbox path="s5" value="info3" />item3
    <hr>
    <form:checkboxes path="s6" items="${infoArray1 }" />
    <hr>
    <form:checkboxes path="s7" items="${infoList2 }" />
    <hr>
    <form:checkboxes path="s8" items="${developer_list }" itemLabel="empno" itemValue="ename"/>
    <hr>
    <form:radiobutton path="s9" value="info1" />item1
    <form:radiobutton path="s9" value="info2" />item2
    <form:radiobutton path="s9" value="info3" />item3
    <hr>
    <form:radiobuttons path="s10" items="${infoArray1 }" />
    <hr>
    <form:radiobuttons path="s11" items="${infoList2 }" />
    <hr>
    <form:radiobuttons path="s12" items="${developer_list }" itemLabel="empno" itemValue="ename"/>
  </form:form>
</body>
</html>

