package CalculadoraIMC;

public class CalculaIMC {
    double peso;
    double altura;

    public double calcularImc(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public String imprimirClassificacao(double imc) {
        if (imc < 18.5) {
            return "Baixo peso.";
        } else if (imc < 25) {
            return "Peso normal.";
        } else if (imc < 30) {
            return "Sobrepeso."; 
        } else {
            return "Obesidade.";
        }
    }
}
