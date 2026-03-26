package ExerciciosDeSala.capitulo4.Exercicio1;

public class Musica {
    private String nome;
    private double duracaoSegundos;

    public Musica(String nome, double duracaoSegundos) {
        this.nome = nome;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(double duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }
}
