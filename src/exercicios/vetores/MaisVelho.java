package exercicios.vetores;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int maiorIdade = 0;
		int posicaoVetor = 0;
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		String vetorNomes[] = new String[quantidade];
		int vetorIdade[] = new int[quantidade];
			
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Nome: ");
			vetorNomes[i] = entrada.next();

			System.out.print("Idade: ");
			vetorIdade[i] = entrada.nextInt();
			if(vetorIdade[i] > maiorIdade) {
				maiorIdade = vetorIdade[i];
				posicaoVetor = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + vetorNomes[posicaoVetor]);
		
		entrada.close();

	}

}
