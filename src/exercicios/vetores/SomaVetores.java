package exercicios.vetores;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor?");
		int quantidade = entrada.nextInt();
		
		int vetorA[] = new int[quantidade];
		int vetorB[] = new int[quantidade];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i <= vetorA.length-1; i++) {
			vetorA[i] = entrada.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i <= vetorB.length-1; i++) {
			vetorB[i] = entrada.nextInt();
		}
		
		int vetorC[] = new int[quantidade];
		for(int a = 0; a <= vetorA.length-1; a++) {
			for(int b = 0; b <= vetorB.length-1; b++) {
				if(a == b) {
					int soma = vetorA[a] + vetorB[b];
					vetorC[a] = soma;
				}
			}
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int c = 0; c <= vetorC.length-1; c++) {
			System.out.println(vetorC[c]);
		}
		entrada.close();

	}

}
