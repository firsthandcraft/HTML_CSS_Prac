package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetcontentServlet
 */
@WebServlet("/SetcontentServlet")
public class SetcontextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetcontextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /*javax.servlet.ServletContext로 정의 되어ㅣ있다. 
     * 서블릿과 컨테이너간의 연동을 위해 사용
     * 컨텍스트(웹 어플리케이션)마다 하나의 ServletContext 가 생성된다. 
     * 서블릿끼리 자원(데이터)을 공유하는데 사용한다. 
     * 컨테이너 실행시 생성되고 컨테이너 종료시 소멸된다. 
     * */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ServletContext context = this.getServletContext();//내가 사용하는ServletContext를 가져온다.
		//데이터를 공유하는 공간 scope객체
		context.setAttribute("info", "손연재");//앞의 이름 , 데이터
		out.print("ServletContext에 data setting...");
		out.print("<a href='GetContextServlet'>GetContextServelt</a>");
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
