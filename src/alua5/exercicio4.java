package alua5;

import java.util.Scanner;

public class exercicio4 {
    /** Exercício 4: Cálculo de Comissão. */
    public class Exercicio04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor das vendas (R$): ");
            double vendas = scanner.nextDouble();

            double percentual;
            if (vendas < 1000) {
                percentual = 0.05;
            } else if (vendas <= 5000) {
                percentual = 0.10;
            } else {
                percentual = 0.15;
            }

            double comissao = vendas * percentual;
            System.out.printf("Comissão de %.0f%%: R$ %.2f%n", percentual * 100, comissao);
            scanner.close();
        }
    }

}
