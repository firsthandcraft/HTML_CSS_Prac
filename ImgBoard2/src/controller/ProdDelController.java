package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.Service;
import service.ServiceImpl;

/**
 * Servlet implementation class ProdDelController
 */
@WebServlet("/seller/Del")
public class ProdDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdDelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		int num = Integer.parseInt(request.getParameter("num"));
		Service service= new ServiceImpl();
		Product p = service.getProduct(num);
		service.delProduct(num);
		
		
		String uploadPath="C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\webapps\\shop_img\\";
		String arr[]=p.getImg().split("/");
		String fname=arr[arr.length-1];//배열이 0부터 들어가게
		File f= new File(uploadPath+fname);
		System.out.println(f);
		f.delete();
		response.sendRedirect("/ImgUploads01/seller/List");
		
		
	}

}
