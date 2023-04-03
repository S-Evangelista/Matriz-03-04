package Matriz;
import java.util.Scanner;

public class ex3 {
	public static void main (String[] args) {
		
		// Escreva um programa que leia uma matriz 4 x 4 de inteiros e atribua 
		//o valor 0 para os valores negativos, e mostre todos os valores da matriz.
		
		Scanner leia = new Scanner (System.in);
		
		int[][] matriz = new int[4][4];
		
		for (int linha = 0; linha <4; linha++) {
			for(int coluna = 0; coluna<4; coluna++) {
				System.out.println("Insira um número: ");
				matriz[linha][coluna]=leia.nextInt();
				if(matriz[linha][coluna]<0) {
					matriz[linha][coluna] = 0;
				}
				
			}
		}
		for (int linha = 0; linha <4; linha++) {
			for(int coluna = 0; coluna<4; coluna++) {
				System.out.println("Número "+matriz[linha][coluna]+ " na linha "+linha+
						" e na coluna "+coluna);
			}
		
	}

}
}
