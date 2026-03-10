package ExerciciosDeSala.capitulo3.exercicio5;

public class Gun {
    private String nome;
    private int power;
    private int resistance;
    private String description;

    public void MostrarInfoArma() {
        System.out.println(nome);
        System.out.println(power);
        System.out.println(resistance);
        System.out.println(description);
    }

    public Gun(String nome, int power, int resistance) {
        this.nome = nome;
        this.power = power;
        this.resistance = resistance;
    }

    public Gun() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
