

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aleatorio
 */
@WebServlet("/Aleatorio")
public class Aleatorio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int contador;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aleatorio() {
    	
        super();
        // TODO Auto-generated constructor stub
        contador=0;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		contador++;
		int temp = contador;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("El numero aleatorio es: "+Math.random());
		out.println("Numero de veces que se ha vistado la pagina: "+temp);
		out.println("</body>");
		out.println("</html>");
		response.addIntHeader("Refresh", 5);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
