package servlet_calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class Division extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		double b = Double.parseDouble(req.getParameter("num2"));
		double c = a / b;
		res.getWriter().println("<html><body><h1>The division is " + c + " </h1></body></html>");

	}

}
