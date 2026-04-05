package Vetor;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        sc.nextLine();

        String nomes[] = new String[tamanho];

        System.out.println("\n------------------- Populando Nomes -------------------");
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("Informe o %d° nome: ", i+1);
            nomes[i] = sc.nextLine();
        }

        System.out.println("\n------------------- Listando Nomes -------------------");
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("%d° nome: %s \n", i+1, nomes[i]);
        }

        System.out.println("\n------------------- Listando Nomes -------------------");
        for(String nome: nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}