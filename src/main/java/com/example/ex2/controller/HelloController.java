package com.example.ex2.controller;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HelloController", value = "/hello")
@Log4j2
public class HelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("do get................");

        String msg = "아무무무무 아무무";
        String[] arr ={"aa","bb","cc","dd","ee","ff"};

        request.setAttribute("arr", arr);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/hello.jsp");
        dispatcher.forward(request,response);


    }

}
