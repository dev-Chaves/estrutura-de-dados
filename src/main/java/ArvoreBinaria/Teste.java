package ArvoreBinaria;

public class Teste {
    public static void main(String[] args) {
        Arvore arvore = new Arvore(new Folha(4));

        arvore.inserir(new Folha(3));
        arvore.inserir(new Folha(2));
        arvore.inserir(new Folha(1));
        arvore.inserir(new Folha(10));


    }
}
