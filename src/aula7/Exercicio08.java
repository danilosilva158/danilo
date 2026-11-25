package aula7;

import java.util.Scanner;

/** Exercício 8: Matriz 2x2 de double - soma de cada linha. */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("Soma da linha %d: %.2f%n", i + 1, somaLinha);
        }

        scanner.close();
    }
}
