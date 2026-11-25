package aula6;

import java.util.Scanner;

public class exercicio8 {
    /** Exercício 8: Contagem de Números Pares e Ímpares (for). */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int pares = 0;
            int impares = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o número " + i + ": ");
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
            scanner.close();
        }
    }


