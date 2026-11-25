package aula6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite números de 0 a 100 (negativo encerra a leitura).");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // fim normal da lista
            }

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
                continue; // guarda o par e segue para o próximo
            }

            impares.add(numero);
        }

        System.out.println("\nNúmeros pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        scanner.close();
    }
}
