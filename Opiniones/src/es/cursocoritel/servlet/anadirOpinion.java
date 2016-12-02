package es.cursocoritel.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class anadirOpinion
 */
@WebServlet("/anadirOpinion")
public class anadirOpinion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public anadirOpinion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext sc = request.getServletContext();
		List<Opinion> opiniones = (List<Opinion>) sc.getAttribute("opiniones");
		if (opiniones == null) {
			opiniones = new ArrayList<>();
		}
		Opinion opinion = new Opinion();
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String comentario = request.getParameter("comentario");
		int id = opiniones.size();
		opinion.setID(id);
		opinion.setNombre(nombre);
		opinion.setEdad(edad);
		opinion.setOpinion(comentario);
		opiniones.add(opinion);
		sc.setAttribute("opiniones", opiniones);
		response.sendRedirect("verOpiniones");

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
