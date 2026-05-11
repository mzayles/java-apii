package OrdenacaoInsercaoSalarios;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        
        double salarios[] = new double[tamanho];
        
        System.out.println("\n---------------- Populando Salários ----------------\n");
        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("Informe o %d° salário: ", i+1);
            salarios[i] = sc.nextDouble();
        }
        
        System.out.println("\n---------------- Listando Salários Desordenados ----------------\n");
        saida(salarios);

        System.out.println("---------------- Listando Salários Ordenados com Acréscimo de 15% ----------------\n");
        ordenacaoInsercao(salarios);
        saida(salarios);
        
        sc.close();
    }
    
    static void ordenacaoInsercao(double vetor[]) {
        int i, j;
        double aux;
        
        for(i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            
            while(j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            
            vetor[j + 1] = aux;
        }
        
        for(i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * 1.15;
        } 
    }
    
    static void saida(double vetor[]) {
        System.out.println(Arrays.toString(vetor));
        System.out.println("\n");
    }
}
