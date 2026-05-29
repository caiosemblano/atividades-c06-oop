package ExerciciosDeSala.capitulo8.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private String genero;
    public List<Membro> membros = new ArrayList<>();
    public List<Musica> musicas = new ArrayList<>();
    public Empresario empresario;

    public void mostraInfo() {
        System.out.println("Banda de nome: " + nome);
        System.out.println("Do genero: " + genero);

        System.out.println("\n Banda formada pelos membros: ");
        for (Membro membro : membros) {
            System.out.println(membro.getNome());
        }

        System.out.println("\n Essa banda compos as musicas: ");
        for(Musica musica : musicas){
            System.out.println(musica.getNome());
        }

        System.out.println("\n Banda agenciada pelo empresario(a) " + empresario.getNome());

    }

    public void addMusicaNova(Musica musica) {
        musicas.add(musica);
        System.out.println("Música adicionada com sucesso!");
    }

    public void addMembroNovo(Membro membro) {
        membros.add(membro);
        System.out.println("Membro adicionado com sucesso!");
    }

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }
}







