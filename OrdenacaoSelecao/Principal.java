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
        int min;
        char aux;

        for(int i = 0; i < caracteres.length; i++) {
            min = i;

            for(int j = (i + 1); j < caracteres.length; j++) {
                if(caracteres[j] < caracteres[min]) {
                    min = j;
                }
            }

            if(i != min) {
                aux = caracteres[i];
                caracteres[i] = caracteres[min];
                caracteres[min] = aux;
            }
        }
    }

    public static void saida(char caracteres[]) {
        System.out.println("\n------------------- Ordenando Caracteres -------------------\n");
        
        for(int i = 0; i < caracteres.length; i++) {
            System.out.printf("\t[%c] ", caracteres[i]);
        }
        System.out.println("\n");
    }
}
