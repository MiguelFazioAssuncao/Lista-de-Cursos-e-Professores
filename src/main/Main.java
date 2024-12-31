package src.main;

import src.main.modules.Curso;
import src.main.modules.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursosConcluidos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma das opções:\n" +
                    "1 - Adicionar Curso\n" +
                    "2 - Adicionar Professor\n" +
                    "3 - Remover Curso\n" +
                    "4 - Remover Professor\n" +
                    "5 - Listar Cursos\n" +
                    "6 - Listar Professores\n" +
                    "7 - Marcar Curso como concluído\n" +
                    "0 - Sair");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> adicionarCurso(cursos, scan);
                case 2 -> adicionarProfessor(professores, scan);
                case 3 -> removerItemLista(cursos, scan);
                case 4 -> removerItemLista(professores, scan);
                case 5 -> listarCursos(cursos, cursosConcluidos);
                case 6 -> listarProfessores(professores);
                case 7 -> marcarComoConcluido(cursos, cursosConcluidos, scan);
                case 0 -> {
                    System.out.println("Saindo...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }

        scan.close();
    }

    public static void adicionarCurso(ArrayList<Curso> cursos, Scanner scan) {
        System.out.print("Informe o nome do curso: ");
        String nome = scan.nextLine();
        System.out.print("Informe a descrição do curso: ");
        String descricao = scan.nextLine();

        Curso curso = new Curso(nome, descricao);
        cursos.add(curso);
        System.out.println("Curso adicionado com sucesso!");
    }

    public static void adicionarProfessor(ArrayList<Professor> professores, Scanner scan) {
        System.out.print("Informe o nome do professor: ");
        String nome = scan.nextLine();
        System.out.print("Informe a disciplina do professor: ");
        String disciplina = scan.nextLine();

        Professor professor = new Professor(nome, disciplina);
        professores.add(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    public static void listarCursos(ArrayList<Curso> cursos, ArrayList<Curso> cursosConcluidos) {
        System.out.println("Lista de Cursos - Disponiveis:");
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso encontrado");
        }
            for (int indice = 0; indice < cursos.size(); indice++) {
                System.out.println(cursos.get(indice));
            }

        System.out.println("\nLista de Cursos - Concluídos:");
            if (cursosConcluidos.isEmpty()) {
                System.out.println("Nenhum curso encontrado");
            }

            for (int indice = 0; indice < cursosConcluidos.size(); indice++) {
                System.out.println(cursosConcluidos.get(indice));
            }
    }

    public static void listarProfessores(ArrayList<Professor> professores) {
        System.out.println("Lista de Professores:");
        if (professores.isEmpty()) {
            System.out.println( "Nenhum professor encontrado");
        }
            for (int indice = 0; indice < professores.size() ; indice++) {
                System.out.println(professores.get(indice));
            }
    }

    public static int listarPedirIndice(ArrayList<?> listagem, Scanner scan) {
        if (listagem.isEmpty())
            System.out.println("Nenhum item encontrado");

        for (int indice = 0; indice < listagem.size(); indice++) {
            System.out.println(indice + " - " + listagem.get(indice));
        }

        System.out.println("Escolha um item da lista: ");
        return scan.nextInt();
    }

    public static void marcarComoConcluido(ArrayList<Curso> cursos, ArrayList<Curso> cursosConlcuidos , Scanner scan) {
        int indice = listarPedirIndice(cursos, scan);

        if(indice >= 0 && indice < cursos.size()) {
            cursosConlcuidos.add(cursos.get(indice));
            removerItem(cursos, indice);
            System.out.println("Item marcado com sucesso!");
        } else {
            System.out.println("Indice inválido");
        }
    }

    public static void removerItemLista(ArrayList<?> listagem, Scanner scan) {
        int indice = listarPedirIndice(listagem, scan);

        if (indice >= 0 && indice < listagem.size()) {
            removerItem(listagem, indice);
        } else {
            System.out.println("Indice inválido");
        }
    }

    public static void removerItem(ArrayList<?> listagem, int indice) {
        listagem.remove(indice);
        System.out.println("Item removido com sucesso!");
    }


}
