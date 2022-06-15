package br.fiap.healthtrack.entidades;

import java.time.OffsetDateTime;

public class Alimentacao {
	private int codAlimentacao;
	private String refeicao;
	private Double caloria;
	private OffsetDateTime dataCriacao;
	private int codUsuario;
	
	
	/**
	 * @param codAlimentacao
	 * @param refeicao
	 * @param caloria
	 * @param dataCriacao
	 * @param codUsuario
	 */
	public Alimentacao(int codAlimentacao, String refeicao, Double caloria, OffsetDateTime dataCriacao,
			int codUsuario) {
		super();
		this.codAlimentacao = codAlimentacao;
		this.refeicao = refeicao;
		this.caloria = caloria;
		this.dataCriacao = dataCriacao;
		this.codUsuario = codUsuario;
	}


	/**
	 * @return the codAlimentacao
	 */
	public int getCodAlimentacao() {
		return codAlimentacao;
	}


	/**
	 * @param codAlimentacao the codAlimentacao to set
	 */
	public void setCodAlimentacao(int codAlimentacao) {
		this.codAlimentacao = codAlimentacao;
	}


	/**
	 * @return the refeicao
	 */
	public String getRefeicao() {
		return refeicao;
	}


	/**
	 * @param refeicao the refeicao to set
	 */
	public void setRefeicao(String refeicao) {
		this.refeicao = refeicao;
	}


	/**
	 * @return the caloria
	 */
	public Double getCaloria() {
		return caloria;
	}


	/**
	 * @param caloria the caloria to set
	 */
	public void setCaloria(Double caloria) {
		this.caloria = caloria;
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