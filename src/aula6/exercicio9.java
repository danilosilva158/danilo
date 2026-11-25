package aula6;

import java.util.Random;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1; // 1 a 100
        int tentativas = 0;
        int palpite;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Pensei em um número entre 1 e 100. Consegue adivinhar?");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < secreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > secreto) {
                System.out.println("Muito alto! Tente um número menor.");
            }
        } while (palpite != secreto);

        System.out.println("Parabéns! Você acertou o número " + secreto
                + " em " + tentativas + " tentativa(s).");
        scanner.close();
    }
}


