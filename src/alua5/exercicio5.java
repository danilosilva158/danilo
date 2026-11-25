package alua5;

import java.util.Scanner;

public class exercicio5 {
    /** Exercício 5: Cálculo de Horas Extras. */
    public class Exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Horas trabalhadas: ");
            double horas = scanner.nextDouble();
            System.out.print("Valor da hora normal (R$): ");
            double valorHora = scanner.nextDouble();

            if (horas > 40) {
                double horasExtras = horas - 40;
                double valorHoraExtra = valorHora * 1.5; // 50% a mais
                double totalExtras = horasExtras * valorHoraExtra;
                System.out.println("Horas extras: " + horasExtras);
                System.out.printf("Valor a pagar pelas horas extras: R$ %.2f%n", totalExtras);
            } else {
                System.out.println("O funcionário não fez horas extras.");
            }

            scanner.close();
        }
    }

}
