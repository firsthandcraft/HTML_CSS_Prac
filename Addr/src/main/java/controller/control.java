
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AddrDao.Member;
import service.EventService;

/**
 * Servlet implementation class control
 */
@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public control() {
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
		PrintWriter out= response.getWriter();
		String type= request.getParameter("type");
		String resultView= "addr/";
		EventService service = new EventService();

		if(type.equals("insert")) {
			String name= request.getParameter("name");
			String tel= request.getParameter("tel");
			String addr= request.getParameter("addr");
			int postal= Integer.parseInt(request.getParameter("postal"));
			Member p = new Member(0,name,tel,addr,postal);
			service.insert(p);
			resultView+="index.jsp";
		} else if(type.equals("list")) {
			ArrayList<Member> data= service.list();
			request.setAttribute("data", data);
			resultView+="list.jsp";
		} else if (type.equals("update")) {
			int sno = Integer.parseInt(request.getParameter("num"));
			Member p = service.getMember(sno);
			request.setAttribute("p", p);
			resultView+="update.jsp";
		} 
		
		else if (type.equals("edit")){
			int pno = Integer.parseInt(request.getParameter("num"));
			String name= request.getParameter("name");
			String tel= request.getParameter("tel");
			String addr= request.getParameter("addr");
			int postal= Integer.parseInt(request.getParameter("postal"));
			Member p = new Member(pno,name,tel,addr,postal);
			service.insert(p);
			resultView+="index.jsp";
		} else if(type.equals("delete")){
			int num2 = Integer.parseInt(request.getParameter("num"));
			service.delete(num2);
			resultView="control?type=list";
		}
		
		
		
		
		
		//페이지 이동 할때
		RequestDispatcher dis= request.getRequestDispatcher(resultView);
		dis.forward(request,response);
	}

}
