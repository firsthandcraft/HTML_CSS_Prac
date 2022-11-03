package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class friendServlet
 */
@WebServlet("/friendServlet")
public class friendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public friendServlet() {
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
//		doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();
		//기수
		String kosta = request.getParameter("kosta");
		//request 스코프 함수 (범위) 한번해주고 없어진다. 가져온 데이터를 변수에 담아주고 사라짐
		String gender= request.getParameter("gender");
		String friend[]= request.getParameterValues("friend");
				
//		if(gender.equals("m")) {
//			out.print("성별 남 선택");
//		} else {out.print("성별 여 선택");}
		out.print("성별 :"+gender);
		out.print("<hr>");
		out.print("기수 :"+kosta+"기");
		out.print("<hr>");
		for(var i=0; i<friend.length;i++){
			out.println("<img src='img/"+friend[i]+".jpg'>");
		}
		/*for(var i=0; i<friend.length;i++){
			out.println("이상형 "+friend[i]);
		}*/
		out.close();
	}

}
