package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import service.JoinService;
import service.JoinServiceImpl;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		
		JoinService service= new JoinServiceImpl();
		boolean flag=false;
		
		HttpSession session= request.getSession(); 
		String id =request.getParameter("id");
		String pwd =request.getParameter("pwd");
		
		Member m =service.getMember(id); 
		if(m !=null && pwd.equals(m.getPwd())) {
			session.setAttribute("id",id); 
			flag= true;
		}
		//일치 하는 값이 있을경우 session이 형성되게
		session.setAttribute("flag", flag);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/member/result.jsp");
		
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
		
	}

}
