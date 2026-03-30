package ExerciciosDeSala.capitulo4.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Campo campo = new Campo();
        Bomba bomba = new Bomba();
        Scanner input = new Scanner(System.in);
        boolean mapCompleted = false;
        int mortes = 0;
        short stepX;
        short stepY;
        short quantNaoVisitadas;

        while(!mapCompleted) {
            System.out.println("Digite um valor entre 0 e 2 para ser sua coordenada X: ");
            stepX = input.nextShort();
            System.out.println("Digite um valor entre 0 e 2 para ser sua coordenada Y: ");
            stepY = input.nextShort();
            campo.visitado[stepX][stepY] = true;

            if(stepY == Bomba.y &&  stepX == Bomba.x){
                mortes++;
                System.out.println("Você pisou na Bomba!");
                System.out.println("+1 Morte!! \n");
                System.out.println("Mortes: " + mortes);
            }


            System.out.println("Coordenadas visitadas:");
            quantNaoVisitadas = 0;
            for(int i=0; i< campo.visitado.length; i++){
                for(int j=0; j< campo.visitado[0].length; j++){
                    System.out.print(campo.visitado[i][j] + " ");
                    if(!campo.visitado[i][j]){
                        quantNaoVisitadas++;
                    }
                }
                System.out.println();
            }
            if(quantNaoVisitadas == 0){
                mapCompleted = true;
                System.out.println("Você ganhou!!");
            }
        }

    }
}
