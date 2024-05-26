package aplicacao;

import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do estudante: ");
		String nome = sc.nextLine();
		System.out.println("Informe a nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.println("Informe a nota 3: ");
		double nota3 = sc.nextDouble();
		
		Estudante estudante = new Estudante(nome, nota1, nota2, nota3);
		
		System.out.println();
		System.out.println("--Resultado--");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Nota final: " + estudante.total());
		System.out.println(estudante.notaFinal());

	}

}
