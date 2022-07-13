package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados?");
		int quantidade = entrada.nextInt();
		
		String vetorNome[] = new String[quantidade];
		float vetorNotaA[] = new float[quantidade];
		float vetorNotaB[] = new float[quantidade];
		String alunosAprovados = "";
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
			vetorNome[i] = entrada.next();
			vetorNotaA[i] = entrada.nextFloat();
			vetorNotaB[i] = entrada.nextFloat();
			if((vetorNotaA[i] + vetorNotaB[i]) / 2 >= 6.0) { 
				alunosAprovados += vetorNome[i] + "\n";
			}
		}
		System.out.println("Alunos aprovados:");
		System.out.println(alunosAprovados);
		entrada.close();

	}

}
