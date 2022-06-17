package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoE {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		numero = entrada.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}

		entrada.close();
	}

}
