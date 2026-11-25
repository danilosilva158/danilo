package aula7;

import java.util.Scanner;

/** Exercício 3: Contagem de Valores Booleanos. */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int totalTrue = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite true ou false (" + (i + 1) + "/8): ");
            valores[i] = scanner.nextBoolean();
            if (valores[i]) {
                totalTrue++;
            }
        }

        System.out.println("Quantidade de valores true: " + totalTrue);
        scanner.close();
    }
}
