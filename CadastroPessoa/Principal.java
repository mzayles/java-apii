package pacote;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        
        int vetor[] = new int[tamanho];
        
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(tamanho);
        }
        
        System.out.println("\n------------------- Listando Vetor Desordenado -------------------\n");
        saida(vetor);
     
        System.out.println("\n------------------- Listando Vetor Ordenado -------------------\n");
        ordenacaoInsercao(vetor);
        saida(vetor);
        
        sc.close();
    }
    
    public static void ordenacaoInsercao(int vetor[]) {
        int aux;
        
        for(int i = 0; i < vetor.length; i++) {
            aux = vetor[i];
            int j = i - 1;
            
            while(j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            
            vetor[j + 1] = aux;
        }
    }
    
    public static void saida(int vetor[]) {
        System.out.println(Arrays.toString(vetor));
        System.out.println("\n");
    }
}
