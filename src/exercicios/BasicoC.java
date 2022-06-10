package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroA = entrada.nextInt();
		int numeroB = entrada.nextInt();
		int numeroC = entrada.nextInt();
		int numeroD = entrada.nextInt();
		
		int diferenca = numeroA*numeroB-numeroC*numeroD;
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		entrada.close();
	}

}
