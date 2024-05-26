package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double soma;
	
	
	public Estudante(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.nota1 = nota2;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	//metodo para ver a nota final
	public double total() {
		return this.soma = this.nota1 + this.nota2 + this.nota3;
	}
	
	//vendo quantos pontos faltam
	public double faltando() {
		if(this.soma<60) {
			return 60 - this.soma;
		}else {
			return 0;
		}
	}
	
	//vendo se a nota final é suficiente pra passar
	public String notaFinal() {
		if(this.soma>=60) {
			return "PASSOU";
		}else {
			return String.format("Está faltando %.2f pontos \n",this.faltando());
		}
	}
	
	

}
