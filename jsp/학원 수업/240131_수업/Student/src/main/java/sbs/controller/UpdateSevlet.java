package sbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbs.model.StudentDAO;
import sbs.model.StudentDTO;

@WebServlet("/update")
public class UpdateSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateSevlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get방식으로 넘어온 학번에 해당하는 학생의 정보를 view page로 이동시키는 비지니스 로직
		//버튼으로 넘어왔기 때문에 한글처리는 필요없다.
		
		String id = request.getParameter("no").trim();
		
		//만약에 정수형으로 넘어왔다면
		//int id = Integer.parseInt(request.getParameter("no"));
		
		//DAO를 통해 DB에 접근해서 데이터를 처리해야 하므로 DAO객체를 먼저 생성한다.
		StudentDAO dao = new StudentDAO();
		
		StudentDTO cont = dao.getStudent(id);
		
		//request 객체에 방금 가져온 학생의 데이터(font)를 Content라는 이름으로 담아서 넘겨줄 예정이다.
		//request.setAttribute(키, 값);
		request.setAttribute("Content", cont);
		
		RequestDispatcher rd = request.getRequestDispatcher("view/StudentUpdate.jsp");
		
		//실질적인 이동
		rd.forward(request, response);
		
	}

}
