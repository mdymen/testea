package com.examplet.entidades;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("serial")
public class Lutador implements Serializable {
	
	public Lutador(String json) {
    	JSONObject obj = null;
    	try {
			obj = new JSONObject(json);
	    	this.id = obj.getLong("ID_ID_LUT");
	    	this.nome = obj.getString("ST_NOME_LUT");
	    	this.ganhadas = obj.getInt("VL_GANHADAS_LUT");
	    	this.perdidas = obj.getInt("VL_PERDIDAS_LUT");
	    	this.empatadas = obj.getInt("VL_EMPATADAS_LUT");
	    	this.kos = obj.getInt("VL_KOS_LUT");
	    	this.boxe = obj.getInt("VL_BOXE_LUT");
	    	this.joleho = obj.getInt("VL_JOELHADA_LUT");
	    	this.cotovelo = obj.getInt("VL_COTOVELO_LUT");
	    	this.clinch = obj.getInt("VL_CLINCH_LUT");
	    	this.resistencia = obj.getInt("VL_RESISTENCIA_LUT");
	    	this.explocao = obj.getInt("VL_EXPLOCAO_LUT");
	    	this.velocidade = obj.getInt("VL_VELOCIDADE_LUT");
	    	this.estadofisico = obj.getInt("VL_ESTADOFISICO_LUT");
	    	this.chute = obj.getInt("VL_CHUTE_LUT");
	    	//falta id de academia;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGanhadas() {
		return ganhadas;
	}
	public void setGanhadas(int ganhadas) {
		this.ganhadas = ganhadas;
	}
	public int getPerdidas() {
		return perdidas;
	}
	public void setPerdidas(int perdidas) {
		this.perdidas = perdidas;
	}
	public int getEmpatadas() {
		return empatadas;
	}
	public void setEmpatadas(int empatadas) {
		this.empatadas = empatadas;
	}
	public int getKos() {
		return kos;
	}
	public void setKos(int kos) {
		this.kos = kos;
	}
	public int getBoxe() {
		return boxe;
	}
	public void setBoxe(int boxe) {
		this.boxe = boxe;
	}
	public int getJoleho() {
		return joleho;
	}
	public void setJoleho(int joleho) {
		this.joleho = joleho;
	}
	public int getCotovelo() {
		return cotovelo;
	}
	public void setCotovelo(int cotovelo) {
		this.cotovelo = cotovelo;
	}
	public int getChute() {
		return chute;
	}
	public void setChute(int chute) {
		this.chute = chute;
	}
	public int getClinch() {
		return clinch;
	}
	public void setClinch(int clinch) {
		this.clinch = clinch;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getExplocao() {
		return explocao;
	}
	public void setExplocao(int explocao) {
		this.explocao = explocao;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getEstadofisico() {
		return estadofisico;
	}
	public void setEstadofisico(int estadofisico) {
		this.estadofisico = estadofisico;
	}
	private Long id;
	private String nome;
	private int ganhadas;
	private int perdidas;
	private int empatadas;
	private int kos;
	
	private int boxe;
	private int joleho;
	private int cotovelo;
	private int chute;
	
	private int clinch;
	private int resistencia;
	private int explocao;
	private int velocidade;
	private int estadofisico;
	

}
