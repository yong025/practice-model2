package com.example.ex2.controller;

import lombok.extern.log4j.Log4j2;
import sun.rmi.server.Dispatcher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalcController", value = "/calc")
@Log4j2
public class CalcController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("do Get...............");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calcInput.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("do Post...............");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calcResult.jsp");
        dispatcher.forward(request,response);

        String num1str = request.getParameter("num1");
        String num2str = request.getParameter("num2");
        String oper = request.getParameter("oper");

        log.info("num1: " + num1str);
        log.info("num2: " + num2str);
        log.info("oper: " + oper);



    }
}
