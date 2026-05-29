package ExerciciosDeSala.capitulo9;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println(nome + " foi adicionado ao carrinho de compras!");
    }

    public void calculaValorTotalCompra() {
        System.out.println("O valor total da compra do brownie " + nome + " é R$ " + preco);
    }

    public void mostraInfo() {
        System.out.println("--- Informações do Brownie ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Sabor: " + sabor);
        System.out.println("-----------------------------");
    }
}
