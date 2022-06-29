package exercicios.orientacaoObjetos.construtores;

import java.util.Locale;
import java.util.Scanner;

import exercicios.orientacaoObjetos.entity.ContaBancaria;

public class ExercicioContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta:");
		String numeroConta = entrada.next();
		entrada.nextLine();
		
		System.out.print("Entre com o titular:");
		String nomeTitular = entrada.next();
		entrada.nextLine();
		
		System.out.print("Vai fazer um deposito inicial (s/n) ?:");
		char depositoInicial = entrada.next().charAt(0);
		entrada.nextLine();
		
		ContaBancaria contaBancaria;
		
		if(depositoInicial == 's' || depositoInicial == 'S' ) {
			System.out.print("Entre com o valor inicial:");
			double valorInicial = entrada.nextDouble();
			entrada.nextLine();
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular, valorInicial);
		}else {
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		}
		
		System.out.println(contaBancaria.toString());
		
		System.out.print("Entre com o valor do deposito: ");
		contaBancaria.deposito(entrada.nextDouble());
		entrada.nextLine();
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(contaBancaria.toString());

		System.out.print("Entre com o valor da retirada: ");
		contaBancaria.retirada(entrada.nextDouble());
		entrada.nextLine();
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(contaBancaria.toString());
		
//		System.out.println(numeroConta + nomeTitular + depositoInicial);
		entrada.close();

	}

}
