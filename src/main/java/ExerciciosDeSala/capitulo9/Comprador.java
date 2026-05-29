package ExerciciosDeSala.capitulo9;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        System.out.println("=== Comprador " + nome + " Efetuando Compra ===");
        System.out.println("Comprador: " + nome + " está iniciando a compra do brownie: " + brownie.nome);
        
        // O próprio brownie invoca o método addCarrinhoDeCompras() e calculaValorTotalCompra()
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        
        if (this.saldo >= brownie.preco) {
            this.saldo -= brownie.preco;
            System.out.println("Sucesso! " + nome + " comprou " + brownie.nome + " por R$ " + brownie.preco + ".");
            System.out.println("Saldo restante de " + nome + ": R$ " + this.saldo);
        } else {
            System.out.println("Erro! Saldo insuficiente para realizar a compra.");
            System.out.println("Preço do " + brownie.nome + ": R$ " + brownie.preco + " | Saldo de " + nome + ": R$ " + this.saldo);
        }
        System.out.println("==============================================\n");
    }
}
