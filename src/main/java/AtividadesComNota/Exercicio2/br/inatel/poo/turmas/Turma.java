package AtividadesComNota.Exercicio2.br.inatel.poo.turmas;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int quantidadeAlunos;
    private List<Aluno> alunos =  new ArrayList<Aluno>();

    public void AdicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
        quantidadeAlunos =  alunos.size();
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        double melhorMedia = 0;
        Aluno melhorAluno = null;
        for (Aluno aluno : alunos) {
            if(aluno.calcularMedia() >  melhorMedia) {
                melhorMedia = aluno.calcularMedia();
                melhorAluno = aluno;
            }
        }

        return melhorAluno;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
}
