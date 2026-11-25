package aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Exercício 2: Controle de Estoque de Produtos (ArrayList + classe Produto). */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Controle de Estoque ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Remover Produto");
            System.out.println("5. Buscar Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nDigite o nome do produto: ");
                    String nome = sc.nextLine().trim();
                    System.out.print("Digite a quantidade: ");
                    int qtd = lerInt(sc);
                    if (nome.isEmpty() || qtd < 0) {
                        System.out.println("Dados inválidos. Produto não cadastrado.");
                    } else {
                        estoque.add(new Produto(nome, qtd));
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                }
                case 2 -> {
                    System.out.println("\nLista de Produtos:");
                    if (estoque.isEmpty()) System.out.println("(estoque vazio)");
                    for (int i = 0; i < estoque.size(); i++) {
                        System.out.println((i + 1) + ". " + estoque.get(i));
                    }
                }
                case 3 -> {
                    System.out.print("\nDigite o nome do produto para atualizar: ");
                    Produto p = buscar(estoque, sc.nextLine());
                    if (p == null) { System.out.println("Produto não encontrado."); break; }
                    System.out.print("Digite a nova quantidade: ");
                    int qtd = lerInt(sc);
                    if (qtd < 0) { System.out.println("Quantidade inválida."); break; }
                    p.setQuantidade(qtd);
                    System.out.println("Quantidade atualizada com sucesso!");
                }
                case 4 -> {
                    System.out.print("\nDigite o nome do produto para remover: ");
                    Produto p = buscar(estoque, sc.nextLine());
                    if (p == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        estoque.remove(p);
                        System.out.println("Produto removido com sucesso!");
                    }
                }
                case 5 -> {
                    System.out.print("\nDigite o nome do produto para buscar: ");
                    Produto p = buscar(estoque, sc.nextLine());
                    if (p == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println("Produto encontrado:");
                        System.out.println(p);
                    }
                }
                case 6 -> System.out.println("Saindo... Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
        sc.close();
    }

    private static Produto buscar(List<Produto> estoque, String nome) {
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome.trim())) return p;
        }
        return null;
    }

    private static int lerInt(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
