package ExerciciosDeSala.capitulo4.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("Ramones", "Punk Rock");
        Empresario empresario = new Empresario("Cara do bar CBGB (New York)", 2131230123021L);
        Membro membro1 = new Membro("Jeffrey Ross Hyman", "Vocalista Principal");
        Membro membro2 = new Membro("John William Cummings", "Guitarrista");
        Membro membro3 = new Membro("Douglas Colvin", "Baixista");
        Membro membro4 = new Membro("Thomas Erdelyi", "Baterista");
        Musica musica1 = new Musica("Pet Sematary", 198);
        Musica musica2 = new Musica("Blitzkrieg Bop", 134);
        Musica musica3 = new Musica("I Wanna Be Your Boyfriend", 144);

        banda.setEmpresario(empresario);

        banda.addMembro(membro1);
        banda.addMembro(membro2);
        banda.addMembro(membro3);
        banda.addMembro(membro4);

        banda.addMusica(musica1);
        banda.addMusica(musica2);
        banda.addMusica(musica3);

        banda.mostraInfo();
    }
}
