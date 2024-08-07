<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>회원정보 수정하기</h1>
  <form action="result" method="post">
    이  름 : <input type="text" name="user_name" value="${requestScope.member.user_name }"><br>        
    아이디 : <input type="text" name="user_id" value="${requestScope.member.user_id }"><br>
    암  호 : <input type="password" name="user_pw" value="${requestScope.member.user_pw }"><br>
    우편번호 : <input type="text" name="user_postcode" value="${requestScope.member.user_postcode }"><br>
    주 소 1 : <input type="text" name="user_address1" value="${requestScope.member.user_address1 }"><br>
    주 소 2 : <input type="text" name="user_address2" value="${requestScope.member.user_address2 }"><br>
    <input type="submit" value="회원정보수정">        
  </form>
</body>
</html>









