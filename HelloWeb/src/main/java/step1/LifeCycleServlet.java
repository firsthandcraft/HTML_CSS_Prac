package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	//변수 만들기
	private int count;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet() {
        super();
        System.out.println("객체생성");
        // TODO Auto-generated constructor stub
    }
     

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		System.out.println("init() call");
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("*******destroy전 백업시작*******");
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e){
			e.printStackTrace();
		
		} System.out.println("*******destroy전 백업종료*******");
//		super.destroy();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		count++;
		out.print("<font size=7>"+count+"</font>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
