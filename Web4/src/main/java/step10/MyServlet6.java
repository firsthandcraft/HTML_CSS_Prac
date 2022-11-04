package step10;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet6
 */
@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//데이터를 유지하는게 scope 객체--https://itworldyo.tistory.com/11
		/*객체범위
		 - Request 영역
		 - Session 영역
		 - Application 영역
		 - Page 영역*/
		
		//request 객체에 정보 전달
		//현재 요청에 댛나 응답이 전달되기 전까지 유효
		request.setAttribute("requestInfo","test1");//실행되는 프로그램이 끝날때 까지 살아있는것 -> 컨트롤 불가 
		//현 session객체 획득
		HttpSession session = request.getSession();//로그인 에 자주 사용 , 로그인에 다른페이지 전달할수 있게 ->컨트롤가능
		
		//session에 정보 전달
		//클라이언트와 연결이 끊길 때까지 유효
		session.setAttribute("sessionInfo","test2");
		
		//ServletContext 객체 획득. 어플리케이션 전체에 대한 정보 공유
		ServletContext application = this.getServletContext();
		
		//application객체에 저장
		//이 어플리케이션이 종료 할때까지 모든 파일 공유
		application.setAttribute("application", "test3");
		
		
		
		//다른 페이지로 이동하는 거 도움 null이 아닐 경우 다른 페이지 MyServlet7에 전달
		RequestDispatcher dispatcher = request.getRequestDispatcher("MyServlet7");
		if(dispatcher != null) {
			dispatcher.forward(request,response);
			//request,response -- https://dololak.tistory.com/502
		}
	

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
