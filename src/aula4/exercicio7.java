package aula4;

public class exercicio7 {

        public static void main(String[] args) {
            boolean cond1 = true;
            boolean cond2 = false;
            boolean cond3 = true;

            boolean resultadoAnd = cond1 && cond2;
            boolean resultadoOr = cond2 || cond3;
            boolean combinacao = (cond1 && cond3) || cond2;

            System.out.println("cond1 && cond2: " + resultadoAnd);         // false
            System.out.println("cond2 || cond3: " + resultadoOr);          // true
            System.out.println("(cond1 && cond3) || cond2: " + combinacao); // true
        }
    }

