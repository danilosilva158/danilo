package aula4;

public class exercicio10 {
        public static void main(String[] args) {
            short s = 100;
            int i = s;           // casting implícito
            byte b = (byte) s;   // casting explícito
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("byte: " + b);
        }
    }

