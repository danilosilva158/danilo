package alua5;

import java.util.Scanner;

public class exercicio7 {
    /** Exercício 7: Escolha de Operação (switch). */
    public class Exercicio07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.println("Operações: 1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
            System.out.print("Escolha a operação: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Erro: divisão por zero!");
                    } else {
                        System.out.println("Resultado: " + (n1 / n2));
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            scanner.close();
        }
    }

}
