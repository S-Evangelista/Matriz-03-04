package Matriz;
import java.util.Scanner;

public class ex1 {
	public static void main (String[] args) {
		//Faça um menu para que o usuário opte por  (1) – Somar  (2) – Subtrair  (3) – 
		//Multiplicar  (0) - Sair 2. Prossiga com o programa, adicionando valores as
		//matrizes A e B e calculando:  A soma das matrizes A e B, colocando o resultado 
		//na matrizSom.  A subtração das matrizes A e B, colocando o resultado na 
		//matrizSub.  A multiplicação das matrizes A e B, colocando o resultado na 
		//matrizMul.  Obs: o tamanho das matrizes Sub, Som e Mul será automaticamente 
		//programável. Uma vez que o programa sabe qual o número de linhas da 
		//matriz A e B e qual o número de colunas da matriz A e B, automaticamente se 
		//saberá qual o tamanho da matriz resultante  nos passos anteriores isso já foi 
		//feito

		
		Scanner leia = new Scanner (System.in);
		
		int[][] valor1 = new int [5][5];
		int[][] valor2 = new int [5][5];
		int[][] soma = new int[5][5];
		int[][] subtração = new int[5][5];
		int[][] multiplicação  = new int[5][5];
		int escolha = 0;
		 
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
			
				System.out.println("Digite o valor 1: ");
				valor1[linha][coluna]=leia.nextInt();
				
				System.out.println("Digite o valor 2: ");
				valor2[linha][coluna]=leia.nextInt();
				
			}
		}
		
		System.out.println("         OPÇÕES        ");
		System.out.println("                        ");
		System.out.println(" Somar                 1");
		System.out.println(" Subtrair              2");
		System.out.println(" Multiplicar           3");
		System.out.println("         SAIR - 0");
		System.out.println("                        ");
		System.out.println(" Digite sua escolha: ");
		escolha=leia.nextInt();
		
		switch (escolha) {
		
		case 1: 
			
			for(int linha1=0; linha1<5; linha1++) {
				for(int coluna1=0; coluna1<5; coluna1++) {
					
				soma[linha1][coluna1] = valor1[linha1][coluna1] + valor2[linha1][coluna1];
				System.out.println("Total "+soma[linha1][coluna1]);
			
			
				}
			}
		
		case 2:
			
			for(int linha1=0; linha1<5; linha1++) {
				for(int coluna1=0; coluna1<5; coluna1++) {
					
				subtração[linha1][coluna1] = valor1[linha1][coluna1] - valor2[linha1][coluna1];
				
				if (subtração[linha1][coluna1]< 0) {
					subtração[linha1][coluna1] = 0;
					
				}else{}
					System.out.println("Total "+subtração[linha1][coluna1]);
				
				
				
				}
			}
			
		case 3: 
			
			for(int linha1=0; linha1<5; linha1++) {
				for(int coluna1=0; coluna1<5; coluna1++) {
					
				multiplicação[linha1][coluna1] = valor1[linha1][coluna1] * valor2[linha1][coluna1];
				System.out.println("Total "+multiplicação[linha1][coluna1]);
				
				}
			}
				
		case 0: 
				break;
			
			}
		}
}




