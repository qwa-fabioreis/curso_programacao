package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoM {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int pares = entrada.nextInt();
		String resultado = "";
		for(int i = 0; i < pares; i++) {
			int numeroA = entrada.nextInt();
			int numeroB = entrada.nextInt();
			double divisao = 0.0;
			entrada.nextLine();
			if(numeroB == 0) {
			resultado += "divisao impossivel";	
			}else {
				divisao = (double) numeroA / numeroB;
				resultado += divisao;
			}
			resultado += "\n";
		}
		System.out.println(resultado);
		entrada.close();
	}

}
