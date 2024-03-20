package com.upload.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.upload.model.UploadDAO;
import com.upload.model.UploadDTO;

public class UploadModifyOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 자료실 수정 폼 페이지에서 넘어온 데이터들을
		// DB에 저장하는 비지니스 로직.
		
		UploadDTO dto = new UploadDTO();
		
		// 파일 업로드 시에는 설정해야 할 내용이 있음.
		// 1. 첨부 파일 저장 경로 지정.
		String saveFolder = 
				"C:\\Users\\boysb\\OneDrive\\바탕 화면\\15_Board_FileUpload\\WebContent\\upload";
		
		// 2. 첨부 파일 크기 지정.
		int fileSize = 10 * 1024 * 1024;  // 10MB
		
		// 3. MultipartRequest 객체 생성
		//    ==> 파일 업로드를 진행하기 위한 객체 생성.
		MultipartRequest multi = 
				new MultipartRequest(
					request,       // 일반적인 resuest 객체. 
					saveFolder,    // 첨부파일이 저장될 경로
					fileSize,      // 업로드할 첨부파일의 최대 크기
					"UTF-8",       // 문자 인코딩 방식
					new DefaultFileRenamePolicy()
					// 첨부 파일의 이름이 같은 경우 중복이 안되게 설정.
		);
		
		// 자료실 수정 폼 페이지에서 넘어온 데이터들을 받아 주자.
		String upload_writer = 
			multi.getParameter("upload_writer").trim();
		
		String upload_title = 
				multi.getParameter("upload_title").trim();
		
		String upload_cont = 
				multi.getParameter("upload_cont").trim();
		
		String upload_pwd = 
				multi.getParameter("upload_pwd").trim();
		
		// 자료실 폼 페이지에서 type="file" 속성으로 되어 있으면
		// getFile() 메서드로 받아 주어야 함.
		File upload_file = multi.getFile("upload_file");
		
		// 히든으로 넘어온 정보드 받아주어야 한다.
		int upload_no = 
			Integer.parseInt(multi.getParameter("uno").trim());
		
		System.out.println("upload_no >>> " + upload_no);
		
		if(upload_file != null) {  // 첨부파일이 존재하는 경우
			
			// 우선은 첨부파일의 이름을 알아야 함.
			// getName() 메서드를 이용하면 이름을 알 수 있음.
			String fileName = upload_file.getName();
			System.out.println("첨부파일 이름 >>> " + fileName);
			
			// 날짜 객체 생성
			Calendar cal = Calendar.getInstance();
			
			int year = cal.get(Calendar.YEAR);
			
			int month = cal.get(Calendar.MONTH) + 1;
			
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			// ......../fileUpload/2023-03-28
			String homedir = 
				saveFolder+"/"+year+"-"+month+"-"+day;
			
			// 날짜 폴더를 만들어 보자.
			File path1 = new File(homedir);
			
			if(!path1.exists()) {  // 폴더가 존재하지 않는 경우
				path1.mkdir();   // 실제 폴더를 만들어 주는 메서드.
			}
			
			// 파일을 만들어 보자 ==> 예) 홍길동_파일명
			String reFileName = 
						upload_writer+"_"+fileName;
			
			upload_file.renameTo
				(new File(homedir+"/"+reFileName));
			
			// 실제로 DB에 저장되는 파일 이름.
			// "/2023-03-28/홍길동_파일명" 으로 저장 예정.
			String fileDBName =
				"/"+year+"-"+month+"-"+day+"/"+reFileName;
			
			dto.setUpload_file(fileDBName);
		}
		
		dto.setUpload_no(upload_no);
		dto.setUpload_writer(upload_writer);
		dto.setUpload_title(upload_title);
		dto.setUpload_cont(upload_cont);
		dto.setUpload_pwd(upload_pwd);
		
		UploadDAO dao = UploadDAO.getInstance();
		
		int check = dao.modifyUpload(dto);
		
		PrintWriter out = response.getWriter();
		
		if(check > 0) {
			out.println("<script>");
			out.println("alert('자료실 업로드 게시글 수정 성공!!!')");
			out.println("location.href='upload_content.do?no="+upload_no+"'");
			out.println("</script>");
		}else if(check == -1) {
			out.println("<script>");
			out.println("alert('비밀번호가 틀립니다. 확인해 주세요~~~')");
			out.println("history.back()");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('자료실 업로드 게시글 추가 실패~~~')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		return null;
	}

}
