package aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Exercício 1: Gerenciador de Tarefas (ArrayList + classe Tarefa). */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nDigite o nome da tarefa: ");
                    String nome = sc.nextLine().trim();
                    if (nome.isEmpty()) {
                        System.out.println("O nome não pode ser vazio.");
                    } else {
                        tarefas.add(new Tarefa(nome));
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                }
                case 2 -> listar(tarefas);
                case 3 -> {
                    if (tarefas.isEmpty()) { System.out.println("\nNenhuma tarefa cadastrada."); break; }
                    System.out.print("\nDigite o número da tarefa para marcar como concluída: ");
                    int n = lerInt(sc);
                    if (n < 1 || n > tarefas.size()) {
                        System.out.println("Número inválido.");
                    } else {
                        Tarefa t = tarefas.get(n - 1);
                        t.concluir();
                        System.out.println("Tarefa '" + t.getNome() + "' marcada como concluída.");
                    }
                }
                case 4 -> {
                    if (tarefas.isEmpty()) { System.out.println("\nNenhuma tarefa cadastrada."); break; }
                    System.out.print("\nDigite o número da tarefa para remover: ");
                    int n = lerInt(sc);
                    if (n < 1 || n > tarefas.size()) {
                        System.out.println("Número inválido.");
                    } else {
                        Tarefa t = tarefas.remove(n - 1);
                        System.out.println("Tarefa '" + t.getNome() + "' removida com sucesso!");
                    }
                }
                case 5 -> System.out.println("Saindo... Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        sc.close();
    }

    private static void listar(List<Tarefa> tarefas) {
        System.out.println("\nLista de Tarefas:");
        if (tarefas.isEmpty()) {
            System.out.println("(vazia)");
            return;
        }
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    private static int lerInt(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
