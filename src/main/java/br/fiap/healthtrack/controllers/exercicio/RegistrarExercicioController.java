package br.fiap.healthtrack.controllers.usuario;

import java.io.IOException;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/registrar-exercicio")
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
		
		String nome = (String) request.getParameter("nome do exercicio");
		String gastoCalorico = (String) request.getParameter("gastoCalorico");
				
		HttpSession session = request.getSession();
		
		Exercicio exercicio = new Exercicio(nome, gastoCalorico);
		
		ExercicioDAO exercicioDAO;
		try {
			exercicioDAO = new exercicioDAO();
			
			exercicioDAO.create(exercicio);
			
			//response.getWriter().append("Exercicio" + exercicio.toString());
			
			session.setAttribute("sucesso", "Operação realizada com sucesso!");
			
			response.sendRedirect(request.getContextPath() + "/criar-usuario");
			
		} catch (SQLException e) {
			session.setAttribute("erro", "Ocorreu um problema");
			response.sendRedirect(request.getContextPath() + "/criar-exercicio");
		}
	}

}
