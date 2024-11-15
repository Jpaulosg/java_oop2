package projeto.poo.testes;

import java.util.ArrayList;

import projeto.poo.q3.Aluno;
import projeto.poo.q3.Bolsista;
import projeto.poo.q3.Regular;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(null, null, 0, null);
        Aluno aluno2 = new Bolsista(null, null, 0, null);
        Aluno aluno3 = new Regular(null, null, 0, null);

        ArrayList<Aluno> list = new ArrayList<>();
        list.add(aluno);
        list.add(aluno2);
    }

    private static void mensalidade(Aluno aluno) {
        aluno.pagarMensalidade(100);
    }
}
