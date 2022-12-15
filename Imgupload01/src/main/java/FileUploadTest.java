

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadTest
 */
@WebServlet("/FileUploadTest")
public class FileUploadTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadTest() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = "C:\\uploadTest"; //폴더 경로
		File Folder = new File(path);

		// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //폴더 생성합니다.
			    System.out.println("폴더가 생성되었습니다.");
		        } 
		        catch(Exception e){
			    e.getStackTrace();
		        }        
	       }else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
	       }
		//
		
		req.setCharacterEncoding("UTF-8");

        // 파일 작성자
        String fileWriter = req.getParameter("fileWriter");
        // 파일 설명
        String fileDescription = req.getParameter("fileDescription");
        // 파일 이름
        Part part =new Part();
         part = req.getPart("fileName");
        System.out.println("part:"+part);
        
        
        
        String fileName = getFilename(part);
        if (!fileName.isEmpty()) {
            part.write("C:\\uploadTest\\"+fileName);
        }
     // 응답 작성
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.print("작성자: " + fileWriter + "<br>");
        writer.print("파일명:<a href='FileDownloadTest?fileName=" + fileName + "'> " + fileName + "</a href><br>"); 
        writer.print("파일설명: "+ fileDescription + "<br>"); // 다운로드 추가
        writer.print("파일크기: " + part.getSize() + " bytes" + "<br>");
    
        
	}


	private String getFilename(Part part) {
		// TODO Auto-generated method stub
		 String contentDisp = part.getHeader("content-disposition");
	        String[] split = contentDisp.split(";");
	        for (int i = 0; i < split.length; i++) {
	            String temp = split[i];
	            if (temp.trim().startsWith("filename")) {
	                return temp.substring(temp.indexOf("=") + 2, temp.length() - 1);
	            }
	        }
	        return "";
	}
	

}
