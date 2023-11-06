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
           String cpuChoice = choices[(int)(Math.random() * choices.length)];
           request.setAttribute("cC",cpuChoice);
           
           String cpuChoice2 = choices[(int)(Math.random() * choices.length)];
           request.setAttribute("cC2",cpuChoice2);
          
           // 勝敗を判定） 一人の場合
           String result = null ;
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
                // confirm.jsp にリダイレクト
                String view = "/WEB-INF/test/Jankenresult.jsp";
                request.getRequestDispatcher(view).forward(request, response);
        	} else if (cpucount.equals("2人")) {
        	    // 2人用のジャンケンのルール
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
                // confirm.jsp にリダイレクト
                String view = "/WEB-INF/test/Jankenresult2.jsp";
                request.getRequestDispatcher(view).forward(request, response);
        	}
           
        
    }
}