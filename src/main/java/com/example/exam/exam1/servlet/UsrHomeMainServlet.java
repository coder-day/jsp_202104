package com.example.exam.exam1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/usr/home/main")
public class UsrHomeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// GET 파라미터 name 설정 테스트
		
		String name = request.getParameter("name");
		
		// 들어오는 파라미터 UTF-8로 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//응답 캐릭터 셋 및 type UTF-8 설정 하여 한글 깨짐 방지
		// 서블릿이 HTML 파일을 만들때 UTF-8로 쓰기
		response.setCharacterEncoding("UTF-8");
		// HTML이 UTF-8 형식이라는 것을 브라우저에게 알린다.
		response.setContentType("text/html; charset=UTF-8");
		
		response.getWriter().append(name);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
