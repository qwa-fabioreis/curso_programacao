package exercicios.metodosEstaticos.util;

public class ConversaoDollar {
	public static double conversaoMoedas(double cotacao, double valor) {
		return valor * cotacao * 0.06 + (valor * cotacao) ;
	}
}
