package ExerciciosDeSala.capitulo8.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Faroeste Coboclo", 8);

        Membro membro = new Membro("Renato Russo", "Vocalista");
        Empresario empresario = new Empresario("Joao Carlos", 1231241L);

        Banda banda = new Banda("Legião Urbana", "Rock");
        banda.addMembroNovo(membro);
        banda.addMusicaNova(musica);
        banda.empresario = empresario;
        banda.mostraInfo();
    }
}
