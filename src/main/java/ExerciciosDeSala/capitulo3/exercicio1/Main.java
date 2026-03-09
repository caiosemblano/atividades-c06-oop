package ExerciciosDeSala.capitulo3.exercicio1;

public class Main { // Ainda dei uma enfeitada com Enum para o tipo de zumbi
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie();
        Zombie zombie2 = new Zombie(20, ZombieTypes.ALPHA, 0, true);

        System.out.println(zombie1.getType());
        System.out.println(zombie2.getType());
    }
}
