package aula4;

public class exercicio4 {

        public static void main(String[] args) {
            double valorOriginal = 19.85;
            int valorConvertido = (int) valorOriginal; // Casting explícito (perde a fração)

            System.out.println("Valor double: " + valorOriginal);
            System.out.println("Valor int: " + valorConvertido); // Saída: 19
        }
    }

