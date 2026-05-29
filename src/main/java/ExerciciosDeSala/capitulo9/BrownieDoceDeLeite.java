package ExerciciosDeSala.capitulo9;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println(nome + " está adicionando doce de leite cremoso no brownie!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("O Brownie de Doce de Leite (" + nome + ") com doce de leite caseiro de Minas foi adicionado ao carrinho de compras!");
    }
}
