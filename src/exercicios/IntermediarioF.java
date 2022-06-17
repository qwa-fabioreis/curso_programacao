package exercicios;

import java.util.Scanner;

public class IntermediarioF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x,y ;
		boolean validacao = true;
		String coordenada = "";
		
		while(validacao) {
			x = entrada.nextInt();
			y = entrada.nextInt();
			entrada.nextLine();
			if(x > 0) {
				if(y > 0) {
					coordenada ="primeiro";
				}else {
					coordenada ="quarto";
				}
			}
			else if(x < 0) {
				if(y > 0) {
					coordenada ="segundo";
				}else {
					coordenada ="terceiro";
				}
			}else {
				validacao = false;
				coordenada = "";
			}
			System.out.println(coordenada);
		}
		entrada.close();
	}

}
