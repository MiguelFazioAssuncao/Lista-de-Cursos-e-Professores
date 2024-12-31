package src.main.modules;

public class Professor {
    String nome;
    String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando " + disciplina + ".");
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", Disciplina: " + disciplina;
    }
}
