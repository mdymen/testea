package com.examplet.entidades;

public class LutaTO {

	private String lutador1;
	private String lutador2;
	private int luta;
	
	public LutaTO() {}
	
	public LutaTO(String lutador1, String lutador2, int luta) {
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
		this.luta = luta;
	}
	
	public String getLutador1() {
		return lutador1;
	}
	public void setLutador1(String lutador1) {
		this.lutador1 = lutador1;
	}
	public String getLutador2() {
		return lutador2;
	}
	public void setLutador2(String lutador2) {
		this.lutador2 = lutador2;
	}
	public int getLuta() {
		return luta;
	}
	public void setLuta(int luta) {
		this.luta = luta;
	}
	
	@Override
	public String toString() {
		return this.lutador1 + " vs. " + this.lutador2;
	}
	
	
}
