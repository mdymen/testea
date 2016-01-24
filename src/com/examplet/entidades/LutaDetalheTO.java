package com.examplet.entidades;

import java.util.Date;

import org.json.JSONObject;

public class LutaDetalheTO {

	private Long luta_id;
	private String data;
	private String resultado;
	private Long lut1_id;
	private String lut1_nome;
	private int lut1_ganhadas;
	private int lut1_perdidas;
	private int lut1_empatadas;
	private int lut1_kos;
	
	private int lut1_boxe;
	private int lut1_joleho;
	private int lut1_cotovelo;
	private int lut1_chute;
	
	private int lut1_clinch;
	private int lut1_resistencia;
	private int lut1_explocao;
	private int lut1_velocidade;
	private int lut1_estadofisico;
	
	private Long lut2_id;
	private String lut2_nome;
	private int lut2_ganhadas;
	private int lut2_perdidas;
	private int lut2_empatadas;
	private int lut2_kos;
	
	private int lut2_boxe;
	private int lut2_joleho;
	private int lut2_cotovelo;
	private int lut2_chute;
	
	private int lut2_clinch;
	private int lut2_resistencia;
	private int lut2_explocao;
	private int lut2_velocidade;
	private int lut2_estadofisico;
	
	public LutaDetalheTO(JSONObject luta) {
		try {
			lut2_id = luta.getLong("lu2Luta");
			lut2_nome = luta.getString("lu2Nome");
			lut2_ganhadas = luta.getInt("lu2Ganhadas");
			lut2_perdidas = luta.getInt("lu2Perdidas");
			lut2_empatadas = luta.getInt("lu2Empatadas");
			lut2_kos = luta.getInt("lu2Kos");
			
			lut2_boxe = luta.getInt("lu2Boxe");
			lut2_joleho = luta.getInt("lu2Joelhada");
			lut2_cotovelo = luta.getInt("lu2Cotovelo");
			lut2_chute = luta.getInt("lu2Chute");
			
			lut2_clinch = luta.getInt("lu2Clinch");
			lut2_resistencia = luta.getInt("lu2Resistencia");
			lut2_explocao = luta.getInt("lu2Explocao");
			lut2_velocidade = luta.getInt("lu2Velocidade");
			lut2_estadofisico = luta.getInt("lu2EstadoFisico");
			
			luta_id = luta.getLong("lu1Luta");
			data = luta.getString("DT_DATA_LUTA");
			resultado = luta.getString("ST_RESULTADO_LUTA");
			lut1_id = luta.getLong("lu1Luta");
			lut1_nome = luta.getString("lu1Nome");
			lut1_ganhadas = luta.getInt("lu1Ganhadas");
			lut1_perdidas = luta.getInt("lu1Perdidas");
			lut1_empatadas = luta.getInt("lu1Empatadas");
			lut1_kos = luta.getInt("lu1Kos");
			
			lut1_boxe = luta.getInt("lu1Boxe");
			lut1_joleho = luta.getInt("lu1Joelhada");
			lut1_cotovelo = luta.getInt("lu1Cotovelo");
			lut1_chute = luta.getInt("lu1Chute");
			
			lut1_clinch = luta.getInt("lu1Clinch");
			lut1_resistencia = luta.getInt("lu1Resistencia");
			lut1_explocao = luta.getInt("lu1Explocao");
			lut1_velocidade = luta.getInt("lu1Velocidade");
			lut1_estadofisico = luta.getInt("lu1EstadoFisico");
		}
		catch (Exception e) {
			
		}
	}
	
	public Long getLuta_id() {
		return luta_id;
	}
	public void setLuta_id(Long luta_id) {
		this.luta_id = luta_id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Long getLut1_id() {
		return lut1_id;
	}
	public void setLut1_id(Long lut1_id) {
		this.lut1_id = lut1_id;
	}
	public String getLut1_nome() {
		return lut1_nome;
	}
	public void setLut1_nome(String lut1_nome) {
		this.lut1_nome = lut1_nome;
	}
	public int getLut1_ganhadas() {
		return lut1_ganhadas;
	}
	public void setLut1_ganhadas(int lut1_ganhadas) {
		this.lut1_ganhadas = lut1_ganhadas;
	}
	public int getLut1_perdidas() {
		return lut1_perdidas;
	}
	public void setLut1_perdidas(int lut1_perdidas) {
		this.lut1_perdidas = lut1_perdidas;
	}
	public int getLut1_empatadas() {
		return lut1_empatadas;
	}
	public void setLut1_empatadas(int lut1_empatadas) {
		this.lut1_empatadas = lut1_empatadas;
	}
	public int getLut1_kos() {
		return lut1_kos;
	}
	public void setLut1_kos(int lut1_kos) {
		this.lut1_kos = lut1_kos;
	}
	public int getLut1_boxe() {
		return lut1_boxe;
	}
	public void setLut1_boxe(int lut1_boxe) {
		this.lut1_boxe = lut1_boxe;
	}
	public int getLut1_joleho() {
		return lut1_joleho;
	}
	public void setLut1_joleho(int lut1_joleho) {
		this.lut1_joleho = lut1_joleho;
	}
	public int getLut1_cotovelo() {
		return lut1_cotovelo;
	}
	public void setLut1_cotovelo(int lut1_cotovelo) {
		this.lut1_cotovelo = lut1_cotovelo;
	}
	public int getLut1_chute() {
		return lut1_chute;
	}
	public void setLut1_chute(int lut1_chute) {
		this.lut1_chute = lut1_chute;
	}
	public int getLut1_clinch() {
		return lut1_clinch;
	}
	public void setLut1_clinch(int lut1_clinch) {
		this.lut1_clinch = lut1_clinch;
	}
	public int getLut1_resistencia() {
		return lut1_resistencia;
	}
	public void setLut1_resistencia(int lut1_resistencia) {
		this.lut1_resistencia = lut1_resistencia;
	}
	public int getLut1_explocao() {
		return lut1_explocao;
	}
	public void setLut1_explocao(int lut1_explocao) {
		this.lut1_explocao = lut1_explocao;
	}
	public int getLut1_velocidade() {
		return lut1_velocidade;
	}
	public void setLut1_velocidade(int lut1_velocidade) {
		this.lut1_velocidade = lut1_velocidade;
	}
	public int getLut1_estadofisico() {
		return lut1_estadofisico;
	}
	public void setLut1_estadofisico(int lut1_estadofisico) {
		this.lut1_estadofisico = lut1_estadofisico;
	}
	public Long getLut2_id() {
		return lut2_id;
	}
	public void setLut2_id(Long lut2_id) {
		this.lut2_id = lut2_id;
	}
	public String getLut2_nome() {
		return lut2_nome;
	}
	public void setLut2_nome(String lut2_nome) {
		this.lut2_nome = lut2_nome;
	}
	public int getLut2_ganhadas() {
		return lut2_ganhadas;
	}
	public void setLut2_ganhadas(int lut2_ganhadas) {
		this.lut2_ganhadas = lut2_ganhadas;
	}
	public int getLut2_perdidas() {
		return lut2_perdidas;
	}
	public void setLut2_perdidas(int lut2_perdidas) {
		this.lut2_perdidas = lut2_perdidas;
	}
	public int getLut2_empatadas() {
		return lut2_empatadas;
	}
	public void setLut2_empatadas(int lut2_empatadas) {
		this.lut2_empatadas = lut2_empatadas;
	}
	public int getLut2_kos() {
		return lut2_kos;
	}
	public void setLut2_kos(int lut2_kos) {
		this.lut2_kos = lut2_kos;
	}
	public int getLut2_boxe() {
		return lut2_boxe;
	}
	public void setLut2_boxe(int lut2_boxe) {
		this.lut2_boxe = lut2_boxe;
	}
	public int getLut2_joleho() {
		return lut2_joleho;
	}
	public void setLut2_joleho(int lut2_joleho) {
		this.lut2_joleho = lut2_joleho;
	}
	public int getLut2_cotovelo() {
		return lut2_cotovelo;
	}
	public void setLut2_cotovelo(int lut2_cotovelo) {
		this.lut2_cotovelo = lut2_cotovelo;
	}
	public int getLut2_chute() {
		return lut2_chute;
	}
	public void setLut2_chute(int lut2_chute) {
		this.lut2_chute = lut2_chute;
	}
	public int getLut2_clinch() {
		return lut2_clinch;
	}
	public void setLut2_clinch(int lut2_clinch) {
		this.lut2_clinch = lut2_clinch;
	}
	public int getLut2_resistencia() {
		return lut2_resistencia;
	}
	public void setLut2_resistencia(int lut2_resistencia) {
		this.lut2_resistencia = lut2_resistencia;
	}
	public int getLut2_explocao() {
		return lut2_explocao;
	}
	public void setLut2_explocao(int lut2_explocao) {
		this.lut2_explocao = lut2_explocao;
	}
	public int getLut2_velocidade() {
		return lut2_velocidade;
	}
	public void setLut2_velocidade(int lut2_velocidade) {
		this.lut2_velocidade = lut2_velocidade;
	}
	public int getLut2_estadofisico() {
		return lut2_estadofisico;
	}
	public void setLut2_estadofisico(int lut2_estadofisico) {
		this.lut2_estadofisico = lut2_estadofisico;
	}
}
