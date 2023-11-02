<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>じゃんけんゲーム</title>
</head>
<body>
    <h1>ジャンケン</h1>

 <!--     // プレイヤーの選択を取得
    String playerChoice = request.getParameter("playerChoice");

    // CPUの選択をランダムに生成
    String[] choices = {"👊", "✌️", "✋"};
    String cpuChoice = choices[(int)(Math.random() * choices.length)];

    // 勝敗を判定
    String result = "";
    if (playerChoice.equals(cpuChoice)) {
        result = "引き分け";
    } else if ((playerChoice.equals("👊") && cpuChoice.equals("✌️"))
            || (playerChoice.equals("✌️") && cpuChoice.equals("✋"))
            || (playerChoice.equals("✋") && cpuChoice.equals("👊"))) {
        result = "あなたの勝ち";
    } else {
        result = "CPUの勝ち";
    } -->
    

    <p>あなたの選択:<%--  <%= playerChoice %> --%></p>
    <p>CPUの選択: <%-- <%= cpuChoice %> --%></p>
    <p>結果: <%-- <%= result %> --%></p>
    
    <a href="jyanken.jsp">もう一度遊ぶ</a>
</body>
</html>
