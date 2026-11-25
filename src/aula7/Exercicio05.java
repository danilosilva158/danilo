package aula7;

import java.util.Scanner;

/** Exercício 5: Vetor de Strings (verificação de nome). */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Qual nome deseja verificar? ");
        String busca = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome \"" + busca + "\" está presente no vetor.");
        } else {
            System.out.println("O nome \"" + busca + "\" NÃO está presente no vetor.");
        }

        scanner.close();
    }
}
