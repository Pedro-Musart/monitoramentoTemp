package monitoramentoTemp;

import monitoramentoTemp.controller.DadosPeriodoController;
import monitoramentoTemp.model.DadosPeriodo;


// 9) uma classe de teste contendo o método main para testar o programa.
public class Teste {

    public static void main(String[] args) {
    	
    	DadosPeriodo dadosPeriodo = new DadosPeriodo();
       
    	DadosPeriodoController dadosPeriodoController = new DadosPeriodoController();
    	
    	dadosPeriodoController.solicitaDias(dadosPeriodo);
    	dadosPeriodoController.coletaTemperaturas(dadosPeriodo);
    	dadosPeriodoController.maiorMenorTemp(dadosPeriodo);
    	dadosPeriodoController.tempNegativas(dadosPeriodo);
    	dadosPeriodoController.tempMedia(dadosPeriodo);
    	dadosPeriodoController.qtdDiasPositivos(dadosPeriodo);
    	
    	
    	dadosPeriodoController.imprimeDados(dadosPeriodo);
    	
    	
    }
	
}
