package ExerciciosDeSala.capitulo12.Exercicio2;

public abstract class Produto implements Comparable<Produto> {
    private String nome;
    private int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Integer.compare(outro.getPreco(), this.preco);
    }

    @Override
    public String toString() {
        return String.format("%s {Nome: '%s', Preço: %d}", this.getClass().getSimpleName(), nome, preco);
    }
}
