package Exemplos;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Tarefas> filaTarefa = new PriorityQueue<>();

        filaTarefa.add(new Tarefas("Tarefa 1", 1));
        filaTarefa.add(new Tarefas("Tarefa 2", 2));

        System.out.println("Prioridade das tarefas");
        while (filaTarefa.isEmpty()){
            System.out.println(filaTarefa.poll());
        }



    }
}
