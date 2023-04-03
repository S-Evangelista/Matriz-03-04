package Matriz;
import java.util.Scanner;

public class ex4 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//-Escreva um programa que leia uma matriz 6 x 6 de inteiros. Leia também um 
		//valor inteiro x. O programa deverá fazer uma busca desse valor na matriz e,
		//ao final escrever sua localização (linha e coluna) ou uma mensagem de 
		//“não encontrado”
		
		int[][] matriz = new int[6][6];
		int numero;
		
		for (int linha=0; linha<6; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				
				System.out.println("Digite um número: ");
				matriz[linha][coluna]=leia.nextInt();
				
			}
		}
		
		System.out.println("Número procurado: ");
				numero=leia.nextInt();
				
		for (int linha=0; linha<6; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				
				if(numero == matriz[linha][coluna]) {
					System.out.println("Coluna "+coluna+" linha "+linha);
				}
			}
		}
	
	}
}
