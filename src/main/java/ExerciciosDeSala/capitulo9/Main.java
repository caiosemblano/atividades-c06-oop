package ExerciciosDeSala.capitulo9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INÍCIO DOS TESTES - EXERCÍCIOS CAPÍTULO 9 ===\n");

        // 1. Instanciação dos Brownies (Exercício 1)
        BrownieNutella bNutella = new BrownieNutella("Brownie Nutella Premium", 8.50, "Nutella & Chocolate");
        BrownieDoceDeLeite bDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite Real", 7.00, "Doce de Leite Suave");
        BrownieCafe bCafe = new BrownieCafe("Brownie Café do Produtor", 9.50, "Café com Cacau 70%");

        // 2. Testando comportamento básico e métodos específicos (Exercício 1)
        System.out.println("--- Testando mostraInfo() e métodos específicos ---");
        bNutella.mostraInfo();
        bNutella.adicionaNutella();
        System.out.println();

        bDoceDeLeite.mostraInfo();
        bDoceDeLeite.adicionaDoceDeLeite();
        System.out.println();

        bCafe.mostraInfo();
        bCafe.adicionaCafe();
        System.out.println();

        // 3. Testando a sobrescrita de addCarrinhoDeCompras() e calculaValorTotalCompra() (Exercício 2)
        System.out.println("--- Testando addCarrinhoDeCompras() (Sobrescrito) e calculaValorTotalCompra() ---");
        bNutella.addCarrinhoDeCompras();
        bNutella.calculaValorTotalCompra();
        System.out.println();

        bDoceDeLeite.addCarrinhoDeCompras();
        bDoceDeLeite.calculaValorTotalCompra();
        System.out.println();

        bCafe.addCarrinhoDeCompras();
        bCafe.calculaValorTotalCompra();
        System.out.println();

        // 4. Testando o fluxo de compras do Comprador (Exercício 3)
        System.out.println("--- Testando o Comprador (Fluxo de Compra e Saldo) ---");
        // Caio começa com saldo de R$ 20.00
        Comprador comprador = new Comprador("Caio", 20.00);

        // Primeira compra: R$ 8.50 (Nutella) -> Deve dar certo, saldo cai para 11.50
        comprador.efetuarCompra(bNutella);

        // Segunda compra: R$ 7.00 (Doce de Leite) -> Deve dar certo, saldo cai para 4.50
        comprador.efetuarCompra(bDoceDeLeite);

        // Terceira compra: R$ 9.50 (Café) -> Deve falhar por saldo insuficiente (4.50 < 9.50)
        comprador.efetuarCompra(bCafe);
    }
}
