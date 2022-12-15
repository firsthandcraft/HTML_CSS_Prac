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

import model.ProductVO;
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
		String resultView= "board/";
		EventService service = new EventService();
		
		if(type.equals("insert")) {
			String pname= request.getParameter("pname");
			String pmaker= request.getParameter("pmaker");
			String pprice= request.getParameter("pprice");
			//가격을 숫자로 넣고 싶을때 
			//int pprice=Integer.parseInt(request.getParameter("pprice"));
			String pdetail= request.getParameter("pdetail");
			//시퀀스 할당
			//받은 값은 4개 테이블수 는 5개 
			ProductVO vo= new ProductVO(0,pname,pmaker,pprice,pdetail);
			service.insert(vo);
			resultView+="index.jsp";
			
		} else if(type.equals("list")) {
			ArrayList<ProductVO> data= service.list();
			request.setAttribute("data",data);
			//페이지 연결 
			resultView+="list.jsp";
			
		} else if(type.equals("update")) {//업데이트

			int sno=Integer.parseInt(request.getParameter("pno"));
			ProductVO m= service.getMember(sno);
			request.setAttribute("m",m);
			//페이지 연결 
			resultView+="update.jsp";
			
		}else if(type.equals("edit")) {//수정

			int pno=Integer.parseInt(request.getParameter("pno"));
			String pname= request.getParameter("pname");
			String pmaker= request.getParameter("pmaker");
			String pprice= request.getParameter("pprice");
			String pdetail= request.getParameter("pdetail");
			ProductVO p= new ProductVO(pname,pmaker,pprice,pdetail);
			service.edit(p); 
			//페이지 연결 
			resultView+="index.jsp";
			
		}else if(type.equals("delete")) {
			int num = Integer.parseInt(request.getParameter("pno"));
			service.delete(num);
			//페이지 연결 
			resultView="control?type=list";
			//resultView+="index.jsp";
		} 
		
		RequestDispatcher dis = request.getRequestDispatcher(resultView);
		dis.forward(request, response);
		
		
	}

}
