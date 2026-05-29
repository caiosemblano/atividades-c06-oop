package ExerciciosDeSala.capitulo9;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println(nome + " está adicionando Nutella extra no brownie!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("O Brownie de Nutella (" + nome + ") com muito creme de avelã foi adicionado ao carrinho de compras!");
    }
}
