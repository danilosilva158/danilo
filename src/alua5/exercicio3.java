package alua5;

import java.util.Scanner;

public class exercicio3 {
    /** Exercício 3: Classificação de Produto (switch). */
    public class Exercicio03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Códigos: 1 - Eletrônicos | 2 - Alimentos | 3 - Vestuário");
            System.out.print("Digite o código do produto: ");
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    System.out.println("Categoria: Eletrônicos");
                    break;
                case 2:
                    System.out.println("Categoria: Alimentos");
                    break;
                case 3:
                    System.out.println("Categoria: Vestuário");
                    break;
                default:
                    System.out.println("Código inválido!");
            }

            scanner.close();
        }
    }

}
