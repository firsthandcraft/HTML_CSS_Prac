package product.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import product.service.Service;
import product.service.ServiceImpl;

/**
 * Servlet implementation class EditController
 */
@WebServlet(name = "ProdEditController", urlPatterns = { "/seller/Edit" })
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Service service = new ServiceImpl();
		Product p = new Product();
		//img
		String img="";
		int maxSize=1024*1024*10;//최대 10MByte 까지 허용 s
		String uploadPath="C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\webapps\\shop_product_img";
		try {
			MultipartRequest multi= new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
			p.setName(multi.getParameter("name"));
			p.setQuantity(Integer.parseInt(multi.getParameter("quantity")));
			p.setPrice(Integer.parseInt(multi.getParameter("price")));
			p.setContent(multi.getParameter("content"));
			p.setNum(Integer.parseInt(multi.getParameter("num")));
			p.setS_id(multi.getParameter("s_id"));
			String uploadPath1="C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\webapps\\shop_product_img\\";
			Enumeration files = multi.getFileNames();
			while(files.hasMoreElements()) {
				String file1 = (String)files.nextElement();
				img=multi.getFilesystemName(file1);
				File file= multi.getFile(file1);	
				if(img!=null) {
					Product p1= service.getProduct(p.getNum());
					String arr[]=p1.getImg().split("/");
					String fname=arr[arr.length-1];//배열이 0부터 들어가게
					File f= new File(uploadPath1+fname);
					//System.out.println(f);
					f.delete();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		if(img!=null) {
			p.setImg("/shop_product_img/"+img);
			System.out.println(p.getImg());
		}
		service.editProduct(p);
		response.sendRedirect("/shop2/seller/List");
		
	}

}
