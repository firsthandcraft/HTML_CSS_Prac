package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextServlet
 */
@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TextServlet() {
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
		
		PrintWriter out = response.getWriter();//�������� ���ܳ��� ���
		//��û�ڷ� �޾ƿ���
		out.print("ģ���̸�"+request.getParameter("friendName")+"�Դϴ�.");//html�� �׸��� �̸��� �����´�
		//getWriter( )�� Ŭ���̾�Ʈ�� �����ϱ� ���� ��� ��Ʈ���� ��ȯ�Ѵ�. �׸��� �� ��� ��Ʈ���� �̿��� Ŭ���̾�Ʈ���� ������ ������ �ȴ�.
		out.close();//����������, ��� ������ ��ģ �Ŀ� ��½�Ʈ�� ��ü�� close( )�޼ҵ带 �̿��� ��Ʈ���� �ݾ� �����ν� Ŭ���̾�Ʈ�� ���������� ����� ��� ��Ʈ���� ���� �ݴϴ�.
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
