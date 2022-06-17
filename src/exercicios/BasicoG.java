package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoG {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroA, numeroB = 0;
		numeroA = entrada.nextInt();
		numeroB = entrada.nextInt();
		entrada.nextLine();
		if(numeroA % numeroB == 0|| numeroB % numeroA == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		entrada.close();
	}

}
