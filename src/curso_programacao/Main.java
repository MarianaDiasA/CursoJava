package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i=0;
		int j=0;
		int neg=0;
		
		System.out.print("Qual vai ser a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Informe os valores: ");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print("Elemento ["+i+"]["+j+"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j) {
					System.out.print(matriz[i][j]+ " ");
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de negativos: ");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(matriz[i][j]<0) {
					neg=neg+1;
				}
			}
		}
		System.out.print(neg);
		
		
		
		
		
		
		sc.close();
	}
}
