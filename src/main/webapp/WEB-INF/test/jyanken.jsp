<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ジャンケン</title>
</head>
<body>
<h1>ジャンケン</h1>

    <form action="JankenController" method="post">
        <label>最初は✊ジャンケン</label>
        <select name="playerChoice">
            <option value="👊">👊</option>
            <option value="✌️">✌️</option>
            <option value="✋">✋</option>
        </select>
        
        <input type="submit" value="ポン">
    </form>

   <%--  <h2>結果</h2>
    <p>${message}</p> --%>
</body>
</html>