package exercicios.orientacaoObjetos.entity;

public class ContaBancaria {
	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	private double valorInicial;
	
	public ContaBancaria(String numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorInicial = valorInicial;
		this.saldo += this.valorInicial;
	}
	
	public ContaBancaria(String numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void retirada(double saque) {
//		cobrar taxa de 5.00
		this.saldo -= saque + 5.00;
	}
	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + String.format("%.2f", saldo) + "]";
	}
	
}
