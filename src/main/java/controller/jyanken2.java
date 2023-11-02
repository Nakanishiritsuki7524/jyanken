package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/JankenController")
public class jyanken2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = "/WEB-INF/test/jyanken.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // フォームから送信されたデータを取得
        
        // confirm.jsp にリダイレクト
        String view = "/WEB-INF/test/JankenController.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }
}