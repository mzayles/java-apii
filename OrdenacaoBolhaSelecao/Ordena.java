package OrdenacaoBolhaSelecao;

public class Ordena {
    public static void ordenacaoBolha(int numeros[]) {
        int aux;

        for(int i = 0; i < numeros.length - 1; i++) {
            for(int j = 0; j < numeros.length - (i + 1); j++) {
                if(numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenacaoSelecao(int numeros[]) {
        int min;
        int aux;

        for(int i = 0; i < numeros.length - 1; i++) {
            min = i;
            
            for(int j = (i + 1); j < numeros.length; j++) {
                if(numeros[j] < numeros[min]) {
                    min = j;
                }
            }

            if(i != min) {
                aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }
        }

    }

    public static void saida(int numeros[]) {
        System.out.println("\n\n------------------- Listando Números Ordenados -------------------\n");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("\t[%d] - ", numeros[i]);
        }
        System.out.println("\n");
    }
}
