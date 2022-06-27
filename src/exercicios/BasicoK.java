package exercicios;

import java.util.Scanner;

public class BasicoK {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		
		for(int i = 1; i <= x && x <= 1000; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}

}
