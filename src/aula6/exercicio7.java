package aula6;

import java.util.Scanner;

public class exercicio7 {

    /** Exercício 7: Validação de Entrada (do-while). */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double nota;
            do {
                System.out.print("Digite uma nota (0 a 10): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota < 0 || nota > 10);

            System.out.println("Nota registrada: " + nota);
            scanner.close();
        }
    }

