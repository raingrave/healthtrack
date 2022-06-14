package br.fiap.healthtrack.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import br.fiap.healthtrack.database.OracleDatabaseConnection;
import br.fiap.healthtrack.entidades.Usuario;

public class UsuarioDAO {
	private Connection conexao;
	
	public UsuarioDAO() throws SQLException {
		this.conexao = new OracleDatabaseConnection().getConnection();
	}
	
	public void create(Usuario usuario) {
		
		try {
			PreparedStatement statement = this.conexao.prepareStatement("INSERT INTO usuario(genero, nome, email, ) VALUES (?, ?, ?, ?, ?, ?, ?)");
			statement.setString(1, usuario.getGenero());
			statement.setString(2, usuario.getNome());
			statement.setString(3, usuario.getEmail());
			statement.setString(4, usuario.getSenha());
			statement.setDouble(5, usuario.getPeso());
			statement.setDouble(4, usuario.getAltura());
			statement.setObject(6, OffsetDateTime.now(ZoneOffset.UTC));
			
			statement.execute();
			
		} catch (SQLException e) {
			System.out.println("Falha ao criar registro no banco de dados");
			e.printStackTrace();
		}
	}
}
