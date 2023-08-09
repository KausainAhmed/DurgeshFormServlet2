package com.durgesh.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>S1</title></head>");
		out.println("<body>");
		out.println("<h1>hello this is servlet1</h1>");

		int nn1 = Integer.parseInt(req.getParameter("n1"));
		int nn2 = Integer.parseInt(req.getParameter("n2"));
		// mul
		int p = nn1 * nn2;
		// getting... attribute
		int sum = (int) req.getAttribute("sum");
		out.println("<hr><h1>");
		out.println("Sum is = " + sum);
		out.println("Product is = " + p);
		out.println("</h2>");

		out.println("</body>");
		out.println("</html>");
	}

}
