<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>じゃんけんゲーム</title>
</head>
<body>
    <h1>ジャンケン</h1>

 
    

    <p>あなたの選択:<%=request.getAttribute("pC")%></p>
    <p>CPUの選択: <%=request.getAttribute("cC")%></p>
    <p>結果: <%=request.getAttribute("win")%></p>
    
    <p><a href="Jankencontroller">もう一度遊ぶ</a></p>
</body>
</html>
