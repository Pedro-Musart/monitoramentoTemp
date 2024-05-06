package monitoramentoTemp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class DadosPeriodo {

	private Dia[] dias;
	private int quantidadeDias;
	private int maiorTemp;
	private int menorTemp;
	private int mediaTemp;
	private int[] tempsNegativas;
	private int quantidadeDiasPositivos;
	
	//1) Construtor que recebe o tamanho do vetor
    public Dia[] construtorDias(int tamanhoDia) {
        Dia[] dias = new Dia[tamanhoDia];
        return dias;
    }
	//1) Construtor que recebe o tamanho do vetor
    public int[] construtorTempsNegativas(int tamanhoTemps) {
        int[] tempsNegativas= new int[tamanhoTemps];
        return tempsNegativas;
    }
	
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}
	public Dia[] getDias() {
		return dias;
	}
	public void setDias(Dia[] dias) {
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
	
	public int[] getTempsNegativas() {
		return tempsNegativas;
	}
	
	public String tempsNegativasToString() {
		return Arrays.toString(tempsNegativas);
	}
	
	public void setTempsNegativas(int[] tempsNegativas) {
		this.tempsNegativas = tempsNegativas;
	}
	public int getQuantidadeDiasPositivos() {
		return quantidadeDiasPositivos;
	}
	public void setQuantidadeDiasPositivos(int quantidadeDiasPositivos) {
		this.quantidadeDiasPositivos = quantidadeDiasPositivos;
	}

	
	
	
	
	
	
	
	
}
