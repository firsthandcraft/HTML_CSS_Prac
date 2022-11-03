package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String loginId=request.getParameter("userId");
		String loginPw=request.getParameter("userPw");
		//getParameterValue- 한개 데이터안에 체크박스 같은 여러개 선택경우 사용 대신 string 타입. 
		if(loginId.equals("java") && loginPw.equals("1234")) {//equals -- 문자값비교
			out.println("로그인 성공");
		} else{
			out.println("로그인 실패 "+"<a href='/Web3/step5.html'>돌아가기</a>");		
		} 
		out.close();
		
		//doGet(request, response); --post에 코드를 칠경우 get여기에 저 코드 쓰기 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);//에러 안나는 이유 post 설정하고 get에 코드를 쳐도 실행이된다. 
		
		// post 방식은 사이트 주소가 안보이고 데이터의 양이 제한이 없다. 
	}

}
