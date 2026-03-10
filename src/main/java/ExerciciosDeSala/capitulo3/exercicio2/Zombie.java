package ExerciciosDeSala.capitulo3.exercicio2;

import java.util.Scanner;

public class Zombie {
    private double health;
    private String name;

    public Zombie(double health, String name) {
        this.health = health;
        this.name = name;
    }

    public Zombie() {}

    public void healZombieFriend(double healthTransferred, Zombie zombieFriend) {
        if (zombieFriend.getHealth() < health) {
            Scanner input = new Scanner(System.in);
            do {
                System.out.print("Esse zumbi vai morrer, deseja prosseguir? [0/1]");
                short response = input.nextShort();
                if (response == 0) {
                    System.out.println("Sacrifício cancelado");
                    return;
                }
                if (response == 1) {
                    this.health = 0;
                    zombieFriend.setHealth(zombieFriend.getHealth() + healthTransferred);
                    System.out.println("O Sacrifício foi feito!");
                    System.out.println("Zumbi" + zombieFriend.getName() + " está com " + zombieFriend.getHealth() + " de vida");
                    System.out.println(this.name + " morreu.");
                    return;
                }
            } while (true);
        }

        this.health = this.health - healthTransferred;
        zombieFriend.setHealth(zombieFriend.getHealth() + healthTransferred);
        System.out.println(this.name + " curou o " + zombieFriend.getName());
        System.out.println("Zumbi"+zombieFriend.getName()+ " está com " + zombieFriend.getHealth() + " de vida");
        System.out.println("Zumbi"+ this.name + " está com " + this.health + " de vida");
    }


    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
