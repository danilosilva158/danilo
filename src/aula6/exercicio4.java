package aula6;

import java.util.Scanner;

public class exercicio4 {
    /** Exercício 4: Verificação de Número Primo (for). */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            boolean primo = numero > 1;
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

            scanner.close();
        }
    }
