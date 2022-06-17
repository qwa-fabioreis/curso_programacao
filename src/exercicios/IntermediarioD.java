package exercicios;

import java.util.Locale;
import java.util.Scanner;

import org.w3c.dom.traversal.DocumentTraversal;

public class IntermediarioD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float salario, calculo, resto = 0.0f;
		salario = entrada.nextFloat();
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}
		if(salario > 2000 && salario <= 3000) {
			calculo = (salario - 2000) * 0.8f;
			System.out.printf("R$ %.2f %n",calculo);
		}
		if(salario > 3000 && salario <= 4500) {
			resto = salario % 1000;
			calculo = (salario - 2000 - resto) * 0.08f;
			calculo += resto * 0.18f;
			System.out.printf("R$ %.2f %n",calculo);
		}
		if(salario > 4500) {
			resto = salario % 4500;
			//  8% em cima de 1000 = 80
			// 18% em cima de 1500 = 270
			calculo = resto * 0.28f;
			calculo += 80 + 270;
			System.out.printf("R$ %.2f %n",calculo);
		}
		entrada.close();
	}

}
