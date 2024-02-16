package com.javaex.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ggd
 */
@WebServlet("/gugudan")
public class Ggd extends HttpServlet {
	
	//필드
	//private static final long serialVersionUID = 1L;

	//생성자
    //기본생성자 사용

	//메소드-g/s 안 만듦
    
    //메소드-일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet 구구단");
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan);
		
		PrintWriter writer = response.getWriter();
		writer.println("<table border='1'>");
		for(int i=2; i<=9; i++) {
			writer.println("<tr>");
			writer.println("	<td>"+ dan +"</td>");
			writer.println("	<td>"+ i +"</td>");
			writer.println("	<td>"+ dan*i +"</td>");
			writer.println("</tr>");
		}
		
		writer.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}


