package List.pilha;

public class Pilhas {

    private int[] dados;
    private int top;

    public Pilhas(int capacidade) {
        dados = new int[capacidade];
        top = -1;
    }
    public void push(int valor){
        if (top == dados.length-1){
            throw new RuntimeException("OverFlow");
        }
        dados[++top] = valor;
    }
    public int pop(int valor){
        if(top == -1){
            throw new RuntimeException("UnderFlow");
        }
        return dados[--top];
    }
    public int peek(){
        return dados[top--];
    }
}
