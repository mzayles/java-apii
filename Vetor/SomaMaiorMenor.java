package Vetor;
import java.util.Scanner;

public class SomaMaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        sc.nextLine();

        int numeros[] = new int[tamanho];

        System.out.println("\n------------------- Populando Números -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %d° número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        float soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            if(numeros[i] < menor) {
                menor = numeros[i];
            }

            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\n------------------- Listando Números -------------------\n");
        for(int i = 0; i < tamanho; i++) {
            if(numeros[i] == maior) {
                System.out.printf("\tNúmero [%d] = [%d] <-- Menor valor\n", i, numeros[i]);
            } else if(numeros[i] == menor) {
                System.out.printf("\tNúmero [%d] = [%d] <-- Maior valor\n", i, numeros[i]);
            } else {
                System.out.printf("\tNúmero [%d] = [%d]", i, numeros[i]);
            }
        }

        float media = soma / tamanho;

        System.out.println("\n------------------- Listando Derivados -------------------\n");
        System.out.printf("\tSoma: %.2f \n\tMédia %.2f", soma, media);
    
        sc.close();
    }
}
