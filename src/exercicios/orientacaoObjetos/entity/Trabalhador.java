package exercicios.orientacaoObjetos.entity;

public class Trabalhador {
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double salarioAdicional(double porcentagem) {
		return salarioBruto*porcentagem /100 + salarioLiquido();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}
