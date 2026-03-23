package ExerciciosDeSala.capitulo3.exercicio6;

public class Kart {
    private String name;
    private Engine engine;
    private Driver driver;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Kart(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public Kart(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    public Kart() {
        this.engine = new Engine();
    }
}
