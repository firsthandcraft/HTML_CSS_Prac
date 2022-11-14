package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.RequestDumperFilter;

import model.Member;
import service.JoinService;
import service.JoinServiceImpl;

/**
 * Servlet implementation class JoinController
 */
@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinController() {
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
		String id =request.getParameter("id");
		String pwd =request.getParameter("pwd");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		
		Member m= new Member(id,pwd,name,email);
		service.Join(m);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/member/loginForm.jsp");
		
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
		
		
	}

}
