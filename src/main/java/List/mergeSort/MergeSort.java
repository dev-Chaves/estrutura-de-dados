package Arrays.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,9,3,2,8,4,6,7,5};

        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        int[] ordernado = mergeSort(arr);
        System.out.println(Arrays.toString(ordernado));

    }

    public static int[] mergeSort(int[]arr){

        if ( arr == null||arr.length <= 1){
            return arr;
        }

        int meio = arr.length/ 2;

        int[] esquerda = mergeSort(Arrays.copyOfRange(arr, 0, meio));

        int[] direita = mergeSort(Arrays.copyOfRange(arr, meio, arr.length));

        return intercala(esquerda, direita);
    }

    public static int[] intercala(int[] esquerda, int[] direita) {
        int i = 0, j = 0, k=0;

        int[] resultado = new int[esquerda.length + direita.length];

        while (i < esquerda.length && j < direita.length) {

            if (esquerda[i] < direita[j]) {
                resultado[k++] = esquerda[i++];
            } else {
                resultado[k++]= direita[j++];
            }
        }
        while (i<esquerda.length){
            resultado[k++] = esquerda[i++];
        }
        while (j<direita.length){
            resultado[k++] = direita[j++];
        }
        return resultado;
    }
}
