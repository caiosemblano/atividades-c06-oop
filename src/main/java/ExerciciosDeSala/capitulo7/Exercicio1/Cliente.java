package ExerciciosDeSala.capitulo7.Exercicio1;

public class Cliente {
    private String nome;
    private Long cpf; //cpf deveria ser String, mas vou seguir o UML

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
