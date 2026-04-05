package OrdenacaoBolha;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos caracteres deseja ordenar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        char caracteres[] = new char[quantidade];

        System.out.println("\n------------------- Populando Caracteres -------------------\n");
        for(int i = 0; i < caracteres.length; i++) {
            System.out.printf("\t%d° caractere: ", i+1);
            caracteres[i] = sc.nextLine().charAt(0);
        }

        bsort(caracteres);
        saida(caracteres);

        sc.close();
    }

    public static void bsort(char caracteres[]) {
        char aux;

        for(int i = 0; i < caracteres.length; i++) {
            for(int j = 0; j < caracteres.length - 1; j++) {
                if(caracteres[j] > caracteres[j + 1]) {
                    aux = caracteres[j];
                    caracteres[j] = caracteres[j + 1];
                    caracteres[j + 1] = aux;
                }
            }
        }
    }

    public static void saida(char caracteres[]) {
        System.out.println("\n------------------- Listando Caracteres -------------------\n");
        for(int i = 0; i < caracteres.length; i++) {
            System.out.printf("%c -> ", caracteres[i]);
        }
        System.out.println("\n");

    }
}
