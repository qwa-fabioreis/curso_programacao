package exercicios.orientacaoObjetos.entity;

public class Estudante {
	private String nome;
	private float notaA, notaB, notaC;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNotaA() {
		return notaA;
	}
	public void setNotaA(float notaA) {
		this.notaA = notaA;
	}
	public float getNotaB() {
		return notaB;
	}
	public void setNotaB(float notaB) {
		this.notaB = notaB;
	}
	public float getNotaC() {
		return notaC;
	}
	public void setNotaC(float notaC) {
		this.notaC = notaC;
	}
	
	public float notaFinal() {
		return notaA+notaB+notaC;
	}
	
	public void situacao() {
		if(notaFinal() >= 60.00) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
			float pontosNecessarios = 60.00f - notaFinal();
			System.out.printf("Falta %.2f pontos %n",pontosNecessarios);
		}
	}
	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", notaA=" + notaA + ", notaB=" + notaB + ", notaC=" + notaC + "]";
	}
	
}
