package alua5;

import java.util.Scanner;

public class exercicio9 {
    /** Exercício 9: Determinação de Turno. */
    public class Exercicio09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a hora atual (0 a 23): ");
            int hora = scanner.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida!");
            } else if (hora >= 5 && hora < 12) {
                System.out.println("Turno: Manhã");
            } else if (hora >= 12 && hora < 18) {
                System.out.println("Turno: Tarde");
            } else if (hora >= 18 && hora < 22) {
                System.out.println("Turno: Noite");
            } else {
                System.out.println("Turno: Madrugada");
            }

            scanner.close();
        }
    }

}
