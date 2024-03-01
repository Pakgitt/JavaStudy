package webproject.jdbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webproject.jdbc.model.service.SalgradeService;
import webproject.jdbc.model.vo.Salgrade;

/**
 * Servlet implementation class SalgradeInsertController
 */
@WebServlet("/SalgradeInsertController")
public class SalgradeInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalgradeInsertController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String grade = request.getParameter("grade");
		String losal = request.getParameter("losal");
		String hisal = request.getParameter("hisal");

		SalgradeService service = new SalgradeService();

		Salgrade vo = new Salgrade(grade, losal, hisal);
		int result = service.insert(vo);

		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/list");
		} else {
			request.setAttribute("msg", "에러에러에러에러");
			request.getRequestDispatcher("views/errorpage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
