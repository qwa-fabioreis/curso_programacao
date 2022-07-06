package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		String vetorNome[] = new String[quantidade];
		int vetorIdade[] = new int[quantidade];
		float vetorAltura[] = new float[quantidade];
		
		float somaAltura = 0.0f;
		int pessoaMenor16 = 0;
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Dados da %da pessoa: %n",i+1);
			
			System.out.print("Nome:");
			vetorNome[i] = entrada.next();
			entrada.nextLine();
			
			System.out.print("Idade:");
			vetorIdade[i] = entrada.nextInt();
			entrada.nextLine();
			if(vetorIdade[i] < 16) {
				pessoaMenor16++;
			}
			
			System.out.print("Altura:");
			vetorAltura[i] = entrada.nextFloat();
			entrada.nextLine();
			somaAltura += vetorAltura[i];
		}
		
		float media = pessoaMenor16*100/quantidade;
		
		System.out.printf("Altura média: %.2f %n",somaAltura/quantidade);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n",media);
		
		for(int i = 0; i < quantidade; i++) {
			if(vetorIdade[i] < 16) {
				System.out.println(vetorNome[i]);
			}
		}
		entrada.close();
	}

}
