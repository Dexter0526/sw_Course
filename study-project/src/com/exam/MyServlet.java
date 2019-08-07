package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
톰캣 서버(WAS)가 기동되면
서비스할 프로젝트 안에있는 서블릿 클래스들을 확인함.
서블릿 클래스에 붙은 @WebServlet 애노테이션 값을 확인해서
해당 애노테이션 값("/myservlet.html")으로
해당 서블릿(MyServlet) 클래스가 요청받을수 있도록
미리 준비함.
*/
@WebServlet("/myservlet.html")
public class MyServlet extends HttpServlet {
	
	private String name = "Java"; // 전역변수(=필드)
	
	public String getName() { // 메소드 정의
		return name;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 10;
		int num2 = 20;
		int add = num1 + num2;
		
		
		// JSP 스크립트릿 안에서 만든 변수는 지역변수
		String str = name + " Server Page";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); // 브라우저 출력객체 얻기
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>제목</title></head>");
		out.println("<body>");
		out.println("<p>" + num1 + " + " + num2 + " = " + add + "</p>");
		
		out.println(str);
		out.println("<br>");
		
		out.println(getName());
		out.println("<br>");
		
		out.println(1 + 2);
		out.println("<br>");
		
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
