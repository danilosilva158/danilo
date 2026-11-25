package aula7;

import java.util.Scanner;

/** Exercício 6: Preenchendo uma Matriz 2x2. */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
