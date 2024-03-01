package webproject.jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webproject.jdbc.model.service.SalgradeService;
import webproject.jdbc.model.vo.Salgrade;

/**
 * Servlet implementation class SalgradeController
 */
@WebServlet("/list")
public class SalgradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalgradeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SalgradeService service = new SalgradeService();
		List<Salgrade> result = service.selectList();
		System.out.println("컨트롤 작동");

		if (result != null) {
			request.setAttribute("volist", result);
			request.getRequestDispatcher("views/salgradelist.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "저는 에러에영");
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
