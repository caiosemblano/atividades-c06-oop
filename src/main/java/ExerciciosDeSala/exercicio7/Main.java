package ExerciciosDeSala.exercicio7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int chute;
        int randomNum = rand.nextInt(10) + 1;;
        do {
            System.out.print("Digite um número de 1 a 10: ");
            chute = input.nextInt();
            if(chute > randomNum) {
                System.out.println("Um pouco menos...");
            }
            else if (chute < randomNum) {
                System.out.println("Um pouco mais...");
            }
        } while (chute != randomNum);

        System.out.println("Parabens! Você acertou!!");
    }
}
