package aula6;

import java.util.Scanner;

public class exercicio3 {
    /** Exercício 3: Cálculo de Fatorial (do-while). */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero;
            do {
                System.out.print("Digite um número inteiro positivo: ");
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Valor inválido! O número deve ser positivo.");
                }
            } while (numero < 0);

            long fatorial = 1;
            int contador = 1;
            do {
                fatorial *= contador;
                contador++;
            } while (contador <= numero);

            System.out.println(numero + "! = " + fatorial);
            scanner.close();
        }
    }



