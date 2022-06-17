package exercicios;

import java.util.Scanner;

public class IntermediarioE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int senha = 2002;
		int senhaDigitada; 
		boolean validacao = true;
		while (validacao) {
			senhaDigitada = entrada.nextInt();
			if(senhaDigitada == senha) {
				validacao = false;
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida");
			}
		}
		
		entrada.close();
	}

}
