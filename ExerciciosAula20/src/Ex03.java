package exercicios.aula20;

import java.util.Scanner;

/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print("Informe a posição  [" + i + "," + j + "] : ");
				numeros[i][j] = scan.nextInt();
			}
		}
		int contPar = 0;
		int contImpar = 0;
		System.out.println("Números Pares");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 == 0) {
					System.out.print(" " + numeros[i][j]);
					contPar++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de números pares :" + contPar);

		System.out.println("Números Ímpares");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 != 0) {
					System.out.print(" " + numeros[i][j]);
					contImpar++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de números ímpares :" + contImpar);

	}

}
