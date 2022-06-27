package exercicios.orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import exercicios.orientacaoObjetos.entity.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura de um retângulo:");
		double largura = entrada.nextDouble();
		double altura = entrada.nextDouble();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(altura);
		retangulo.setLargura(largura);
		
		System.out.printf("Area  = %.2f %n",retangulo.area());
		System.out.printf("Perimetro  = %.2f %n",retangulo.perimetro());
		System.out.printf("Diagonal  = %.2f %n",retangulo.diagonal());
		
		entrada.close();
	}

}
