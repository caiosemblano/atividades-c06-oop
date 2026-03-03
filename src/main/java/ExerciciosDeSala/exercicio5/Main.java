package ExerciciosDeSala.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nAlunos = input.nextInt();

        switch(nAlunos){
            case 10, 20:
                System.out.println("A sala I-6 poderá ser utilizada.");
                break;
            case 30:
                System.out.println("A sala I-5 deverá ser utilizada.");
                break;
            default:
                System.out.println("A turma não possui o número mínimo de alunos.");
                break; // Não sei se era pra ser isso
        }
    }
}
