package br.fiap.healthtrack.controllers.usuario;

import java.io.IOException;

/**
 * Servlet implementation class CriarUsuarioController
 */
@WebServlet("/criar-exercicio")
public class CriarExercicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarExercicioController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/exercicio/create.jsp").forward(request, response);
	}
}
