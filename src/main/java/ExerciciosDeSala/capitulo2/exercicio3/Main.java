package ExerciciosDeSala.capitulo2.exercicio3;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite quantos lanches foram consumidos na primeira hora: ");
    int firstHour =  teclado.nextInt();
    System.out.print("Digite quantos lanches foram consumidos na Segunda hora: ");
    int secondHour = teclado.nextInt();
    System.out.print("Digite quantos lanches foram consumidos na Terceira hora: ");
    int thirdHour = teclado.nextInt();

    System.out.println("O total de lanches consumidos foi: " + (firstHour+secondHour+thirdHour));
    System.out.println("A media de lanches consumidos por hora foi: " + (firstHour+secondHour+thirdHour)/3.0);




    }
}
