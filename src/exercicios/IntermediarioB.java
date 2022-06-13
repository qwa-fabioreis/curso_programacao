package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IntermediarioB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float numeroA, numeroB, numeroC = 0.0f ;
		numeroA = entrada.nextFloat();
		numeroB = entrada.nextFloat();
		numeroC = entrada.nextFloat();
		entrada.nextLine();
		
		float triangulo = numeroA * numeroC / 2;
		double circulo = 3.14159 * Math.pow(numeroC, 2);
		float trapezio = (numeroA + numeroB) * numeroC / 2; 
		double quadrado = Math.pow(numeroB, 2);
		float retangulo = numeroA * numeroB;
		
		System.out.printf("TRIANGULO: %.3f %n",triangulo);
		System.out.printf("CIRCULO: %.3f %n",circulo);
		System.out.printf("TRAPEZIO: %.3f %n",trapezio);
		System.out.printf("QUADRADO: %.3f %n",quadrado);
		System.out.printf("RETANGULO: %.3f %n", retangulo);
		
		entrada.close();
	}

}
