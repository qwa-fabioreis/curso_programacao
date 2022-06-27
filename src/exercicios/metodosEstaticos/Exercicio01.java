package exercicios.metodosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import exercicios.metodosEstaticos.util.ConversaoDollar;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a cotação do dollar: ");
		double cotacao = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Entre com o valor a ser comprado em dollar: ");
		double valorDollar = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.printf("O valor a ser pago em reais é: %.2f",ConversaoDollar.conversaoMoedas(cotacao, valorDollar) );
		
		
		entrada.close();

	}

}
