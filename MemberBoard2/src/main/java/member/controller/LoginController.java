package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.service.JoinService;
import member.service.JoinServiceImpl;
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
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		JoinService service= new JoinServiceImpl();
		boolean flag= false;
		HttpSession session= request.getSession();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//
		Member m= new Member();
		m=service.getMember(id);
		if(m!=null && pwd.equals(m.getPwd())) {
			session.setAttribute("m",m);
			session.setAttribute("id",id);
			flag= true;
		}
		session.setAttribute("flag", flag);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ListController");
		if(dispatcher!=null) {
			dispatcher.forward(request, response);
		}
	}

}
