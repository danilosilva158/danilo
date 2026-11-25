package aula6;

import java.util.Scanner;

public class exercicio5 {
    /** Exercício 5: Média de Notas (for). */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double soma = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a nota " + i + ": ");
                soma += scanner.nextDouble();
            }

            double media = soma / 5;
            System.out.printf("Média das notas: %.2f%n", media);
            scanner.close();
        }
    }

