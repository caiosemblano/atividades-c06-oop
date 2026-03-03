package AtividadesComNota.Exercicio1;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da Inteira: ");
        String inputInteira = input.next();
        System.out.print("Digite o valor da Meia-entrada: ");
        String inputMeia = input.next() ;

        inputInteira = inputInteira.replace(",",".");
        inputMeia = inputMeia.replace(",",".");

        double valorInteira = Double.parseDouble(inputInteira);
        double valorMeia = Double.parseDouble(inputMeia);

        System.out.print("Digite quantas Inteiras foram vendidas: ");
        int inteirasVendidas = input.nextInt();
        System.out.print("Digite quantas meias-entradas foram vendidas: ");
        int meiasVendidas = input.nextInt();

        System.out.println("Total arrecadado pelas Inteiras vendidas: " + inteirasVendidas * valorInteira);
        System.out.println("Total arrecadado pelas Meias vendidas: " + meiasVendidas * valorMeia);
        double receitaTotal = (inteirasVendidas * valorInteira + meiasVendidas * valorMeia);
        System.out.println("Total arrecadado foi: " + receitaTotal);
        System.out.println("Media por ingresso vendido: " + (receitaTotal/(inteirasVendidas+meiasVendidas)));
    }
}
