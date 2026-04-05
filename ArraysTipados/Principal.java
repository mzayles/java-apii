package ArraysTipados;

public class Principal {
    public static void main(String[] args) {
        Pessoa listaPessoas[] = new Pessoa[3];

        listaPessoas[0] = new Pessoa();
        listaPessoas[0].nome = "Mariana";
        listaPessoas[0].email = "mariana@gmail.com";
        listaPessoas[0].telefone = "(11) 99999-9999";
        listaPessoas[0].idade = 19;

        listaPessoas[1] = new Pessoa();
        listaPessoas[1].nome = "Mariana";
        listaPessoas[1].email = "mariana@gmail.com";
        listaPessoas[1].telefone = "(11) 99999-9999";
        listaPessoas[1].idade = 19;
        
        listaPessoas[2] = new Pessoa();
        listaPessoas[2].nome = "Mariana";
        listaPessoas[2].email = "mariana@gmail.com";
        listaPessoas[2].telefone = "(11) 99999-9999";
        listaPessoas[2].idade = 19;

        for(int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n------------------- Listando Dados [%d° Pessoa] -------------------\n", i+1);
            System.out.println("\tNome: " + listaPessoas[i].nome);
            System.out.println("\tE-mail: " + listaPessoas[i].email);
            System.out.println("\tTelefone: " + listaPessoas[i].telefone);
            System.out.println("\tIdade: " + listaPessoas[i].idade);
        }
    }
}
