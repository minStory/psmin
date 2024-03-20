package com.upload.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upload.model.UploadDAO;
import com.upload.model.UploadDTO;

public class UploadDeleteOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 삭제 폼 페이지에서 넘어온 글번호와 비밀번호를 가지고
		// DB에서 해당 게시글을 삭제하는 비니지스 로직.
		String upload_pwd = 
			request.getParameter("pwd").trim();
		
		int upload_no = 
			Integer.parseInt(request.getParameter("no").trim());
		
		UploadDAO dao = UploadDAO.getInstance();
		
		// 글번호에 해당하는 게시글의 상세내역 조회하는 메서드 호출.
		UploadDTO cont = dao.uploadContent(upload_no);
		
		// fileUpload 폴더에 업로드된 첨부파일까지 삭제하자.
		String upload = 
			"C:\\NCS\\workspace(jsp)\\15_Board_FileUpload\\WebContent\\upload";
		
		// 상세내역에서 업로드된 첨부파일을 가져오자.
		String fileName = cont.getUpload_file();
		
		PrintWriter out = response.getWriter();
		
		if(upload_pwd.equals(cont.getUpload_pwd())) {
			
			int check = dao.deleteUpload(upload_no);
			
			if(fileName != null) {
				// 첨부파일이 존재하는 경우
				File file = new File(upload + fileName);
				
				file.delete();  // 파일을 제거하는 메서드.
			}
			
			if(check > 0) {
				dao.updateSequence(upload_no);
				
				out.println("<script>");
				out.println("alert('자료실 게시판 게시글 삭제 성공!!!')");
				out.println("location.href='upload_list.do'");
				out.println("</script>");
			}else {
				out.println("<script>");
				out.println("alert('자료실 게시판 게시글 삭제 실패~~~')");
				out.println("history.back()");
				out.println("</script>");
			}
		}else {
			// 비밀번호가 틀린 경우
			out.println("<script>");
			out.println("alert('비밀번호가 틀립니다. 확인 요망~~~')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		
		return null;
	}

}
