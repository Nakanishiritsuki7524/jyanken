package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Jankencontroller")
public class jyanken2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = "/WEB-INF/test/jyanken.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // フォームから送信されたデータを取得
    	   String cpucount = request.getParameter("cpu");
    	   String playerChoice = request.getParameter("playerChoice");
    	   request.setAttribute("pC",playerChoice);
           // CPUの選択をランダムに生成
           String[] choices = {"✋", "✌️", "✊"};
           //一人目の出す手をランダムにする
           String cpuChoice = choices[(int)(Math.random() * choices.length)];
           request.setAttribute("cC",cpuChoice);
           //二人目の手をランダムにする
           String cpuChoice2 = choices[(int)(Math.random() * choices.length)];
           request.setAttribute("cC2",cpuChoice2);
          
          //nullで値を初期化（”空白”でもいい）
           String result = null ;
           // 一人の場合
           if (cpucount.equals("1人")) {
        	    if (playerChoice.equals(cpuChoice)) {
        	        result = "引き分け";
        	    } else if ((playerChoice.equals("✊") && cpuChoice.equals("✌️"))
        	            || (playerChoice.equals("✌️") && cpuChoice.equals("✋"))
        	            || (playerChoice.equals("✋") && cpuChoice.equals("✊"))) {
        	        result = "あなたの勝ち";
        	    } else {
        	        result = "あなたの負け";
        	    }
        	    request.setAttribute("win",result);
                // 渡したいjspにリダイレクト（処理内容を渡す）
                String view = "/WEB-INF/test/Jankenresult.jsp";
                request.getRequestDispatcher(view).forward(request, response);
                //二人の場合
        	} else if (cpucount.equals("2人")) {
        	    if ((playerChoice.equals("✊") && cpuChoice.equals("✌️") && cpuChoice2.equals("✌️"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✊") && cpuChoice2.equals("✊"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✋") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✊") && cpuChoice.equals("✊") && cpuChoice2.equals("✌️"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✋") && cpuChoice2.equals("✊"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✌️") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✊") && cpuChoice.equals("✌️") && cpuChoice2.equals("✊"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✊") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✋") && cpuChoice2.equals("✌️"))) {
        	        result = "あなたの勝ち";
            } else if ((playerChoice.equals("✊") && cpuChoice.equals("✊") && cpuChoice2.equals("✊"))
        	        || (playerChoice.equals("✊") && cpuChoice.equals("✋") && cpuChoice2.equals("✌️"))
        	        || (playerChoice.equals("✊") && cpuChoice.equals("✌️") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✋") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✌️") && cpuChoice2.equals("✊"))
        	        || (playerChoice.equals("✋") && cpuChoice.equals("✊") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✌️") && cpuChoice2.equals("✌️"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✊") && cpuChoice2.equals("✋"))
        	        || (playerChoice.equals("✌️") && cpuChoice.equals("✋") && cpuChoice2.equals("✊"))) {
        	        result = "引き分け";
        	    } else {
        	        result = "あなたの負け";
        	    }request.setAttribute("win",result);
                // 渡したいjspにリダイレクト
                String view = "/WEB-INF/test/Jankenresult2.jsp";
                request.getRequestDispatcher(view).forward(request, response);
        	}
           
        
    }
}