package AtividadesComNota.Exercicio2.br.inatel.poo;

import AtividadesComNota.Exercicio2.br.inatel.poo.turmas.Aluno;
import AtividadesComNota.Exercicio2.br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Caio", "621", 98, 100, 95, 100);
        Aluno aluno1 = new Aluno("Fulano", "67", 99, 98, 65, 70);
        Turma pooComJava = new Turma();

        pooComJava.AdicionarAluno(aluno);
        pooComJava.AdicionarAluno(aluno1);
        System.out.println(pooComJava.getQuantidadeAlunos() + "\n");

        pooComJava.listarAlunos();
        System.out.println();
        System.out.println();

        System.out.println("Mostrando a info do melhor aluno:");
        pooComJava.buscarMelhorAluno().mostraInfo();
        System.out.println(aluno.calcularMedia() + "\n");

        aluno1.mostraInfo();

    }
}
