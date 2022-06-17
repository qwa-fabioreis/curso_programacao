package exercicios;

import java.util.Scanner;

public class IntermediarioG {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigo = 0;
		int codA = 0;
		int codG = 0 ;
		int codD = 0 ;
		
		while (codigo != 4) {
			codigo = entrada.nextInt();
			if(codigo == 1) {
				codA += 1;
			}
			if(codigo == 2) {
				codG += 1;
			}
			if(codigo == 3) {
				codD += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool :" + codA);
		System.out.println("Gasolina :" + codG);
		System.out.println("Diesel :" + codD);
		
		entrada.close();
	}

}
