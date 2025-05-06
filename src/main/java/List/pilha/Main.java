package List.pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> strings = new Stack<>();

        Pilhas pilhas = new Pilhas(10);

        pilhas.push(10);
        pilhas.push(10);
        pilhas.push(10);
        pilhas.push(20);

        strings.add(1);
        strings.add(1);
        strings.add(4);
        strings.add(6);
        strings.add(7);

        System.out.println(strings.peek());
        System.out.println(pilhas.peek());


    }
}
