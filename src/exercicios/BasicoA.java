package exercicios;

import java.util.Scanner;

public class BasicoA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroA, numeroB;
		
		numeroA = entrada.nextInt();
		numeroB = entrada.nextInt();
		
		System.out.println("SOMA = " + (numeroA+numeroB));
		entrada.close();
	}

}
