package aula7;

import java.util.Scanner;

/** Exercício 9: Contando Números Pares em uma Matriz 4x4. */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de números pares na matriz: " + pares);
        scanner.close();
    }
}
