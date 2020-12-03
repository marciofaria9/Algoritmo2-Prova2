package br.edu.univas.questao1;

public class StartApp {
	public static void main(String[] args) {
		Data data = new Data();
		Periodo periodo = new Periodo();
		
		data.dia = 2;
		data.mes = 12;
		data.ano = 2020;
		
		periodo.inicio.dia = 2;
		periodo.inicio.mes = 5;
		periodo.inicio.ano = 2012;
	
		periodo.fim.dia = 3;
		periodo.fim.mes = 11;
		periodo.fim.ano = 2020;
		
		 if (estaDentro(periodo, data)) {
			 System.out.println("Está dentro");
			 
		 }
		 else {
			 System.out.println("Está fora");
		 }
		
	}
	
	public static boolean estaDentro(Periodo periodo, Data data) {
		
		if (periodo.inicio.ano < data.ano && periodo.fim.ano > data.ano ) {
			
			return true;					
		}
		
		else if (periodo.inicio.ano == data.ano || periodo.fim.ano == data.ano) {
			if (periodo.inicio.mes < data.mes && periodo.fim.mes > data.mes) {
				return true; 
									
			}
			else if (periodo.inicio.mes == data.mes || periodo.fim.mes == data.mes) {
			 if (periodo.inicio.dia <= data.dia && periodo.fim.dia >= data.dia) {
				return true;
			 }
			}
		}
		
				
	return false;	
		
	}
}
