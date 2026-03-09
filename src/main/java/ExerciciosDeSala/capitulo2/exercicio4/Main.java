package ExerciciosDeSala.capitulo2.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota da NPA: ");
        final short NPA =  input.nextShort();

        if(NPA < 30){
            System.out.println("O aluno foi reprovado.");
        }
        else if(NPA < 60) {
            System.out.print("Informe a nota da NFA: ");
            final short NFA = input.nextShort();

            if((NFA+NPA)/2 < 50) {
                System.out.println("O aluno foi reprovado.");
            }
            else {
                System.out.println("O aluno foi aprovado com sucesso!");
            }
        }
        else if(NPA <= 100) {
            System.out.println("O aluno foi aprovado com sucesso!");
        }
        else {
            System.out.println("Digite um nota valida.");
        }

    }
}
