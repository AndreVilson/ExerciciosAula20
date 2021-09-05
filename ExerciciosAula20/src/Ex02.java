package exercicios.aula20;

import java.util.Random;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

public class Ex02 {
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
				System.out.print("  " + numerosAleatorios[i][j]);
			}
			System.out.println();

		}
		System.out.println();

		int menorLinha5 = Integer.MAX_VALUE;
		int maiorLinha5 = Integer.MIN_VALUE;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[5][j] > maiorLinha5) {
					maiorLinha5 = numerosAleatorios[5][j];
				}
				if (numerosAleatorios[5][j] < menorLinha5) {
					menorLinha5 = numerosAleatorios[5][j];
				}

			}
		}
		int menorColuna7 = Integer.MAX_VALUE;
		int maiorColuna7 = Integer.MIN_VALUE;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 7; j < numerosAleatorios[i].length; j = j + 7) {
				if (numerosAleatorios[i][j] > maiorColuna7) {
					maiorColuna7 = numerosAleatorios[i][j];
				}
				if (numerosAleatorios[i][j] < menorColuna7) {
					menorColuna7 = numerosAleatorios[i][j];
				}
			}
		}

		System.out.println("Valores da linha 5");
		System.out.print("menor " + menorLinha5 + "  maior " + maiorLinha5);
		System.out.println();
		System.out.println();
		System.out.println("Valores coluna 7");
		System.out.print("menor " + menorColuna7 + " maior " + maiorColuna7);

	}

}
