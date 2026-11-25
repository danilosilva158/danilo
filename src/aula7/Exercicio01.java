package aula7;

import java.util.Scanner;

/** Exercício 1: Soma de Elementos Inteiros em um Vetor. */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);
        scanner.close();
    }
}
