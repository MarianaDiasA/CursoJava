package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	
	public Funcionario(String nome, double salario, double imposto) {
		this.nome = nome;
		this.salario = salario;
		this.imposto = imposto;
	}
	
	//metodo para ver o salario liquido
	public double salarioLiquido() {
		return salario - imposto;
	}
	//vou criar um metodo para aumentar salario
	public void aumento(double porcentagem) {
		double total = this.salario * (porcentagem / 100);
		this.salario = this.salario + total;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}

}
