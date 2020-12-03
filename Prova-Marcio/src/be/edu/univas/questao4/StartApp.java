package be.edu.univas.questao4;

import java.util.Scanner;

public class StartApp {
		public static Scanner leitura = new Scanner(System.in);
		public static void main(String[] args) {
		
      Retangulo retangulo = new Retangulo();

				
		retangulo = lerRetangulo(retangulo);
	
	
	
	
	 leitura.close();
	}
	
	public static Retangulo lerRetangulo(Retangulo retangulo) {
		System.out.println("Digite o inicio de X");
		retangulo.xIni = leitura.nextInt();
		System.out.println("Digite o fim de X");
		retangulo.xFim = leitura.nextInt();
		System.out.println("Digite o inicio de Y");
		retangulo.yIni = leitura.nextInt();
		System.out.println("Digite o fim de Y");
		retangulo.yFim = leitura.nextInt();
		
	
		
	return retangulo;	
	}

}
