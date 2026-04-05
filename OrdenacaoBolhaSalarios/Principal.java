package OrdenacaoBolhaSalarios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos salários inteiros deseja ordenar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        double salarios[] = new double[quantidade];

        System.out.println("\n------------------- Populando Salários -------------------\n");
        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("\t%d° salário: ", i+1);
            salarios[i] = sc.nextInt();
        }

        bsort(salarios);
        saida(salarios, quantidade);

        sc.close();
    }

    public static void bsort(double salarios[]) {
        double aux;

        for(int i = 0; i < salarios.length; i++) {
            for(int j = 0; j < salarios.length - 1; j++) {
                if(salarios[j] > salarios[j + 1]) {
                    aux = salarios[j];
                    salarios[j] = salarios[j + 1];
                    salarios[j + 1] = aux;
                }
            }
        }
    }

    public static void saida(double salarios[], int quantidade) {
        double soma = 0;

        System.out.println("\n------------------- Ordenando Salários -------------------\n");
        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("\t%.2f - ", salarios[i]);
        }
        System.out.println("\n");

        System.out.println("------------------- Acréscimo de 15% -------------------\n");
        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("\t%.2f - ", salarios[i] * 1.15);
        }
        System.out.println("\n");

        System.out.println("------------------- Somátorio e Média -------------------\n");
        for(int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }

        double media = soma / quantidade;

        System.out.printf("\tSoma: %.2f \n\tMédia: %.2f", soma, media);
    }
}
