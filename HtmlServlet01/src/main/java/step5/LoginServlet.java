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
		//getParameterValue- �Ѱ� �����;ȿ� üũ�ڽ� ���� ������ ���ð�� ��� ��� string Ÿ��. 
		if(loginId.equals("java") && loginPw.equals("1234")) {//equals -- ���ڰ���
			out.println("�α��� ����");
		} else{
			out.println("�α��� ���� "+"<a href='/Web3/step5.html'>���ư���</a>");		
		} 
		out.close();
		
		//doGet(request, response); --post�� �ڵ带 ĥ��� get���⿡ �� �ڵ� ���� 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);//���� �ȳ��� ���� post �����ϰ� get�� �ڵ带 �ĵ� �����̵ȴ�. 
		
		// post ����� ����Ʈ �ּҰ� �Ⱥ��̰� �������� ���� ������ ����. 
	}

}
