package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BasicoJ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float x, y ;
		x = entrada.nextFloat();
		y = entrada.nextFloat();
		entrada.nextLine();
		String coordenada = "";
		
		if(x < 0) {
			if(y < 0) {
				coordenada = "Q3";
			}else {
				coordenada = "Q2";
				
			}
		}
		else if(x > 0) {
			if(y < 0) {
				coordenada = "Q4";
			}else {
				coordenada = "Q1";
				
			}
		}
		else {
			coordenada = "Origem";
		}
		
		System.out.println(coordenada);
		
		entrada.close();
	}

}
