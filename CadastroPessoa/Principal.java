package CadastroPessoa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas que deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        if(quantidade > 5) {
            System.out.println("Informe a quantidade de ATÉ 5 pessoas, não mais.");
        } else {
            Pessoa listaPessoas[] = new Pessoa[quantidade];

            System.out.println("\n------------------- Populando Pessoas -------------------");
            for(int i = 0; i < listaPessoas.length; i++) {
                listaPessoas[i] = new Pessoa();

                System.out.printf("\n\t* Pessoa [%d]", i+1);
                System.out.print("\n\tNome: ");
                listaPessoas[i].nome = sc.nextLine();

                System.out.print("\tEndereço: ");
                listaPessoas[i].endereco = sc.nextLine();

                System.out.print("\tTelefone: ");
                listaPessoas[i].telefone = sc.nextLine();

                System.out.print("\tCidade: ");
                listaPessoas[i].cidade = sc.nextLine();

                System.out.print("\tEstado: ");
                listaPessoas[i].estado = sc.nextLine();

                System.out.print("\tCEP: ");
                listaPessoas[i].CEP = sc.nextLine();

                System.out.print("\tRG: ");
                listaPessoas[i].RG = sc.nextLine();
                
                System.out.print("\tCPF: ");
                listaPessoas[i].CPF = sc.nextLine();

                System.out.print("\tIdade: ");
                listaPessoas[i].idade = sc.nextInt();

                sc.nextLine();
            }

            System.out.println("\n------------------- Listando Pessoas -------------------");
            for(int i = 0; i < listaPessoas.length; i++) {
                System.out.printf("\n\t* Pessoa [%d]", i+1);
                System.out.println("\n\tNome: " + listaPessoas[i].nome);
                System.out.println("\tEndereço: " + listaPessoas[i].endereco);
                System.out.println("\tTelefone: " + listaPessoas[i].telefone);
                System.out.println("\tCidade: " + listaPessoas[i].cidade);
                System.out.println("\tEstado: " + listaPessoas[i].estado);
                System.out.println("\tCEP: " + listaPessoas[i].CEP);
                System.out.println("\tRG: " + listaPessoas[i].RG);
                System.out.println("\tCPF: " + listaPessoas[i].CPF);
                System.out.println("\tIdade: " + listaPessoas[i].idade);
            }
        }

        sc.close();
    }
}
