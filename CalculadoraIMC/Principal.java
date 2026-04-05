package CalculadoraIMC;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas que deseja calcular o IMC: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        CalculaIMC obj[] = new CalculaIMC[quantidade];

        System.out.println("\n------------------- Populando Dados -------------------");
        for(int i = 0; i < obj.length; i++) {
            obj[i] = new CalculaIMC();

            System.out.printf("\n\t* %d° pessoa \n", i+1);

            System.out.print("\tPeso: ");
            obj[i].peso = sc.nextDouble();

            System.out.print("\tALtura: ");
            obj[i].altura = sc.nextDouble() / 100;
        }

        System.out.println("\n------------------- Listando Dados -------------------");
        for(int i = 0; i < obj.length; i++) {
            double imc = obj[i].calcularImc(obj[i].peso, obj[i].altura);
            String classificacao = obj[i].imprimirClassificacao(imc);

            System.out.printf("\n\t* Pessoa: %d", i+1);
            System.out.println("\n\tPeso: " + obj[i].peso);
            System.out.println("\tAltura: " + obj[i].altura);
            System.out.printf("\tIMC: %.2f", imc);
            System.out.println("\n\tClassificação: " + classificacao);
        }

        sc.close();
    }
}
