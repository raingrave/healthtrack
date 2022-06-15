package br.fiap.healthtrack.daos;

import java.sql.Connection;

public class AlimentacaoDAO {
	private Connection conexao;
	
	public AlimentacaoDAO() throws SQLException {
		this.conexao = new OracleDatabaseConnection().getConnection();
	}
	
	public void create(Alimentacao alimentacao) {
		
		try {
			PreparedStatement statement = this.conexao.prepareStatement("INSERT INTO alimentacao(refeicao, caloria) VALUES (?, ?, ?, ?, ?)");
			statement.setString(1, alimentacao.getCodAlimentacao());
			statement.setString(2, alimentacao.getRefeicao());
			statement.setString(3, alimentacao.getCaloria());
			statement.setString(4, alimentacao.getCodUsuario());
			statement.setObject(6, OffsetDateTime.now(ZoneOffset.UTC));
			
			statement.execute();
			
		} catch (SQLException e) {
			System.out.println("Falha ao criar registro no banco de dados");
			e.printStackTrace();
		}
	}
}
	
	
