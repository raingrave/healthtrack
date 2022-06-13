package br.fiap.healthtrack.daos;

import java.sql.Connection;
import java.sql.SQLException;

import br.fiap.healthtrack.database.OracleDatabaseConnection;
import br.fiap.healthtrack.entidades.Usuario;

public class UsuarioDAO {
	private Connection conexao;
	
	public UsuarioDAO() throws SQLException {
		this.conexao = new OracleDatabaseConnection().getConnection();
	}
	
	public void create(Usuario usuario) {
		
	}
}
