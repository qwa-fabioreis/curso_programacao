package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int quantidade = entrada.nextInt();
		
		float vetorAltura[] = new float[quantidade];
		char vetorGenero[] = new char[quantidade];
		float menorAltura = 4.00f;
		float maiorAltura = 0.00f;
		float somaAlturaMulher = 0.0f;
		int quantidadeHomem = 0;
		int quantidadeMulher = 0;
		
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			vetorAltura[i] = entrada.nextFloat();
			System.out.printf("Genero da %ca pessoa:", i+1);
			vetorGenero[i] = entrada.next().charAt(0);
			
			if(vetorAltura[i] > maiorAltura) {
				maiorAltura = vetorAltura[i];
			}
			if(vetorAltura[i] < menorAltura) {
				menorAltura = vetorAltura[i];
			}
			if(vetorGenero[i] == 'f' || vetorGenero[i] == 'F') {
				quantidadeMulher++ ;
				somaAlturaMulher += vetorAltura[i] ;
			}
			if(vetorGenero[i] == 'm' || vetorGenero[i] == 'M') {
				quantidadeHomem++ ;
			}
		}
		
		System.out.printf("Menor altura = %.2f %n",menorAltura);
		System.out.printf("Maior altura = %.2f %n",maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f %n",somaAlturaMulher/quantidadeMulher);
		System.out.printf("Numero de homens = %d",quantidadeHomem);
		entrada.close();

	}

}
