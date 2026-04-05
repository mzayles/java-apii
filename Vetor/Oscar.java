package Vetor;

public class Oscar {
    public static void main(String[] args) {
        String filmes[] = {"Uma Batalha Após a Outra", "Anora", "Oppenheimer", "Tudo em Todo Lugar ao Mesmo Tempo", "No Ritmo do Coração", "Nomadland", "Parasita", "Green Book: O Guia", "A Forma da Água", "Moonlight: Sob a Luz do Luar"};

        int anos[] = {2026, 2025, 2023, 2023, 2022, 2021, 2020, 2019, 2018, 2017};

        String diretores[] = {"Paul Thomas Anderson", "Sean Baker", "Christopher Nolan", "Daniel Kwan e Daniel Scheinert", "Siân Heder", "Chloé Zhao", "Bong Joon-ho", "Peter Farrelly", "Guillermo del Toro", "Barry Jenkins"};
        
        System.out.println("\n--------------- Os 10 Últimos Vencedores de 'Melhor Filme' do Oscar ---------------\n");
        for(int i = 0; i < filmes.length; i++) {
            System.out.printf("Filme: %s \nDiretor: %s \nAno vencedor: %d \n\n", filmes[i], diretores[i], anos[i]);
        }
    }
} 
