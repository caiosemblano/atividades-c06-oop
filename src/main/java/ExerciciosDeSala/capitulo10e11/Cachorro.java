package ExerciciosDeSala.capitulo10e11;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Cachorro!!!!!!!!!!!!!!!!!!!!");
    }

}
