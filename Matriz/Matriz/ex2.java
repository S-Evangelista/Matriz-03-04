package Matriz;
import java.util.Scanner;

public class ex2 {
	public static void main (String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	int[][] matriz = new int[5][5];
	
	
	for (int linha = 0; linha<5; linha ++){
		for (int coluna=0; coluna<5; coluna++) {
			if( coluna==linha) {
				System.out.println("Indices iguais coluna "+coluna+" linha "+linha);
			}
		}
		
	}

}
}
