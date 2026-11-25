package aula6;

public class exercicio6 {/** Exercício 6: Sequência de Fibonacci - 10 primeiros números (while). */
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int contador = 1;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");
        while (contador <= 10) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            contador++;
        }
        System.out.println();
    }
}



