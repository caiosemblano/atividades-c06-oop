package ExerciciosDeSala.capitulo7.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    public List<Cliente> clientes = new ArrayList<>();


    public void sacar(float quantia) {
        if(this.saldo >= quantia) {
            this.saldo -= quantia;
            System.out.println("Saque efetuado com sucesso!");
            return;
        }
        System.out.println("Saldo insuficiente!");
    }

    public void deposita(float quantia) {
        this.saldo += quantia;
        System.out.println("Depósito efetuado com sucesso!");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return this.saldo;
    }
}
