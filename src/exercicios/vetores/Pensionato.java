package exercicios.vetores;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de estudantes:");
		int quantidade = entrada.nextInt();
		
		String vetorQuarto[] = new String[10];
		
		for(int i = 0; i < quantidade; i++) {
			String dados = "";
			int quartoNumero;
			System.out.printf("Quarto #%d: %n",i+1);

			System.out.print("Nome:");
			dados += entrada.next() + ", ";
			
			System.out.print("Email:");
			dados += entrada.next();

			System.out.print("Quarto:");
			quartoNumero = entrada.nextInt();
			
			vetorQuarto[quartoNumero] = dados;
		}
		
		System.out.println("Ocupação dos quartos:");
		for(int i = 0; i < vetorQuarto.length -1; i++) {
			if(vetorQuarto[i] != null) {
				System.out.printf("%d: %s %n",i,vetorQuarto[i]);
			}
		}
		entrada.close();

	}

}
