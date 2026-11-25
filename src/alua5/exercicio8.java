package alua5;

import java.util.Scanner;

public class exercicio8 {/** Exercício 8: Avaliação de Desempenho (switch). */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a avaliação de desempenho (1 a 5): ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Avaliação inválida! Digite um valor de 1 a 5.");
        }

        scanner.close();
    }
}


}
