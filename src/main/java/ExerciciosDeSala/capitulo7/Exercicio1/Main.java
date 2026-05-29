package ExerciciosDeSala.capitulo7.Exercicio1;
// Não estou utilizando o package por preguiça! :)

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Ruanzito");
        cliente.setCpf(112334565L);

        conta.setNumero(123);
        conta.setLimite(3000);
        conta.clientes.set(0, cliente);

        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.deposita(100);
        System.out.println("Saldo intermediário: " + conta.getSaldo());
        conta.sacar(55);
        System.out.println("Saldo final: " + conta.getSaldo());

        System.out.println("Nome Cliente: " + conta.clientes.get(0).getNome());
        System.out.println("CPF do Cliente: " + conta.clientes.get(0).getCpf());

        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Limite de crédito: " + conta.getLimite());
    }
}