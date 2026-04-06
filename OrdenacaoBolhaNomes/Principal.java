package OrdenacaoBolhaNomes;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos nomes completos deseja ordenar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        String nomes[] = new String[quantidade];

        System.out.println("\n------------------- Populando Nomes -------------------\n");
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("\t%d° nome: ", i+1);
            nomes[i] = sc.nextLine();
        }

        bsort(nomes);
        saida(nomes);

        sc.close();
    }

    public static void bsort(String nomes[]) {
        String aux;

        for(int i = 0; i < nomes.length - 1; i++) {
            for(int j = 0; j < nomes.length - (i + 1); j++) {
                if(nomes[j].compareTo(nomes[j + 1]) > 0) {
                    aux = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = aux;
                }
            }
        }
    }

    public static void saida(String nomes[]) {
        System.out.println("\n------------------- Ordenando Nomes -------------------\n");
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("\t%s\n", nomes[i]);
        }
    }
}
