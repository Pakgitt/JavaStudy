package webproject.jdbc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webproject.jdbc.model.service.SalgradeService;

/**
 * Servlet implementation class SalgradeDeleteController
 */
@WebServlet("/list/delete")
public class SalgradeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalgradeDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String removegrade = request.getParameter("grade");
		
		int grade = Integer.parseInt(removegrade);
		SalgradeService service = new SalgradeService();
		int result = service.delete(grade);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath() + "/list");
		}else {
			request.setAttribute("msg", "오류오류오루");
			request.getRequestDispatcher("/views/errorpage.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
