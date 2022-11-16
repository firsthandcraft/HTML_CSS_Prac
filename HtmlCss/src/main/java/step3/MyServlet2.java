package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String getParameter(String name)
		 * 한개의 파라미터를 이름으로 검색하여 반환한다. 
		 * 
		 * Map<String ,String[]>getParameterMap()
		 * request객체에 저장된 파라미터 모두를 검색하여 맵으로 반환한다. 
		 * 
		 * Enumeration<String> getParameterNames() ==이터레이터
		 * request 객체에 저장된 모든 파라메터의 이름을 검색하여 Enumeration으로 반환한다. 
		 * 
		 * String [] getParameterValues(String name)
		 * 체크박스 처럼 한 파라미터의 값이 여러개인 파라미터의 값을 읽어서 String[]으로 반환한다. 
		 * */
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("userId");
		String pwd=request.getParameter("userPw");
		String gender =request.getParameter("gender");
		String hobby []= request.getParameterValues("userHobby");
		String grade =request.getParameter("grade");
		String content =request.getParameter("content");
		 
		out.print("<html><body>");
		out.print("<h3> 파라미터 이름으로 하나씩읽어서 출력</h3>");
		out.print("<h5> id : "+id+"</h5>");
		out.print("<h5> pwd : "+pwd+"</h5>");
		out.print("<h5> gender : "+gender+"</h5>");
		for(int i = 0; i<hobby.length;i++) {
			out.print("<h5> hobby : "+hobby[i]+"</h5>");
		}
		out.print("<h5> grade : "+grade+"</h5>");
		out.print("<h5> content : "+content+"</h5>");
		
		out.print("<h3>이름 전체검색</h3>");
		Enumeration e = request.getParameterNames();//이터레이터
		
		while (e.hasMoreElements()){
			String name= (String)e.nextElement();
			if(name.equals("hobby")) {
				String[]values=request.getParameterValues(name);
					for(int i = 0; i<values.length;i++) { 
						out.print(name+":"+values[i]+"<br>");
					}
				} else {
					String value=request.getParameter(name);
					out.print(name+":"+value+"<br>");
				}
			}
		out.print("</html></body>");
	
	}


}
