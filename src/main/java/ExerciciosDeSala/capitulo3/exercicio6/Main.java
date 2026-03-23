package ExerciciosDeSala.capitulo3.exercicio6;

public class Main {
    public static void main(String[] args) {
        Kart kart = new Kart();
        Driver driver = new Driver();

        driver.setName("Mario");
        driver.setVillain(false);

        kart.setDriver(driver);
        kart.setMaxSpeed(120.5F);
        kart.setCilindradas("300");

        System.out.println(kart.getDriver().getName());
        System.out.println(kart.getDriver().isVillain());

        System.out.println(kart.getMaxSpeed());
        System.out.println(kart.getCilindradas());
        kart.getEngine().setMaxSpeed(125F);
        System.out.println(kart.getEngine().getMaxSpeed());

    }
}
