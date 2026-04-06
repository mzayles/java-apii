package OrdenacaoSelecaoNumeros;
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
        
        sc.close();

        selectionSort(numeros);
        saida(numeros);
    }

    public static void selectionSort(int numeros[]) {
        int min = 0;
        int aux = 0;

        for(int i = 0; i < numeros.length; i++) {
            min = i;

            for(int j = (i + 1); j < numeros.length; j++) {
                if(numeros[j] < numeros[min]) {
                    min = j;
                }
            }

            if(i != min) {
                aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux; 
            }
        }
    }

    public static void saida(int numeros[]) {
        System.out.println("\n------------------- Listando Números -------------------\n");
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("\t[%d] ", numeros[i]);
        }
        System.out.println("\n");
    }
}
