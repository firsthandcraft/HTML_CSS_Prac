package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextServlet
 */
@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();//서블렛에서 간단내용 출력
		//요청자료 받아오기
		out.print("친구이름"+request.getParameter("friendName")+"입니다.");//html의 항목의 이름을 가져온다
		//getWriter( )은 클라이언트에 응답하기 위한 출력 스트림을 반환한다. 그리고 이 출력 스트림을 이용해 클라이언트에게 응답을 보내게 된다.
		out.close();//마지막으로, 모든 응답을 마친 후에 출력스트림 객체의 close( )메소드를 이용해 스트림을 닫아 줌으로써 클라이언트와 웹서버간에 연결된 출력 스트림을 끊어 줍니다.
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
