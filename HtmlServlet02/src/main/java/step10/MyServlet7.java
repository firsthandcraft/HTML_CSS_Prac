package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet7
 */
@WebServlet("/MyServlet7")
public class MyServlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();//로그인 에 자주 사용 , 로그인에 다른페이지 전달할수 있게 ->컨트롤가능
		
		//requst 객제에 저장된 정보 읽기
//		String requestInfo=(String) request.getAttribute("requestInfo");
		String requestInfo=(String) request.getAttribute("requestInfo");
	
		//requst 객제에 저장된 정보 읽기
		String sessionInfo=(String) session.getAttribute("sessionInfo");
		
		//ServletContext 객체 획득. 어플리케이션 전체에 대한 정보 공유
		ServletContext application = getServletContext();
		
		String applicationInfo = (String)application.getAttribute("application");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<p>"+requestInfo+"<p>");
		out.print("<p>"+sessionInfo+"<p>");
		out.print("<p>"+applicationInfo+"<p>");
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
