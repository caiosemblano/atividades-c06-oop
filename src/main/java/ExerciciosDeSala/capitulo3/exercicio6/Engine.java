package ExerciciosDeSala.capitulo3.exercicio6;

public class Engine{
    private String cilindradas;
    private float maxSpeed;

    public void mostrarInfo() {
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Max Speed: " + maxSpeed);
    }

    public Engine(String cilindradas, float maxSpeed) {
        this.cilindradas = cilindradas;
        this.maxSpeed = maxSpeed;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
