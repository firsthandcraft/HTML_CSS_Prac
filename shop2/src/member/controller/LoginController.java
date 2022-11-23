package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.service.Service;
import member.service.ServiceImpl;
import model.Member;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 기능을 제공할 서비스 객체 생성
		Service service = new ServiceImpl();
		boolean flag= false;
		
		//로그인시 필요한 session 생성
		HttpSession session= request.getSession();
		//매개변수 2개 가져오기
		// 로그인에 필요한 요청 파라메터을 읽는다.
		String id= request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//2개 가져오기 1.id 가져오기 2. type가져오기
		
		//id 일치하는 값 확인하기 
		Member m = service.getMember(id);//id 할당
		int type=0;//type 할당
		
		String path="/view/member/loginForm.jsp";
		if(m !=null && pwd.equals(m.getPwd())) {
			session.setAttribute("m",m);
			session.setAttribute("id", id);
			type= m.getType();
			session.setAttribute("memberType",type);
			if(type==1) {
				path="seller/List";
			} else if(type==2) {
				path="order/List";
			} 
			flag= true;
			System.out.println("LoginController type :"+type);
		}
		//일치 하는 값이 있을경우 session이 형성되게
		session.setAttribute("flag", flag);
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
	}

}
