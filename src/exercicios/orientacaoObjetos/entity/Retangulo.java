package exercicios.orientacaoObjetos.entity;

public class Retangulo {
	double largura;
	double altura;

	public double area() {
		return largura * altura;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}

	public double perimetro() {
		return 2 * (altura + largura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
}
