package exercicios;

import java.util.Scanner;

public class BasicoL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int in = 0 ;
		int out = 0 ;
		
		for(int i = 0; i < n; i++) {
			int numero = entrada.nextInt();
			if(numero >=10 && numero <=20) {
				in++ ;
			}else {
				out++ ;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		entrada.close();
	}

}
