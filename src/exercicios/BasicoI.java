package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada  = new Scanner(System.in);
		
		float numero = 0.0f;
		numero = entrada.nextFloat();
		entrada.nextLine();
		String resultado = "";
		
		if(numero > 0 && numero <= 25) {
			resultado = "Intervalo [0,25]";
		}
		if(numero > 25 && numero <= 50) {
			resultado = "Intervalo (25,50]";
		}
		if(numero > 50 && numero <= 75) {
			resultado = "Intervalo (50,75]";
		}
		if(numero > 75 && numero <= 100) {
			resultado = "Intervalo (75,100]";
		}
		else {
			resultado = "Fora de intervalo";
		}
		System.out.println(resultado);
		
		entrada.close();
	}

}
