package exercicios.vetores;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		int vetor[] = new int[quantidade];
		if(quantidade <= 10) {

			for(int i = 0; i <= vetor.length -1; i++) {
				System.out.print("Digite um numero: ");
				vetor[i] = entrada.nextInt();
				entrada.nextLine();
			}
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int j = 0; j <= vetor.length -1; j++) {
			if(vetor[j] < 0) {
				System.out.println(vetor[j]);
			}
		}
		
		entrada.close();
	}

}
