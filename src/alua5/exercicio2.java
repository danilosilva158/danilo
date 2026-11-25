package alua5;

import java.util.Scanner;

public class exercicio2 {
    /** Exercício 2: Desconto em Compra. */
    public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor da compra (R$): ");
            double valor = scanner.nextDouble();

            double valorFinal = valor;
            if (valor > 100) {
                valorFinal = valor - (valor * 0.10);
                System.out.println("Desconto de 10% aplicado!");
            } else {
                System.out.println("Sem desconto.");
            }

            System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
            scanner.close();
        }
    }

}
