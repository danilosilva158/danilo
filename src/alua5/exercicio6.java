package alua5;

import java.util.Scanner;

public class exercicio6 {
    /** Exercício 6: Verificação de Nota. */
    public class Exercicio06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                System.out.println("Aluno APROVADO.");
            } else if (nota >= 5) {
                System.out.println("Aluno em RECUPERAÇÃO.");
            } else {
                System.out.println("Aluno REPROVADO.");
            }

            scanner.close();
        }
    }

}
