package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MapServlet
 */
@WebServlet("/MapServlet")
public class MapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
 

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;chaerset=utf-8");
		PrintWriter out = response.getWriter();
		//요청시 넘어온 데이터를 name vlaue 형식으로 표현
		//String key,String[] value 
		Map<String,String[]> map= request.getParameterMap();
		//map 으로 부터 key들을 반환받는다. keyset();
		//keyset()은 set을 반환하므로 iterator()를 열거할 수 있다. 
		//iterator()를 수행하면서next()를 호출하면 key 가 반환되고 
		//이는 html name이다. name을 map에 get(name)하면 value가 반환되는데 
		//이 value의 타입은 String[]이므로 
		//for loop를 수행하면 name과 value를 출력하면 된다. 
		
		//
		Set<String> set = map.keySet();
		Iterator<String> it= set.iterator();
		// <>제너릭 설정 
		String str=null;
		String str1[];
	
		
		while(it.hasNext()) {
			str=it.next();
			str1=map.get(str);//배열이 반환된다. 
			for(int i =0; i<str1.length;i++) {
				out.print(str+""+str1[i]);
			}
			out.print("<br>");
		}
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
