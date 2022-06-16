package br.fiap.healthtrack.controllers.usuario;

import java.io.IOException;

/**
 * Servlet implementation class CriarAlimentacaoController
 */
@WebServlet("/criar-alimentacao")
public class CriarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarAlimentacaoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/alimentacao/create.jsp").forward(request, response);
	}
}
