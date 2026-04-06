package OrdenacaoBolhaSelecao;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Informe quantos números inteiros deseja ordenar: ");
        int quantidade = sc.nextInt();

        System.out.print("Informe a aleatoriedade dos números: ");
        int aleatoriedade = sc.nextInt();

        System.out.println("\nEscolha o método de ordenação: \n\n\t[1] Método Bolha \n\t[2] Método Seleção");
        int opcao = sc.nextInt();

        sc.nextLine();

        int numeros[] = new int[quantidade];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(aleatoriedade);
        }

        System.out.println("\n------------------- Listando Números Desordenados -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("\t[%d] - ", numeros[i]);
        }

        Ordena obj = new Ordena();

        if(opcao == 1) {
            obj.ordenacaoBolha(numeros);
            obj.saida(numeros);
        } else {
            obj.ordenacaoSelecao(numeros);
            obj.saida(numeros);
        }

        sc.close();
    }
}
