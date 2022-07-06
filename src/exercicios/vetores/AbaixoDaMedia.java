package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?");
		int quantidade = entrada.nextInt();
		float vetor[] = new float[quantidade];
		
		float media = 0.0f;
		for(int i = 0; i <= vetor.length-1; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextFloat();
			entrada.nextLine();
			media += vetor[i];
		}
		
		media /= quantidade;
		System.out.printf("MEDIA DO VETOR = %.3f",media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i <= vetor.length-1; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		entrada.close();

	}

}
