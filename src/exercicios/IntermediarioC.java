package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IntermediarioC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int horaI, horaF, total;
		horaI = entrada.nextInt();
		horaF = entrada.nextInt();
		entrada.nextLine();
		
		if(horaI > horaF) {
			total = 24 - horaI + horaF;
		}
		else if(horaI < horaF) {
			total = horaF - horaI;
		}else {
			total = 24;
		}
		
		System.out.printf("O JOGO DUROU " + total + " HORA(S)");
		entrada.close();
	}

}
