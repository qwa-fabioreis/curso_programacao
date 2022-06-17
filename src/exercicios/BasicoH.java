package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoH {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int codigo, quantidade;
		float total = 0.0f;
		
		codigo = entrada.nextInt();
		quantidade = entrada.nextInt();
		entrada.nextLine();
		
		if(codigo == 1) {
			total = quantidade * 4.00f;
		}
		if(codigo == 2) {
			total = quantidade * 4.50f;
		}
		if(codigo == 3) {
			total = quantidade * 5.00f;
		}
		if(codigo == 4) {
			total = quantidade * 2.00f;
		}
		if(codigo == 5) {
			total = quantidade * 1.50f;
		}

		System.out.printf("Total: R$ %.2f %n",total);
		entrada.close();
	}

}
