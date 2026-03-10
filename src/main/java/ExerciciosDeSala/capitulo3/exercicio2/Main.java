package ExerciciosDeSala.capitulo3.exercicio2;

public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie(100, "Fulano");
        Zombie zombie2 = new Zombie(100, "Ciclano");

        zombie1.healZombieFriend(40, zombie2);

        System.out.println(zombie2.getHealth());
        System.out.println(zombie1.getHealth());
    }
}
