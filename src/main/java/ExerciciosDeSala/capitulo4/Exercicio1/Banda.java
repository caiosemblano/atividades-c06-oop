package ExerciciosDeSala.capitulo4.Exercicio1;



import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private String genero;
    private Empresario empresario;
    private List<Membro> membros = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Empresario: " + empresario);
        System.out.println("Membros: " + membros.toString());
        System.out.println("Musicas: " + musicas.toString());
    }

    public void addMembro(Membro membro) {
        this.membros.add(membro);
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
}
