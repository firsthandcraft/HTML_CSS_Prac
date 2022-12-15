package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
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
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();
		
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPw");
		String gender = request.getParameter("gender");		
		String hobby[] = request.getParameterValues("userHobby");		
		String grade = request.getParameter("grade");		
		String content = request.getParameter("content");
		
		//파라미터 이름으로 하나씩 
		out.print("<html><body>");
		out.print("<h3>파라미터 이름으로 하나씩 읽어서 출력</h3>");
		out.print("ID : "+id+"<br>");
		out.print("PassWord : "+pw+"<br>");
		out.print("<hr>");
		out.print("gender : "+gender+"<br>");
		out.print("<hr>");
		out.print("Hobby : "+hobby+"<br>");
		for(int i=0; i<hobby.length;i++){
			out.println("Hobby : "+hobby[i]+"<br>");
		}
		out.println("grade : "+grade+"<br>");
		out.println("content : "+content+"<br>");
		
		
		//NAME
		out.print("<h3>이름으로 출력</h3>");
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			if(name.equals(hobby)) {
				String[] values=request.getParameterValues(name);
				for(int i=0; i<values.length;i++) {
					out.println("Hobby : "+hobby[i]+"<br>");
				}
			} else {
				String value=request.getParameter(name);
				out.print(name+":"+value+"<br>");		
			}
		}
		
		//MAP
		Map<String,String[]> map= request.getParameterMap();
		Set<String> set = map.keySet();
		Iterator<String> it= set.iterator();
		// <>제너릭 설정 
		String str=null;
		String str1[];
	
		
		while(it.hasNext()) {
			str=it.next();
			str1=map.get(str);//배열이 반환된다. 
			for(int i =0; i<str1.length;i++) {
				out.print(str+""+str1[i]);
			}
			out.print("<br>");
		}
		
		out.print("</body></html>");
		out.close();
	}

}
