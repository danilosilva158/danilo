package aula7;

import java.util.Scanner;

/** Exercício 2: Busca de Caracteres em um Vetor de Strings. */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letras = new String[6];

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite o caractere " + (i + 1) + ": ");
            letras[i] = scanner.next();
        }

        System.out.print("Qual letra deseja procurar? ");
        String busca = scanner.next();

        int posicao = -1;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equalsIgnoreCase(busca)) {
                posicao = i;
                break;
            }
        }

        if (posicao >= 0) {
            System.out.println("A letra '" + busca + "' está presente na posição " + posicao
                    + " do vetor (posição " + (posicao + 1) + " na ordem de digitação).");
        } else {
            System.out.println("A letra '" + busca + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
