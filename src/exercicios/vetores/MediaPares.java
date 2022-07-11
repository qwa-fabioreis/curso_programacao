package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		int vetor[] =  new int[quantidade];
		int numerosPares = 0;
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextInt();
			if(vetor[i] % 2 == 0) {
				numerosPares++ ;
			}
		}
		
		if(numerosPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			float soma = 0;
			for(int j = 0; j < quantidade; j++) {
				if(vetor[j] % 2 == 0) {
					soma += vetor[j];
				}
			}
			System.out.printf("MEDIA DOS PARES = %.1f", soma / numerosPares);
		}
		entrada.close();

	}

}
