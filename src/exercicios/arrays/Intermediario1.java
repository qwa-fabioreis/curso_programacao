package exercicios.arrays;

import java.util.Scanner;

public class Intermediario1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int m,n ;
		m = entrada.nextInt();
		n = entrada.nextInt();
		entrada.nextLine();
		
		int matriz[][] = new int[m][n];
		
		for(int i=0; i < m; i++) {
			for(int j =0; j < n; j++) {
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		int coringa = entrada.nextInt();
		
		for(int i=0; i < m; i++) {
			for(int j =0; j < n; j++) {
				if(matriz[i][j] == coringa) {
					System.out.printf("Posição: %d,%d %n",i,j);
					
					if(j-1 >= 0) {
						System.out.printf("Esquerda: %d %n",matriz[i][j-1]);
					}
					
					if(j+1 < n) {
						System.out.printf("Direita: %d %n",matriz[i][j+1]);
					}
					
					if(i-1 >= 0) {
						System.out.printf("Cima: %d %n",matriz[i-1][j]);
					}
					
					if(i+1 < m) {
						System.out.printf("Baixo: %d %n",matriz[i+1][j]);
					}
				}
			}
		}
		
		entrada.close();

	}

}
