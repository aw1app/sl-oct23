package com.cms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;


@WebServlet(urlPatterns = { "/lcDemo" })
public class ServletLifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) {
		System.out.println("INSIDE init ");
	}
	
	@Override
	public void destroy() {
		System.out.println("INSIDE destroy ");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("INSIDE do Get ");
		
		
	}

}
