<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ジャンケン</title>
</head>
<body>
<h1>ジェンケン</h1>
    
    <form action="JankenServlet" method="post">
        <label>選んでください: </label>
        <select name="playerChoice">
            <option value="rock">グー</option>
            <option value="scissors">チョキ</option>
            <option value="paper">パー</option>
        </select>
        <input type="submit" value="ぽん">
    </form>

    <h2>結果</h2>
    <p>${message}</p>
</body>
</html>