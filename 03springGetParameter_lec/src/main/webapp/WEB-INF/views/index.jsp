<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>안녕하세요 ~~~</h1> 
  
  <button type="button" onclick="location.href='paramtest1?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest1 GET 방식</button>
  <br>
  <!-- post 방식 : input type text, checkbox(배열) -->
  <form action="paramtest2" method="post">
    number1 : <input type="text" name="number1" ><br>
    number2 : <input type="text" name="number2" ><br>
    checkbox 사용해서 request scope 에 배열로 올리기 <br> 
    <input type="checkbox" name="nums" value="10"> 10 
    <input type="checkbox" name="nums" value="20"> 20 
    <input type="checkbox" name="nums" value="30"> 30 <br> 
    <input type="submit" value="paramtest2 POST 방식" >
  </form>
  <button type="button" onclick="location.href='student'">student GET 방식</button>
  <br>
  <button type="button" onclick="location.href='paramtest3?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest3 GET 방식</button>
  <br>
    <!-- post 방식 : input type text, checkbox(배열) -->
  <form action="paramtest4" method="post">
    number1 : <input type="text" name="number1" ><br>
    number2 : <input type="text" name="number2" ><br>
    checkbox 사용해서 request scope 에 배열로 올리기 <br> 
    <input type="checkbox" name="nums" value="10"> 10 
    <input type="checkbox" name="nums" value="20"> 20 
    <input type="checkbox" name="nums" value="30"> 30 <br> 
    <input type="submit" value="paramtest4 POST 방식" >
  </form>
  <button type="button" onclick="location.href='paramtest5?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest5 GET 방식</button>
  <br>
  <button type="button" onclick="location.href='paramtest6?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest6 GET 방식</button>
  <br>
  <button type="button" onclick="location.href='paramtest7?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest7 GET 방식</button>
  <br>
  <img src="images/tjoeun.png" />
</body>
</html>

