package exercicios.orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import exercicios.orientacaoObjetos.entity.Trabalhador;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Trabalhador trabalhador = new Trabalhador();
		
		System.out.print("Nome: ");
		String nome = entrada.next();
		trabalhador.setNome(nome);
		entrada.nextLine();
		
		System.out.print("Salário bruto: ");
		double salarioBruto = entrada.nextDouble();
		trabalhador.setSalarioBruto(salarioBruto);
		entrada.nextLine();
		
		System.out.print("Taxa de imposto: ");
		double taxa = entrada.nextDouble();
		trabalhador.setTaxa(taxa);
		entrada.nextLine();
		
		System.out.printf("Trabalhador: %s, R$ %.2f %n",trabalhador.getNome(),trabalhador.salarioLiquido());
		
		System.out.print("Porcentagem para aumento de salário: ");
		double porcentagemAumento = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.printf("Dados atualizados: %s, R$ %.2f", trabalhador.getNome(), trabalhador.salarioAdicional(porcentagemAumento));
		entrada.close();

	}

}
