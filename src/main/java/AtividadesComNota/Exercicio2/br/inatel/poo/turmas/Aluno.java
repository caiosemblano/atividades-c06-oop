package AtividadesComNota.Exercicio2.br.inatel.poo.turmas;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double [] notas = new double[]{};


    public Aluno(String nome, String matricula, double ... notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Notas: " + Arrays.toString(notas));
    }
}
