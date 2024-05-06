package monitoramentoTemp.model;

import java.util.ArrayList;

public class DadosPeriodo {

	private ArrayList<Dia> dias;
	private int quantidadeDias;
	private int maiorTemp;
	private int menorTemp;
	private int mediaTemp;
	private ArrayList<Integer> tempsNegativas;
	private int quantidadeDiasPositivos;
	
	
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}
	public ArrayList<Dia> getDias() {
		return dias;
	}
	public void setDias(ArrayList<Dia> dias) {
		this.dias = dias;
	}
	public int getMaiorTemp() {
		return maiorTemp;
	}
	public void setMaiorTemp(int maiorTemp) {
		this.maiorTemp = maiorTemp;
	}
	public int getMenorTemp() {
		return menorTemp;
	}
	public void setMenorTemp(int menorTemp) {
		this.menorTemp = menorTemp;
	}
	public int getMediaTemp() {
		return mediaTemp;
	}
	public void setMediaTemp(int mediatemp) {
		this.mediaTemp = mediatemp;
	}
	public ArrayList<Integer> getTempsNegativas() {
		return tempsNegativas;
	}
	public void setTempsNegativas(ArrayList<Integer> tempsNegativas) {
		this.tempsNegativas = tempsNegativas;
	}
	public int getQuantidadeDiasPositivos() {
		return quantidadeDiasPositivos;
	}
	public void setQuantidadeDiasPositivos(int quantidadeDiasPositivos) {
		this.quantidadeDiasPositivos = quantidadeDiasPositivos;
	}
	
	
	
	
	
	
}
