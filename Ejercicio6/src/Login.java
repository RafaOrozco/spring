

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession sesion = request.getSession();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		if(sesion.getAttribute("autenticado")==null) {
			
			out.println("<form  method =\"POST\" action=\"Bienvenida\">");
			out.println("<p>Usuario<input name=\"usuario\"></input></p>");
			out.println("<p>Contraseña  <input name=\"contrasena\"></input></p>");
			out.println("<button>Entrar</button>");
			out.println("</form>");
			
		} else  if(sesion.getAttribute("bienvenida")==null){
			out .println("Ya ha iniciado la conexion, viste la página bienvenida");
			out.println("<a href=\"Bienvenida\"></a>");
		} else {
			sesion.invalidate();
			out.println("<form  method =\"GET\" action=\"Bienvenida\" >");
			out.println("<p>Usuario<input name=\"usuario\"></input></p>");
			out.println("<p>Contraseña  <input name=\"contrasena\"></input></p>");
			out.println("<button>Entrar</button>");
			out.println("</form>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
