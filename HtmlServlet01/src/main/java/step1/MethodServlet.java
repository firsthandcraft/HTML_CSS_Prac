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
    //get�޼ҵ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����response.getWriter().append("Served at: ").append(request.getContextPath());
		//�����(" ����Ÿ��; �ѱ�ó��uft-8�� ��� ������ �ٱ��� EUC-KR �� ���� �ѱ�")
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();//�������� ���ܳ��� ���
		//��û�ڷ� �޾ƿ���
		out.print("get������� ��û");
		out.print(request.getParameter("user"));//html�� �׸��� �̸��� �����´�
		out.close();//
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post�޼ҵ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����doGet(request, response);
		//post����ϋ� ��û���� �ѱ�ó��(Ŭ���̾�Ʈ���� �Է¹��� �ѱ��� ������ ���� ����)
		request.setCharacterEncoding("utf-8");
		//�����(" ����Ÿ��; �ѱ�ó��uft-8�� ��� ������ �ٱ��� EUC-KR �� ���� �ѱ�")
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();//�������� ���ܳ��� ���
		//��û�ڷ� �޾ƿ���
		out.print("post������� ��û");
		out.print(request.getParameter("userId"));//html�� �׸��� �̸��� �����´�
		out.close();//
	}

}
