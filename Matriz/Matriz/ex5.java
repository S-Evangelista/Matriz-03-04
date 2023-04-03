package Matriz;
import java.util.Scanner;

public class ex5 {
public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Criar um programa que leia os elementos de uma matriz inteira 4 x 4 e:
		//	a) escreva os elementos da diagonal principal;
		//	b) escreva todos os elementos, exceto os elementos da diagonal principal;

		int[][] matriz = new int[4][4];
		
		
		for (int linha = 0; linha <4; linha++){
			for (int coluna = 0; coluna <4; coluna++) {
				
				System.out.println("Digite um número: ");
				matriz[linha][coluna]=leia.nextInt();
				
				}
			}
		System.out.println("Números em diagonal: ");
		for (int linha = 0; linha <4; linha++){
			for (int coluna = 0; coluna <4; coluna++)
		if( coluna==linha) {
					System.out.println(matriz[linha][coluna]);
		}
		}
			System.out.println("Outros números: ");
			
			for (int linha = 0; linha <4; linha++){
				for (int coluna = 0; coluna <4; coluna++)
			if( coluna != linha) {
						System.out.println(matriz[linha][coluna]);
}
}

}
}

