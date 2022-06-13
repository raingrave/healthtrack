package br.fiap.healthtrack.controllers.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/registrar-usuario")
public class RegistrarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = (String) request.getParameter("nome");
		String email = (String) request.getParameter("email");
		String senha= (String) request.getParameter("senha");
		
		response.getWriter().append("<p>"+nome+"</p>");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("sucesso", "Operação realizada com sucesso!");
		
		response.sendRedirect(request.getContextPath() + "/criar-usuario");
	}

}
