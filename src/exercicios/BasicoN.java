package exercicios;

import java.util.Scanner;

public class BasicoN {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroLinhas = entrada.nextInt();
		
		for(int i = 1; i <= numeroLinhas; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d %n",i,quadrado,cubo);
		}
		
		entrada.close();
	}

}
