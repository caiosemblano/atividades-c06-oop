package ExerciciosDeSala.capitulo4.Exercicio0;

public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina("Cantina Inatel");
        Salgado salgado1 = new Salgado("Coxinha");

        cantina.addSalgado(salgado1);

        Salgado salgado2 = new Salgado("Bolinha de Queijo");
        cantina.addSalgado(salgado2);

        Salgado salgado3 = new Salgado("Pastel");
        cantina.addSalgado(salgado3);

        cantina.mostrarInfo();
    }
}
