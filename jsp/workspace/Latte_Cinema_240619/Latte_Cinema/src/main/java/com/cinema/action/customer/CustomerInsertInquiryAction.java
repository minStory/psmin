package com.cinema.action.customer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.InquiryHistoryDTO;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class CustomerInsertInquiryAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		MemberDTO mDto = (MemberDTO) session.getAttribute("dto");
		String writer_no = mDto.getMember_no();
		String writer_id = mDto.getMember_id();

		String saveFolder = "D:\\workspace\\Latte_Cinema\\src\\main\\webapp\\upload_images";

		int fileSize = 10 * 1024 * 1024; // 10MB

		MultipartRequest multi = new MultipartRequest(request, // 일반적인 request 객체
				saveFolder, // 첨부파일이 저장될 경로
				fileSize, // 업로드할 첨부파일의 최대크기
				"UTF-8", // 문자 인코딩 방식
				new DefaultFileRenamePolicy());

		String type_etc = multi.getParameter("type_etc");
		String type = multi.getParameter("type");
		String title = multi.getParameter("title");
		String content = multi.getParameter("content");
		String customer_name = multi.getParameter("name");
		String phone = "(" + multi.getParameter("mobile_carrier") + ")" + multi.getParameter("phone1") + "-"
				+ multi.getParameter("phone2") + "-" + multi.getParameter("phone3");
		String email = multi.getParameter("email");

		File upload_file = multi.getFile("faq_image");

		InquiryHistoryDTO dto = new InquiryHistoryDTO();

		if (upload_file != null) { // 첨부파일이 존재 하는 경우

			String fileName = upload_file.getName();

			Calendar cal = Calendar.getInstance();

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DAY_OF_MONTH);

			String homedir = saveFolder + "/" + year + "-" + month + "-" + day;

			File path1 = new File(homedir);

			if (!path1.exists()) { // 폴더가 존재하지 않는다면..
				path1.mkdir(); // 실제 폴더를 만들어 주는 메서드.
			}

			String reFileName = writer_id + "_" + fileName;

			upload_file.renameTo(new File(homedir + "/" + reFileName));

			String fileDBName = year + "-" + month + "-" + day + "/" + reFileName;

			dto.setInquiry_history_file(fileDBName);

		}
		
		dto.setInquiry_history_type_etc(type_etc);
		dto.setInquiry_history_type(type);
		dto.setInquiry_history_title(title);
		dto.setInquiry_history_content(content);
		dto.setInquiry_history_writer_no(writer_no);
		dto.setInquiry_history_writer_id(writer_id);
		dto.setInquiry_history_customer_name(customer_name);
		dto.setInquiry_history_phone(phone);
		dto.setInquiry_history_email(email);

		LatteDAO dao = LatteDAO.getInstance();

		int check = dao.insertInquiry(dto);

		PrintWriter out = response.getWriter();

		if (check > 0) {
			out.println("<script>");
			out.println("alert('추가 성공!!')");
			out.println("location.href = 'main'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('추가 실패!!')");
			out.println("history.back()'");
			out.println("</script>");
			out.close();
		}
		return null;
	}
}