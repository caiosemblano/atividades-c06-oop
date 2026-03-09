package ExerciciosDeSala.capitulo3.exercicio1;

public class Zombie {
    private int level;
    private ZombieTypes type;
    private int killScore;
    private boolean isAlive;

    public Zombie(int level, ZombieTypes type, int killScore,  boolean isAlive) {
        this.level = level;
        this.type = type;
        this.killScore = killScore;
    }

    public Zombie() {}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ZombieTypes getType() {
        return type;
    }

    public void setType(ZombieTypes type) {
        this.type = type;
    }

    public int getKillScore() {
        return killScore;
    }

    public void setKillScore(int killScore) {
        this.killScore = killScore;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
