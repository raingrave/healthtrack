package br.fiap.healthtrack.daos;

import java.sql.Connection;

public class ExercicioDAO {
	private Connection conexao;
	
	public ExercicioDAO() throws SQLException {
		this.conexao = new OracleDatabaseConnection().getConnection();
	}
	
	public void create(Exercicio exercicio) {
		
		try {
			PreparedStatement statement = this.conexao.prepareStatement("INSERT INTO exercicio(nome, gastoCalorico) VALUES (?, ?, ?, ?, ?)");
			statement.setString(1, alimentacao.getCodExercicio());
			statement.setString(2, alimentacao.getNome());
			statement.setString(3, alimentacao.getGastoCalorico());
			statement.setString(4, alimentacao.getCodUsuario());
			statement.setObject(6, OffsetDateTime.now(ZoneOffset.UTC));
			
			statement.execute();
			
		} catch (SQLException e) {
			System.out.println("Falha ao criar registro no banco de dados");
			e.printStackTrace();
		}
	}
}
	