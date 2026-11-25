package alua5;

import java.util.Scanner;

public class exercicio1 {
    /** Exercício 1: Verificação de Acesso ao Sistema. */
    public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Acesso negado. É necessário ter 18 anos ou mais.");
            }

            scanner.close();
        }
    }

}
