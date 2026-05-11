package OrdenacaoInsercao;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        sc.nextLine();

        int vetor[] = new int[tamanho];

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %dº número inteiro: ", i+1);
            vetor[i] = sc.nextInt();
        }
    }
}
