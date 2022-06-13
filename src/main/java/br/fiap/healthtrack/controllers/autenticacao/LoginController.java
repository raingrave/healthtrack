package br.fiap.healthtrack.controllers.autenticacao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/autenticacao/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = (String) request.getParameter("email");
		String senha= (String) request.getParameter("senha");
		
		HttpSession session = request.getSession();
		
		String url = request.getContextPath() + "/dashboard";
		
		if (email != "admin@admin.com" && senha != "admin123") {
			session.setAttribute("erro", "Falha ao efetuar o login!");
			
			url = request.getContextPath() + "/login";
		}
		
		response.getWriter().append("url: " + url);
		
		response.sendRedirect(url);
	}

}
