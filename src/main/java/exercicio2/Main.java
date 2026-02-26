package exercicio2;

public class Main {
    public static void main(String[] args) {
        final short valorInteira = 30;
        final short valorMeia = valorInteira / 2;

        short inteirasVendidas = 8;
        short meiasVendidas = 5;

        System.out.println("Total arrecadado pelas Inteiras vendidas: " + inteirasVendidas * valorInteira);
        System.out.println("Total arrecadado pelas Meias vendidas: " + meiasVendidas * valorMeia);
        final int receitaTotal = (inteirasVendidas * valorInteira + meiasVendidas * valorMeia);
        System.out.println("Total arrecadado foi: " + receitaTotal);
        System.out.println("Media por ingresso vendido: " + (receitaTotal/(inteirasVendidas+meiasVendidas)));


    }
}
