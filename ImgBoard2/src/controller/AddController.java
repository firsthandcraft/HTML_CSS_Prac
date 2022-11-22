package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import service.Service;
import service.ServiceImpl;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/seller/Add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddController() {
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
		p.setNum(service.makeNum());
		String img =null;
		int maxSize=1024*1024*10;//최대 10MByte 까지 허용 
		String uploadPath="C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\webapps\\shop_img";
		
		try {
			//MultipartRequest사진을 저장하는 폴더의 위치
			// MultipartRequest형식 :request,파일저장경로,용량,인코딩타입,중복파일명에 대한 기본 정책
			MultipartRequest multi = new MultipartRequest(request, uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
			p.setName(multi.getParameter("name"));
			p.setQuantity(Integer.parseInt(multi.getParameter("quantity")));
			p.setPrice(Integer.parseInt(multi.getParameter("price")));
			p.setContent(multi.getParameter("content"));
			//전송한 전체 파일들의 이름을 가져온다. 
			Enumeration files = multi.getFileNames();
			//form 태그에서 <input type="file" name="여기에 저장한 이름"/>을 가져온다.
			while(files.hasMoreElements()) {
			//hasMoreElement()는 커서 바로 앞에 데이타가 들어있는지를 체크
				String file1 = (String)files.nextElement();//그에 해당하는 실재 파일 이름을 가져옴
				//nextElement 다음 칸으로 옮겨줌
			//String img=multi.getOriginalFileName(file1); --> 안됨
				img=multi.getFilesystemName(file1);
				//파일 업로드
				File file= multi.getFile(file1);	
				//getOriginalFileName() 메소드는 MultipartReuest 클래스의 생성자 중 중복된 파일을 덮아쓰는 것을 방지하기 위해
				//파일명이 변경되 전의 파일명을 반환한다.
				//getFilesystemName() 메소드는 기존에 업로드된 파일명들 중에 새로 업로드할 파일명이
				//중복될 경우 파일명 뒤에 <원파일명1.확장자, 원파일명2.확장자> 식으로 변경된 이름을 반환
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		//dto 클래스의 setImg에 이미지 경로를 넣는다. 
		p.setImg("/shop_img/"+img);
		service.add(p);
		response.sendRedirect("/ImgBoard/seller/List");
		
	}

}
