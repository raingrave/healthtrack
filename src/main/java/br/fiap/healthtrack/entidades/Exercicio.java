package br.fiap.healthtrack.entidades;

import java.time.OffsetDateTime;

public class Exercicio {
	private int codExercicio;
	private String nome;
	private Double gastoCalorico;
	private OffsetDateTime dataCriacao;
	private int codUsuario;
	/**
	 * @param codExercicio
	 * @param nome
	 * @param gastoCalorico
	 * @param dataCriacao
	 * @param codUsuario
	 */
	public Exercicio(int codExercicio, String nome, Double gastoCalorico, OffsetDateTime dataCriacao, int codUsuario) {
		super();
		this.codExercicio = codExercicio;
		this.nome = nome;
		this.gastoCalorico = gastoCalorico;
		this.dataCriacao = dataCriacao;
		this.codUsuario = codUsuario;
	}
	/**
	 * @return the codExercicio
	 */
	public int getCodExercicio() {
		return codExercicio;
	}
	/**
	 * @param codExercicio the codExercicio to set
	 */
	public void setCodExercicio(int codExercicio) {
		this.codExercicio = codExercicio;
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
	 * @return the gastoCalorico
	 */
	public Double getGastoCalorico() {
		return gastoCalorico;
	}
	/**
	 * @param gastoCalorico the gastoCalorico to set
	 */
	public void setGastoCalorico(Double gastoCalorico) {
		this.gastoCalorico = gastoCalorico;
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
	/**
	 * @return the codUsuario
	 */
	public int getCodUsuario() {
		return codUsuario;
	}
	/**
	 * @param codUsuario the codUsuario to set
	 */
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	
}
