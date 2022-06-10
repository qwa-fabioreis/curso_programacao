package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numeroFuncionario = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		double valorHora = entrada.nextDouble();
		double total = horasTrabalhadas*valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f",total);
		
		entrada.close();
	}

}
