package ExerciciosDeSala.capitulo4.Exercicio2;

public class Campo {
    protected boolean[][] visitado = new  boolean[3][3];

    public Campo() {
        for(int i=0; i< visitado.length; i++){
            for(int j=0; j<visitado[0].length; j++){
                visitado[i][j] = false;
            }
        }
    }
}
