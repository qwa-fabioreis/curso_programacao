package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		float vetor[] = new float[quantidade];
		float soma = 0.0f;
		for(int i = 0; i <= vetor.length -1; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextFloat();
			entrada.nextLine();
		}
		
		String resultado = "";
		for(int j = 0; j <= vetor.length -1; j++) {
			soma += vetor[j];
			resultado += " " + vetor[j];
		}
		
		System.out.println("VALORES = "+ resultado);
		System.out.printf("SOMA = %.2f %n",soma);
		System.out.printf("MEDIA = %.2f ",soma/quantidade);
		entrada.close();

	}

}
