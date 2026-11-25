package alua5;

import java.util.Scanner;

public class exercicio10 {
    /** Exercício 10: Conversão de Moedas (switch). Cotações fixas, apenas didáticas. */
    public class Exercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Cotações fixas de exemplo (1 unidade da moeda = X reais)
            final double DOLAR = 5.50;
            final double EURO = 6.00;
            final double LIBRA = 7.00;

            System.out.print("Digite o valor em reais (R$): ");
            double reais = scanner.nextDouble();
            System.out.println("Moedas: 1 - Dólar | 2 - Euro | 3 - Libra");
            System.out.print("Escolha a moeda: ");
            int moeda = scanner.nextInt();

            switch (moeda) {
                case 1:
                    System.out.printf("R$ %.2f = US$ %.2f%n", reais, reais / DOLAR);
                    break;
                case 2:
                    System.out.printf("R$ %.2f = € %.2f%n", reais, reais / EURO);
                    break;
                case 3:
                    System.out.printf("R$ %.2f = £ %.2f%n", reais, reais / LIBRA);
                    break;
                default:
                    System.out.println("Moeda inválida!");
            }

            scanner.close();
        }
    }

}
