package br.fiap.healthtrack.controllers.usuario;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.fiap.healthtrack.daos.UsuarioDAO;
import br.fiap.healthtrack.entidades.Usuario;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String genero = (String) request.getParameter("genero");
		String nome = (String) request.getParameter("nome");
		String email = (String) request.getParameter("email");
		Integer idade = Integer.valueOf(request.getParameter("idade"));
		String senha = (String) request.getParameter("senha");
		Double peso = Double.valueOf(request.getParameter("peso"));
		Double altura = Double.valueOf(request.getParameter("altura"));
		
		HttpSession session = request.getSession();
		
		Usuario usuario = new Usuario(genero, nome, email, idade, senha, peso, altura);
		
		UsuarioDAO usuarioDAO;
		try {
			usuarioDAO = new UsuarioDAO();
			
			usuarioDAO.create(usuario);
			
			//response.getWriter().append("Usuario" + usuario.toString());
			
			session.setAttribute("sucesso", "Operação realizada com sucesso!");
			
			response.sendRedirect(request.getContextPath() + "/criar-usuario");
			
		} catch (SQLException e) {
			session.setAttribute("erro", "Ocorreu um problema");
			response.sendRedirect(request.getContextPath() + "/criar-usuario");
		}
	}

}
