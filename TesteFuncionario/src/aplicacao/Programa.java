package aplicacao;

import java.util.Scanner;

import entities.Funcionario;


public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o salario: ");
		double salario = sc.nextDouble();
		System.out.println("Informe o valor do imposto: ");
		double imposto = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario, imposto);
		
		
		System.out.println("Informe o percentual de aumento: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumento(porcentagem);
		
		System.out.println();
		System.out.println("--Relatório final-- ");
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		
		
		
	}
}
