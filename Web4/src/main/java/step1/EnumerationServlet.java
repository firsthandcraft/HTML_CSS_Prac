package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnumerationServlet
 */
@WebServlet("/EnumerationServlet")
public class EnumerationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnumerationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;chaerset=utf-8");
		PrintWriter out = response.getWriter();
		/*request.getParameterNames():
		 * 요청시 넘어온 name들을 Enumeration타입으로 리턴
		 * Enumeration: 데이터들을 열거하기 위한 방법을 제공하는 인터페이스
		 * */ 
		//request 로 부터 name들을 반환받는다.
		Enumeration e =request.getParameterNames();
		
		//name이 있을때 까지 계속수행
		while(e.hasMoreElements()) {
			String info = request.getParameter(e.nextElement().toString());
			out.print(info+"<br>");		
		}
		out.close();
	}
		
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
