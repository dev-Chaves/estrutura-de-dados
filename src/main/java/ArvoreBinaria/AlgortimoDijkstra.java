package ArvoreBinaria;

import java.security.InvalidParameterException;
import java.util.*;

public class AlgortimoDijkstra {
    private int vertices[][];

    public AlgortimoDijkstra(final int numVertices){
        vertices = new int[numVertices][numVertices];
    }

    public void criarAresta(final int noOrigem, final int noDestino, final int peso){
        if(peso >= 1){
            vertices[noOrigem][noDestino] = peso;
            vertices[noDestino][noOrigem] = peso;
        } else {
            throw new InvalidParameterException("O peso do nó origem"+noOrigem +"para o no destino"+ noDestino+ " não pode ser negativo");
        }
    }

    public int getCusto(final int noOrigem, final int noDestino){
        return vertices[noOrigem][noOrigem];
    }

    private int getMaisProximo(final int listaCustos[], final Set<Integer> naoVisitados){

        int minDistancia = Integer.MAX_VALUE;
        int noProximo = 0;

        for (Integer i : naoVisitados ) {
            if(listaCustos[i] < minDistancia){
                minDistancia = listaCustos[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    private List<Integer> getVizinhos(final int no){

        List<Integer> vizinhos = new ArrayList<>();

        for(int i=0; i< vertices.length; i++){
            if(vertices[no][i] > 0){
                vizinhos.add(i);
            }
        }

        return vizinhos;
    }

    public List<Integer> caminhoMaisProximo (final int antecessor[], int noMaisProximo){

        List<Integer> caminho = new ArrayList<>();
        caminho.add(noMaisProximo);

        while (antecessor[noMaisProximo] != -1){
            caminho.add(antecessor[noMaisProximo]);
            noMaisProximo = antecessor[noMaisProximo];
        }

        Collections.reverse(caminho);
        return caminho;
    }


    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino){

        int custo[] = new int[vertices.length];

        int antecessor[] = new int[vertices.length];

        Set<Integer> naoVisitados = new HashSet<>();

        custo[noOrigem] = 0;

        for (int v = 0; v<vertices.length ; v++) {
            if(v != noOrigem){
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVisitados.add(v);
        }

        while (!naoVisitados.isEmpty()){
            int noMaisProximo = getMaisProximo(custo, naoVisitados);

            naoVisitados.remove(noMaisProximo);

            for(Integer vizinhos: getVizinhos(noMaisProximo)){
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);

                if(custoTotal < custo[vizinhos]){
                    custo[vizinhos] = noMaisProximo;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }

            if(noMaisProximo == noDestino){
//                caminhoMaisProximo()
            }

        }


        return null;
    }



}
