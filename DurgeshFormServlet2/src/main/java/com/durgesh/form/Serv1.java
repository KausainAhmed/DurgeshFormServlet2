package com.durgesh.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>S1</title></head>");
		out.println("<body>");
		out.println("<h1>hello this is servlet1</h1>");

		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");

		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		// add
		int s = nn1 + nn2;
		// attribute
		req.setAttribute("sum", s);
		// forwarding request using request dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("Serv2");
		rd.forward(req, resp);

		out.println("</body>");
		out.println("</html>");
	}

}
