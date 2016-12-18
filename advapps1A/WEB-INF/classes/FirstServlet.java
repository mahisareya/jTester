import javax.servlet.*;
import java.io.*;
import java.util.*;
public class FirstServlet implements Servlet{
	static 
	{
		System.out.println("servlet class loading...");

	}

	public FirstServlet()
	{
		System.out.println("Servlet instantiation");

	}
	public void init(ServletConfig config)throws ServletException{
		System.out.println("init() method called....");
	}

	public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
		System.out.println("service() called....");
			resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>welcome in adv java inocent student</h1>");
		out.println("<h1>the server date and time+new Date()+</h1>");
	}
	public void destroy()
	{
		System.out.println("destroy() called");
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	public String getServletInfo()
	{
		return "developed by durga";
	}
}