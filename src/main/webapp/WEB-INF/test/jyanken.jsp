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

    <form action="Jankencontroller" method="post">
     CPU人数：
       <label for="one">１人</label>
        <input type="radio" name="cpu" id="one" value="1人" checked="checked">
        <label for="two">２人</label>
        <input type="radio" name="cpu" id="two" value="2人">                                                                                                         <br>
        <label>最初は✊ジャンケン</label>
       
        <select name="playerChoice">
            <option value="✊">✊</option>
            <option value="✌️">✌️</option>
            <option value="✋">✋</option>
        </select>
        
        <input type="submit" value="ポン">
    </form>

  
</body>
</html>