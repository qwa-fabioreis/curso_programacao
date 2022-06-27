package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IntermediarioH {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroCasos = entrada.nextInt();
		double media = 0.0;
		String resultado = "";
		
		for(int i = 0; i < numeroCasos; i++) {
			float numeroA = entrada.nextFloat();
			float numeroB = entrada.nextFloat();
			float numeroC = entrada.nextFloat();
			entrada.nextLine();
			media = ((numeroA*2) + (numeroB*3) + (numeroC*5)) / (2+3+5) ;
//			resultado += media + " \n";
			resultado += String.format("%.1f %n", media);
		}
		System.out.println(resultado);
		entrada.close();
		
	}

}
