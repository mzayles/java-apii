package Vetor;
import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int numeros[] = new int[10];

        System.out.println("\n------------------- Populando Números -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %d° número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n------------------- Listando Números -------------------");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("\nDados do %d° número: [%d]\n", i+1, numeros[i]);
            System.out.printf("Dobro: %d | Triplo: %d\n", (numeros[i] * 2), (numeros[i] * 3));
        }

        sc.close();
    }
}
