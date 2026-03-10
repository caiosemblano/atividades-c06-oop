package ExerciciosDeSala.capitulo3.exercicio5;

public class Player {
    private String nome;
    private int health;
    private Gun gun;

    public void usarArma() {
        System.out.println("Usando arma");
        gun.setResistance(gun.getResistance() - 2);
        System.out.println("Resistência restante: " + gun.getResistance());
    }

    public void tomarDano() {
        System.out.println("Tomando dano");
        this.health = this.health - 5;
        System.out.println("Vida restante: " + this.health);
    }

    public Player() {
    }

    public Player(String nome, int health, Gun gun) {
        this.nome = nome;
        this.health = health;
        this.gun = gun;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }
}
