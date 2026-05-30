package ExerciciosDeSala.capitulo10e11;

public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Lontra");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra está nadando!");
    }
}
