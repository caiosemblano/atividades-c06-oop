package ExerciciosDeSala.capitulo3.exercicio3;

public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie(100, "Fulano");
        Zombie zombie2 = new Zombie(100, "Ciclano");

        zombie1.setHealth(20);
        zombie2.setHealth(80);
        System.out.println(zombie1.getHealth());
        System.out.println(zombie2.getHealth());

        zombie2.health = zombie1.health; // referenciando à vida do zumbi 1
        zombie1.setHealth(200);
        System.out.println(zombie1.getHealth());
        System.out.println(zombie2.getHealth());

    }
}
