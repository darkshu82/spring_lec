<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>input_data.jsp</h1>
  <form action="input_procedure" method="post">
    이 름  : <input type="text" name="name"><br>
    아이디 : <input type="text" name="id"><br>
    주 소  : <input type="text" name="addr"><br>
    <input type="submit" value="전송" >
  </form>  
  
  <br>
  <button type="button" onclick="history.back()">이전 페이지</button><br>
  
</body>
</html>



