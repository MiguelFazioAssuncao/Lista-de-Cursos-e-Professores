package src.main.modules;

import java.util.List;

public class Curso {
    String nome;
    String descricao;
    List<Professor> professores;
    Double cargaHoraria;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void progresso() {
        System.out.println("Progresso do curso: Acompanhamento em andamento.");
    }

    public void notas() {
        System.out.println("Notas dos alunos: Ainda não disponíveis.");
    }

    public void participacao() {
        System.out.println("Participação dos alunos: Acompanhamento em andamento.");
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Descrição: " + descricao;
    }
}
