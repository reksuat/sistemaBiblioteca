package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();
        int opcao = 0;
        
        System.out.println("Bem-vindo a Biblioteca!");
        
        while (opcao != 6) {
            System.out.println("\n1-Cadastrar");
            System.out.println("2-Listar");
            System.out.println("3-Buscar por tipo");
            System.out.println("4-Ordenar por preço");
            System.out.println("5-Remover");
            System.out.println("6-Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n1-Fisico\n2-Ebook\n3-Revista");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Titulo: ");
                    String t = scanner.nextLine();
                    System.out.print("Autor: ");
                    String a = scanner.nextLine();
                    System.out.print("Preco: R$");
                    double p = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Paginas: ");
                        int pag = scanner.nextInt();
                        biblioteca.add(new LivroFisico(t, a, p, pag));
                    } else if (tipo == 2) {
                        System.out.print("MB: ");
                        double mb = scanner.nextDouble();
                        biblioteca.add(new Ebook(t, a, p, mb));
                    } else if (tipo == 3) {
                    	System.out.print("Edição: ");
                    	int edicao = scanner.nextInt();
                    	biblioteca.add(new Revista(t, a, p, edicao)); 
                    }
                    break;
                case 2:
                    System.out.println("\nLista de Itens na Biblioteca");
                    if (biblioteca.isEmpty()) {
                        System.out.println("A biblioteca está vazia.");
                    } else {
                        for (Livro l : biblioteca) {
                        	l.exibirDetalhes();
                        	System.out.println("\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n1-Fisico\n2-Ebook\n3-Revista");
                    int buscaTipo = scanner.nextInt();
                    scanner.nextLine();
                    
                    boolean encontrou = false;
                    for (Livro l : biblioteca) {
                        if ((buscaTipo == 1 && l instanceof LivroFisico) ||
                            (buscaTipo == 2 && l instanceof Ebook) ||
                            (buscaTipo == 3 && l instanceof Revista)) {
                            
                        	l.exibirDetalhes();
                            System.out.println("\n");
                            encontrou = true;
                        }
                    }
                    	if (!encontrou) {
                    		System.out.println("Nenhum item deste tipo foi encontrado na biblioteca.");
                    }
                    break;
                case 4:
                    biblioteca.sort((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco()));
                    if (biblioteca.isEmpty()) {
                        System.out.println("A biblioteca está vazia.");
                    } else {
                    	System.out.println("Lista ordenada por preço!");
                        for (Livro l : biblioteca) {
                        	l.exibirDetalhes();
                            System.out.println("-----------------");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o título do livro para remover: ");
                    String tituloRemover = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < biblioteca.size(); i++) {
                        if (biblioteca.get(i).getTitulo().equalsIgnoreCase(tituloRemover)) {
                            biblioteca.remove(i);
                            encontrado = true;
                            System.out.println("Removido com sucesso!");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Nossa biblioteca agradece, boa leitura!");
                    break;
            }
        }
    }
}
