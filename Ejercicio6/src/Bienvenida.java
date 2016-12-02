
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Bienvenida
 */
@WebServlet("/Bienvenida")
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Bienvenida() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sesion = request.getSession();
		String usuario = (String) request.getAttribute("usuario");
		String contrasena = (String) request.getAttribute("contrasena");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		if ((sesion.getAttribute("autenticado") == null || sesion.getAttribute("autenticado") == null)
				&& usuario.equals("alumno") && contrasena.equals("alumno123")) {
			sesion.setAttribute("usuario", usuario);
			sesion.setAttribute("contrasena", contrasena);
			sesion.setAttribute("autenticado", true);
			sesion.setAttribute("bienvenida", true);
			out.println("Bienvenido!!");
			out.println("<form method =\"GET\" action=\"Login\">");
			out.println("<button>Salir</button>");
			out.println("</form>");

		} else {
			if (sesion.getAttribute("autenticado") == null && usuario == null && contrasena == null) {
				out.println("No puede estar aquí");
				out.println("<a href=\"/login.html\"></a>");
			} else {
				if(!usuario.equals("alumno") || !contrasena.equals(contrasena)) {
					out.println("Usuario o clave incorrecta");
					out.println("<a href=\"/login.html\"></a>");
				}
			}
		}

		out.println("</body>");
		out.println("</html>");
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
