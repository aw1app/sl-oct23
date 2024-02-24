package com.cms;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FirstServelt extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Hello from a Maven project Servlet!").append(request.getContextPath());
	}

}
