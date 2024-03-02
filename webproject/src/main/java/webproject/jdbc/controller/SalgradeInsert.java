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
 * Servlet implementation class SalgradeInsert
 */
@WebServlet("/list/insert")
public class SalgradeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalgradeInsert() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ?grade=9&losal=30&hisal=8989
		String addgrade = request.getParameter("grade");
		String addlosal = request.getParameter("losal");
		String addhisal = request.getParameter("hisal");

		int grade = Integer.parseInt(addgrade);
		int losal = Integer.parseInt(addlosal);
		int hisal = Integer.parseInt(addhisal);

		SalgradeService service = new SalgradeService();

		Salgrade vo = new Salgrade(grade, losal, hisal);

		int result = service.insert(vo);

		if (result > 0) {

			response.sendRedirect(request.getContextPath() + "/list");

		} else {

			request.setAttribute("msg", "나는 에러다");

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
