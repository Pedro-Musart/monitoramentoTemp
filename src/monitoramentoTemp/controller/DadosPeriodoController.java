package monitoramentoTemp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import monitoramentoTemp.model.DadosPeriodo;
import monitoramentoTemp.model.Dia;

public class DadosPeriodoController {

//	2) Um método que solicita ao usuário qual o período (em dias) sera mapeado
	public DadosPeriodo solicitaDias(DadosPeriodo dadosPeriodo) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Dia> dias = new ArrayList<Dia>();
		
		System.out.println("Quantos dias você quer monitorar?");
		dadosPeriodo.setQuantidadeDias(input.nextInt());
		

		for (int i = 1; i <= dadosPeriodo.getQuantidadeDias(); i++) {
			
			Dia dia = new Dia();
			dia.setNumero(i);
			dias.add(dia);
		}
		
		
		dadosPeriodo.setDias(dias);;
		
		
		
		return dadosPeriodo;
	}
	
	
//  3) Um método para mapear/coletar as temperaturas em um array
	public DadosPeriodo coletaTemperaturas(DadosPeriodo dadosPeriodo) {

		Scanner input = new Scanner(System.in);
		
		for (Dia dia : dadosPeriodo.getDias()) {
			System.out.println("Digite a temperatura do dia " + dia.getNumero());
			dia.setTemperatura(input.nextInt());
		}
		
		return dadosPeriodo;
	}
	
	
//  4) Um método para obter a maior e a menor temperatura mapeada no período
	public DadosPeriodo maiorMenorTemp(DadosPeriodo dadosPeriodo) {
		
		int maiorTemp = dadosPeriodo.getDias().get(0).getTemperatura();
		int menorTemp = dadosPeriodo.getDias().get(0).getTemperatura();
		
		for (Dia dia : dadosPeriodo.getDias()) {
			
			//maiortemp
			if (dia.getTemperatura() > maiorTemp ) {
				maiorTemp = dia.getTemperatura();
			}
			//maiortemp
			if (dia.getTemperatura() < menorTemp ) {
				menorTemp = dia.getTemperatura();
			} 
		}
		
		dadosPeriodo.setMaiorTemp(maiorTemp);
		dadosPeriodo.setMenorTemp(menorTemp);
	
		return dadosPeriodo;
	}
	
	
//  5) Um método para separar as temperaturas negativas no período mapeado
	public DadosPeriodo tempNegativas(DadosPeriodo dadosPeriodo) {
		
		ArrayList<Integer> tempsNegativas = new ArrayList<Integer>();
		
		for (Dia dia : dadosPeriodo.getDias()) {
			
			if (dia.getTemperatura() < 0 ) {
				tempsNegativas.add(dia.getTemperatura());	
			}
		}
		
		dadosPeriodo.setTempsNegativas(tempsNegativas);
		
		return dadosPeriodo;
	}
	

//  6) Um método para obter a temperatura média do periodo
	public DadosPeriodo tempMedia(DadosPeriodo dadosPeriodo) {
		
		int somaTemp = 0;
		
		for (Dia dia : dadosPeriodo.getDias()) {

			somaTemp += dia.getTemperatura();
		}
		
		dadosPeriodo.setMediaTemp(somaTemp/dadosPeriodo.getQuantidadeDias());;
		
		return dadosPeriodo;
	}

		
//	7) Um método para imprimir
	public void imprimeDados(DadosPeriodo dadosPeriodo) {
		
		System.out.println("Maior temperatura: "  + dadosPeriodo.getMaiorTemp());
		System.out.println("Menor temperatura: "  + dadosPeriodo.getMenorTemp());
		System.out.println("Temperaturas negativas: "  + dadosPeriodo.getTempsNegativas());
		System.out.println("Media de temperatura do periodo: " + dadosPeriodo.getMediaTemp());
		System.out.println("Quantidade de dias com temperatura Positiva: " + dadosPeriodo.getQuantidadeDiasPositivos());
	}
	
	
//	8) Um método para obter a quantidade de dias que tiveram temperatura positiva
	public DadosPeriodo qtdDiasPositivos(DadosPeriodo dadosPeriodo) {
		
		int qtdPositivos = 0;
		
		for (Dia dia : dadosPeriodo.getDias()) {
			
			if (dia.getTemperatura() > 0) {
				qtdPositivos++;
			}
		}
		
		dadosPeriodo.setQuantidadeDiasPositivos(qtdPositivos);
		
		return dadosPeriodo;
	}
}
