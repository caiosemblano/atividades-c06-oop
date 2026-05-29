package ExerciciosDeSala.capitulo9;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println(nome + " está adicionando café espresso concentrado no brownie!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("O Brownie de Café (" + nome + ") com um aroma irresistível de café espresso foi adicionado ao carrinho!");
    }
}
