package exercicios.vetores;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		int vetor[] = new int[quantidade];
		for(int i = 0; i <= vetor.length-1; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextInt();
			entrada.nextLine();
		}
		
		System.out.println("NUMEROS PARES:");
		int quantidadePares = 0;
		for(int i = 0; i <= vetor.length-1; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				quantidadePares++ ;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidadePares);
		
		entrada.close();

	}

}
