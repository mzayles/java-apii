package OrdenacaoBolhaNumeros;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números inteiros deseja ordenar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        int numeros[] = new int[quantidade];

        System.out.println("\n------------------- Populando Números -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("\t%d° número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        bsort(numeros);
        saida(numeros);

        sc.close();
    }

    public static void bsort(int numeros[]) {
        int aux;

        for(int i = 0; i < numeros.length - 1; i++) {
            for(int j = 0; j < numeros.length - (i + 1); j++) {
                if(numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    } 

    public static void saida(int numeros[]) {
        System.out.println("\n------------------- Ordenando Números -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("%d - ", numeros[i]);
        }
        System.out.println("\n");
    } 
}
