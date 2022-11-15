package member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
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
		String type="";
		String result="";
		Service service = new ServiceImpl();
		Member m = null;
		String id = "", pwd="";
		boolean flag= false;
		HttpSession session= null;
		type= request.getParameter("type");
		
		
		if(type.equals("join")) {
			m = new Member();
			m.setId(request.getParameter("id"));
			m.setPwd(request.getParameter("pwd"));
			m.setName(request.getParameter("name"));
			m.setEmail(request.getParameter("email"));
			service.join(m);
			result= "member/login.jsp";
			
		} else if(type.equals("login")) {
			id=request.getParameter("id");
			pwd=request.getParameter("pwd");
			flag=service.login(id, pwd);
			/*System.out.println(id+"id");
			System.out.println(pwd+"pwd");*/
			if(flag) {
				session=request.getSession();
				session.setAttribute("id", id);
				result="member/result.jsp";
			} else {
				result= "member/login.jsp";
			}
			
		}else if(type.equals("logout")) {
			session=request.getSession(false);
			session.removeAttribute("id");
			session.invalidate();
			result="member/login.jsp";
		}else if(type.equals("out")) {
			session=request.getSession(false);
			id= (String)session.getAttribute("id");
			
			service.delMember(id);
			result="/Controller?type=logout";
		}else if(type.equals("search")) {
			session=request.getSession(false);
			id= (String)session.getAttribute("id");
			m=service.getMember(id);
			request.setAttribute("m",m);
			result="member/search.jsp";
		}else if(type.equals("edit")) {
			m= new Member();
			m.setId(request.getParameter("id"));
			m.setPwd(request.getParameter("pwd"));
			m.setEmail(request.getParameter("email"));
			m.setName(request.getParameter("name"));
			service.editMember(m);
			result="member/result.jsp";
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(result);
		dispatcher.forward(request, response);
	}
	
	
	}


