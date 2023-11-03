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
    	   String playerChoice = request.getParameter("playerChoice");
    	   request.setAttribute("pC",playerChoice);
           // CPUの選択をランダムに生成
           String[] choices = {"👊", "✌️", "✋"};
           String cpuChoice = choices[(int)(Math.random() * choices.length)];
           request.setAttribute("cC",cpuChoice);
           // 勝敗を判定
           String result ;
           if (playerChoice.equals(cpuChoice)) {
               result = "引き分け";
           } else if ((playerChoice.equals("👊") && cpuChoice.equals("✌️"))
                   || (playerChoice.equals("✌️") && cpuChoice.equals("✋"))
                   || (playerChoice.equals("✋") && cpuChoice.equals("👊"))) {
               result = "あなたの勝ち";
           } else {
               result = "CPUの勝ち";
           }
           request.setAttribute("win",result);
        // confirm.jsp にリダイレクト
        String view = "/WEB-INF/test/Jankenresult.jsp";
        request.getRequestDispatcher(view).forward(request, response);
        
    }
}