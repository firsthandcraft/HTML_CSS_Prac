package step2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet1
 */
//어노테이션 변경해보기
@WebServlet(name="Myservlet1", urlPatterns= {"/MyServlet1"},
		initParams= {@WebInitParam(name="param1" , value="value1"),
					@WebInitParam(name="param2" , value="value2")
			}
		)
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		//ServletConfig 개개체는 서블릿객체마다 하나씩 할당된다. 
		//그래서 ServletConfig 객체는 현재 서블릿파일의 안에서만 사용할 정보나 초기화
		//파라미터를 저장하는 용도호 사용되낟. 
		System.out.println(config.getInitParameter("param1"));
		System.out.println(config.getInitParameter("param2"));
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
