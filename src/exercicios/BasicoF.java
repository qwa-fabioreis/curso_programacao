package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}

		entrada.close();
	}

}
