package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ProductVO;

/**
 * Servlet implementation class SetProductServlet
 */
@WebServlet("/SetProductServlet")
public class SetProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetProductServlet() {
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
		ServletContext context = this.getServletContext();//�궡媛� �궗�슜�븯�뒗ServletContext瑜� 媛��졇�삩�떎.
		//�뜲�씠�꽣瑜� 怨듭쑀�븯�뒗 怨듦컙 scope媛앹껜
		context.setAttribute("product", new ProductVO("nexus","�꽖�꽌�뒪s",100));//�븵�쓽 �씠由� , �뜲�씠�꽣
		out.print("ServletContext�뿉 data setting...");
		out.print(this.getServletName());
		out.print("<a href='GetProductServlet'>GetProductServlet</a>");
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
