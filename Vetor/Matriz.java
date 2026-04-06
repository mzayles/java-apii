package Vetor;

public class Matriz {
    public static void main(String[] args) {
        int vetor[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor[i].length; j++) {
                System.out.print(vetor[i][j] + " ");
            }
            System.out.println("\n");
        }

        for(int[] linha: vetor) {
            for(int valor: linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
