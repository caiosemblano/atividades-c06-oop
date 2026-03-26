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
        System.out.println("Nome: " + nome + "\n");
        System.out.println("Genero: " + genero + "\n");
        System.out.println("Empresario: " + empresario.getNome() + "\n");

        System.out.print("Membros: ");
        for (Membro membro : membros) {
            System.out.print(membro.getNome() + ", ");
        }
        System.out.println(". \n");

        System.out.print("Musicas: ");
        for (Musica musica : musicas) {
            System.out.print(musica.getNome() + ", ");
        }
        System.out.println("\n");
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
