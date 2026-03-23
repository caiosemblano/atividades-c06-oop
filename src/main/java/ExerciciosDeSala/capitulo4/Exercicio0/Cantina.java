package ExerciciosDeSala.capitulo4.Exercicio0;

import java.util.ArrayList;
import java.util.List;

// !! Código feito com array primitivo e complexo

public class Cantina {
    private String nome;
//    private Salgado [] salgado =  new Salgado[10];
    private List<Salgado> salgado =  new ArrayList<>();
    private int i = 0;

//    public void mostrarInfo () {
//        System.out.println("Nome: " + this.nome + "\n");
//
//        for(int j = 0; j < i; j++){
//            System.out.println(salgado[j].getNome());
//        }
//    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + "\n");

        for (Salgado salgado : salgado){
            System.out.println(salgado.getNome());
        }
    }

    public Cantina() {}

    public Cantina(String nome) {
        this.nome = nome;
    }

    public void addSalgado (Salgado salgado) {
//        this.salgado[i] = salgado;
        this.salgado.add(salgado);
        this.i++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Salgado> getSalgado() {
        return salgado;
    }


}
