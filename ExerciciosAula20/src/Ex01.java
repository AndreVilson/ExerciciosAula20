package exercicios.aula20;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

public class Ex01 {
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.print("   " + numerosAleatorios[i][j]);

			}
			System.out.println();
		}

		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("Número maior " + maior);
		System.out.println("Linha " + linha);
		System.out.println("Coluna " + coluna);

	}

}
