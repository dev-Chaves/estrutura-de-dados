package Exemplos;

public class Tarefas implements Comparable<Tarefas> {

    String nome;
    int prioridade;

    public Tarefas(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }

    @Override
    public int compareTo(Tarefas o) {
        return Integer.compare(this.prioridade, o.prioridade);
    }
}
