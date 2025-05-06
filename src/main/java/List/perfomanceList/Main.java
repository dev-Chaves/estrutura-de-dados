package List.perfomanceList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> testeArr = new ArrayList<>();

        LinkedList<Integer> testeLinkedList = new LinkedList<>();

        for (int i=0; i<10000000; i++){
            testeArr.add(i);
            testeLinkedList.add(i);
        }

        long tempArr = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            testeArr.get(i * 100);
        }
        long tempFinal = System.currentTimeMillis();

        long tempLinkedList = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            testeLinkedList.get(i * 100);
        }
        long tempFinalLinkedList = System.currentTimeMillis();

        System.out.println("Array List - tempo de acesso: "+ (tempFinal - tempArr) + "ms");
        System.out.println("Linked List - tempo de acesso: "+ (tempFinalLinkedList - tempLinkedList) + "ms");

    }
}
