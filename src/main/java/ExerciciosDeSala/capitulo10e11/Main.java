package ExerciciosDeSala.capitulo10e11;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[3];

        mamiferos[0] = new Cachorro("Rex", 100.0);
        mamiferos[1] = new Boi("Bebeto", 250.0);
        mamiferos[2] = new Lontra("Lulu", 80.0);

        System.out.println("=== Informações dos Mamíferos ===");
        for (Mamifero m : mamiferos) {
            if (m != null) {
                m.mostraInfo();
                m.emitirSom();
                System.out.println("---------------------------");
            }
        }
    }

}
