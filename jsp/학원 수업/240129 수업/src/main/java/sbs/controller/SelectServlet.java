package sbs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbs.model.StudentDAO;
import sbs.model.StudentDTO;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDAO dao = new StudentDAO();
		
		List<StudentDTO> studentDTO = dao.selectStudentList();
		
		request.setAttribute("List",  studentDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("view/StudentList.jsp");
		
		rd.forward(request, response);
	}

}
