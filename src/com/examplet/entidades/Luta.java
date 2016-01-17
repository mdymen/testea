package com.examplet.entidades;

import java.util.Date;
import java.util.List;

public class Luta {

	private Lutador lutador1;
	private Lutador lutador2;
	private Date data;
	private boolean foi;
	private List<String> comentarios;
	
	public Lutador getLutador1() {
		return lutador1;
	}
	public void setLutador1(Lutador lutador1) {
		this.lutador1 = lutador1;
	}
	public Lutador getLutador2() {
		return lutador2;
	}
	public void setLutador2(Lutador lutador2) {
		this.lutador2 = lutador2;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public boolean isFoi() {
		return foi;
	}
	public void setFoi(boolean foi) {
		this.foi = foi;
	}

	public List<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
