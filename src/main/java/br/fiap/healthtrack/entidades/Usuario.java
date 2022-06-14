package br.fiap.healthtrack.entidades;

import java.time.OffsetDateTime;

public class Usuario {
	private int codUsuario;
	private String genero;
	private String nome;
	private String email;
	private int idade;
	private String senha;
	private Double peso;
	private Double altura;
	private OffsetDateTime dataCriacao;
	
	/**
	 * @param id
	 * @param nome
	 * @param genero
	 * @param email
	 * @param senha
	 * @param peso
	 * @param altura
	 */
	public Usuario(int codUsuario,  String genero, String nome, String email, int idade, String senha, Double peso, Double altura, OffsetDateTime dataCriacao) {
		super();
		this.codUsuario = codUsuario;
		this.genero = genero;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
		this.peso = peso;
		this.altura = altura;
		this.dataCriacao = dataCriacao;
	}
	
	/**
	 * @param id
	 * @param nome
	 * @param genero
	 * @param email
	 * @param senha
	 * @param peso
	 * @param altura
	 */
	public Usuario(String genero, String nome, String email, int idade, String senha, Double peso, Double altura) {
		super();
		this.genero = genero;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return the id
	 */
	public int getCodUsuario() {
		return codUsuario;
	}

	/**
	 * @param id the id to set
	 */
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public Double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	/**
	 * @return the dataCriacao
	 */
	public OffsetDateTime getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(OffsetDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", genero=" + genero + ", nome=" + nome + ", email=" + email
				+ ", senha=" + senha + ", peso=" + peso + ", altura=" + altura + ", dataCriacao=" + dataCriacao + "]";
	}
}
