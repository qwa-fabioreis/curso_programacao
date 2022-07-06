package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		float vetor[] = new float[quantidade];
		
		float maiorValor = 0.0f;
		int posicao = 0;
		for(int i = 0; i <= vetor.length -1; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextFloat();
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		System.out.println("MAIOR VALOR = " +  maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " +  posicao);
		
		entrada.close();

	}

}
