package com.cliente.servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cliente")

public class ClienteServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		//Devolve a mensagem no lado do servidor 
		//System.out.println("Chamou pelo método GET");
		
		//Devolve a mensagem no lado do cliente 
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método GET");
	}	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Devolve a mensagem no lado do servidor 
		//System.out.println("Chamou pelo método POST");
		
		//Devolve a mensagem no lado do cliente 
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método POST");
	}

}
