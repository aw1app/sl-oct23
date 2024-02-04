package com.cms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DashboardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();

		boolean sessIdCookieExist = false;

		if (cookies != null) {
			
			for (Cookie cookie : cookies) {
				String nameOfCookie = cookie.getName(); // we also have cookie.getValue();

				if (nameOfCookie.equals("sessId")) {
					sessIdCookieExist = true;
					break;
				}
			}
			
		}

		if (sessIdCookieExist == true)
			out.print("Hey user, looks like you have visited more than 1 page on this site!. I am Dashboard servlet.");

		else
			out.print("I am Dashboard servlet. "
					+ "Looks like you have visited me first on this site, and not gone to any other servlet yet!. ");

		out.close();
	}

}
