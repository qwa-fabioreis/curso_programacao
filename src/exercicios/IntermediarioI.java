package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IntermediarioI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		int resultado ;
		int numero = entrada.nextInt();
		
		resultado = numero;
		
		for(int i = 1; i < numero; i++) {
			resultado *= numero-i;
		}
		if(numero == 0) {
			resultado = 1;
		}
		System.out.println(resultado);
		
		entrada.close();
	}

}
