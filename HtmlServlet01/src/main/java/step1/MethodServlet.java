package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodServlet
 */
@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MethodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//삭제response.getWriter().append("Served at: ").append(request.getContextPath());
		//응답시(" 문서타입; 한글처리uft-8은 영어를 제외한 다국어 EUC-KR 은 순수 한글")
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();//서블렛에서 간단내용 출력
		//요청자료 받아오기
		out.print("get방식으로 요청");
		out.print(request.getParameter("user"));//html의 항목의 이름을 가져온다
		out.close();//
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//삭제doGet(request, response);
		//post방식일떄 요청정보 한글처리(클라이언트에서 입력받은 한글이 깨지는 것을 방지)
		request.setCharacterEncoding("utf-8");
		//응답시(" 문서타입; 한글처리uft-8은 영어를 제외한 다국어 EUC-KR 은 순수 한글")
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();//서블렛에서 간단내용 출력
		//요청자료 받아오기
		out.print("post방식으로 요청");
		out.print(request.getParameter("userId"));//html의 항목의 이름을 가져온다
		out.close();//
	}

}
