package aula6;

public class exercicio2 {
    /** Exercício 2: Soma de Números Pares de 1 a 100 (while). */

        public static void main(String[] args) {
            int soma = 0;
            int numero = 1;

            while (numero <= 100) {
                if (numero % 2 == 0) {
                    soma += numero;
                }
                numero++;
            }

            System.out.println("Soma dos números pares de 1 a 100: " + soma);
        }
    }



