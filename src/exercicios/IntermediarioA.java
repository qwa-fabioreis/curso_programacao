package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IntermediarioA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int codigoPecaA = entrada.nextInt();
		int quantidadePecaA = entrada.nextInt();
		double valorPecaA = entrada.nextDouble();
		entrada.nextLine();
		int codigoPecaB = entrada.nextInt();
		int quantidadePecaB = entrada.nextInt();
		double valorPecaB = entrada.nextDouble();
		
		double subTotalPecaA = quantidadePecaA*valorPecaA;
		double subTotalPecaB = quantidadePecaB*valorPecaB;
		double total = subTotalPecaA+subTotalPecaB;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		entrada.close();
	}

}
