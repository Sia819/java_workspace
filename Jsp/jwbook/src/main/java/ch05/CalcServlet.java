package ch05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 서블릿 구현 클래스 CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcServlet() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		
		String names="PostData -> "; 
		Enumeration<String> params = request.getParameterNames();
		while(params.hasMoreElements())
		{ 
			String name = (String)params.nextElement(); 
			names += name + "=" + request.getParameter(name) + "&";
		}
		
		// QueryString Test
	    // CalcServlet.java , Run As / Run on Server            <--- Server 실행   
		// http://localhost:8080/jwbook/calc?n1=3&op=*&n2=8     <--- Client Browser URL입력
		
		//String names=request.getQueryString();
		
		long result = 0;
		
		switch(request.getParameter("op")) {
			case "+": result = n1+n2; break;
			case "-": result = n1-n2; break;
			case "/": result = n1/n2; break;
			case "*": result = n1*n2; break;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>계산기 서블릿</h2><hr>")
		.append("<hr>").append(names)
		.append("<hr>")
		.append("계산 결과: "+result+"</body></html>");
	}
    
    /*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		long result = 0;
		
		switch(request.getParameter("op")) {
			case "+": result = n1+n2;break;
			case "-": result = n1-n2;break;
			case "/": result = n1/n2;break;
			case "*": result = n1*n2;break;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>계산기 서블릿</h2><hr>")
		.append("계산 결과: "+result+"</body></html>");
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
