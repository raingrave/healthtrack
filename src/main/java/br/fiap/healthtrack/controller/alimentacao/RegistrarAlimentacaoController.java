package br.fiap.healthtrack.controller.alimentacao;

import java.io.IOException;

import br.fiap.healthtrack.daos.AlimentacaoDAO;
import br.fiap.healthtrack.entidades.Alimentacao;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/registrar-alimentacao")
public class RegistrarAlimentacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarAlimentacaoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String refeicao = (String) request.getParameter("refeicao");
		Double caloria = (Double) request.getParameter("caloria");
				
		HttpSession session = request.getSession();
		
		Alimentacao alimentacao = new Alimentacao(refeicao,caloria);
		
		AlimentacaoDAO alimentacaoDAO;
		try {
			alimentacaoDAO = new AlimentacaoDAO();
			
			alimentacaoDAO.create(alimentacao);
			
			//response.getWriter().append("Alimentacao" + alimentacao.toString());
			
			session.setAttribute("sucesso", "Operação realizada com sucesso!");
			
			response.sendRedirect(request.getContextPath() + "/criar-alimentacao");
			
		} catch (SQLException e) {
			session.setAttribute("erro", "Ocorreu um problema");
			response.sendRedirect(request.getContextPath() + "/criar-alimentacao");
		}
	}

}

