package exercicios.orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import exercicios.orientacaoObjetos.entity.Estudante;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		estudante.setNome(entrada.next());
		entrada.nextLine();
		
		estudante.setNotaA(entrada.nextFloat());
		entrada.nextLine();

		estudante.setNotaB(entrada.nextFloat());
		entrada.nextLine();
		
		estudante.setNotaC(entrada.nextFloat());
		entrada.nextLine();
		
		System.out.printf("Notal Final = %.2f %n", estudante.notaFinal());
		estudante.situacao();
		
		entrada.close();

	}

}
