package OrdenacaoSelecao;
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

        selectionSort(caracteres);
        saida(caracteres);

        sc.close();
    }

    public static void selectionSort(char caracteres[]) {

    }

    public static void saida(char caracteres[]) {
        
    }
}
