package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDao;
import model.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("userId");
		String password = request.getParameter("userPass");
		MemberDao dao= new MemberDao();//db접근할려고 
		ArrayList<MemberVO> list = dao.LoginMemberList(id,password);

		//
		if(list.size()!=0) {
			HttpSession session = request.getSession();
			session.setAttribute("userId",list);
			for(int i = 0; i<list.size();i++) {
				out.print(list.get(i).getName()+"입장환영");
			}
			out.print("<hr> <a href ='ShopServlet'>쇼핑몰 페이지로</a>");
		} else {
			out.print("<script>");
			out.print("alert('로그인 실패');");
			out.print("location.href='login.html';");
			out.print("</script>");
		}
		out.close();
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
