package br.edu.univas.questao2;

public class StartApp {
  
	public static void main(String[] args) {
	  Ponto ponto = new Ponto();
	  Retangulo retangulo = new Retangulo();
  
  
	  ponto.x = 2;
	  ponto.y = 9;
	  
	  retangulo.inicio.x = 1;
	  retangulo.fim.x = 5;
	  
	  retangulo.inicio.y = 3;
	  retangulo.fim.y = 7;
	  
	  
	  
	  	if (estaDentro(retangulo, ponto)) {
	  		System.out.println("Está dentro");
	  	}
	  	
	  	else {
	  		System.out.println("Está fora");
	  	}
	
  }	
	public static boolean estaDentro(Retangulo retangulo, Ponto ponto) {
		
		if (retangulo.inicio.x <= ponto.x && retangulo.fim.x >= ponto.x && retangulo.inicio.y <= ponto.y && retangulo.fim.y >= ponto.y ) {
			
			return true;
			
			
		}
		
	
		
		return false;
		
	}
}
