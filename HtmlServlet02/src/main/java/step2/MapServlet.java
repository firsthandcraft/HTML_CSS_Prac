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
    	// 넘어온 파라미터의 인코딩 설정을 UTF-8로 설정
    	request.setCharacterEncoding("utf-8");
    
    	// HTML이 UTF-8 형식이라는 것을 브라우저에게 전달
    	response.setContentType("text/html; charset=utf-8");
    
    	// 서블릿을 통해 생성되는 HTML 파일의 인코딩을 UTF-8로 설정
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//map은 키,값으로 표현해줌
		//즉 html에서 요청시 넘어온 데이터를 name value 형식으로 표현
		//String key, String[] value 
		Map<String,String[]> map= request.getParameterMap();
		// name을 map에 get(name)하면 value가 반환되는데 
		//이 value의 타입은 String[]이므로 
		
		System.out.println("map:  "+map);//map:org.apache.catalina.util.ParameterMap@726cc78c
		//Map은 collection에 속하지 않기 때문에 keySet, entrySet, values를 호출해야 iterator를 사용할수 있다.
		//keyset()은 set을 반환하므로 iterator()를 열거할 수 있다. 
		Set<String> set = map.keySet();
		Iterator<String> it= set.iterator();
		// <>제너릭 설정 
		String str=null;
		String str1[];
		
		//for loop를 수행하면 name과 value를 출력하면 된다. 
		//iterator()를 수행하면서next()를 호출하면 key 가 반환되고 
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
