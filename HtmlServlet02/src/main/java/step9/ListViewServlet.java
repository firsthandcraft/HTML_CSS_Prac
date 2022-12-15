package step9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.PersonVO;

/** 
 * Servlet implementation class ListViewServlet
 */
@WebServlet("/ListViewServlet")
public class ListViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//ArrayList만들기 
    private ArrayList list = new ArrayList();
    
    //source > override implement Method> Generic Servlet > int()추가
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context= this.getServletContext();
		list=(ArrayList)context.getAttribute("table");//Object 타입이다.
	}

    public ListViewServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(list==null){
			out.print("입장명단이 없습니다.");
		}else {
			int count =1;
			out.print("<table border='1'>");
			out.print("<tr>");
			out.print("<td>인원수</td>");
			out.print("<td>아이디</td>");
			out.print("<td>닉네임</td>");
			out.print("</tr>");
			for(int i=0; i<list.size();i++) {
				PersonVO vo = (PersonVO)list.get(i);
				out.print("<tr>");
				out.print("<td>"+count+"</td>");
				out.print("<td>"+vo.getId()+"</td>");
				out.print("<td>"+vo.getNick()+"</td>");
				out.print("</tr>");
				count++;
			}
			out.print("</table>");
		}

		list.add(new PersonVO(request.getParameter("id"),request.getParameter("nick")));
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
