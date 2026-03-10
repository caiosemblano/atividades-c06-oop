package ExerciciosDeSala.capitulo3.exercicio5;

public class Main {
    public static void main(String[] args) {
        Player player =  new Player();
        Gun gun = new Gun();

        player.setNome("Caio");
        player.setHealth(100);
        player.setGun(gun);
        System.out.println(player.getGun());


        


    }
}
