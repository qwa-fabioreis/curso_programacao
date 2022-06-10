package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float numeroA = entrada.nextFloat();
		double resultado = 3.14159 * Math.pow(numeroA, 2);
		System.out.printf("A=%.4f %n",resultado);
		
		entrada.close();
	}

}
