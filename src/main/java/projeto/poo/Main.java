package projeto.poo;

public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina(1, "Matematica", 1);
        Disciplina poo = new Disciplina(2, "Programação orientada a objetos", 2);
        Disciplina algoritmo = new Disciplina(3, "Algoritmos", 2);

        Aluno alunoRegular1 = new Regular("000-000-000.00", "Aluno regular 01", 25, "000");
        Aluno alunoRegular2 = new Regular("000-000-000.01", "Aluno regular 02", 22, "001");
        Aluno alunoBolsista = new Bolsista("000-000-000.02", "Aluno bolsista", 30, "002");

        Professor professor = new Professor("000-111-000.00", "Professor", 40, "Centro");

        Visitante visitante1 = new Visitante("000-222-000.00", "Visitante 01", 35);
        Visitante visitante2 = new Visitante("000-333-000.00", "Visitante 02", 31);

        Turma turmaDeMatematica = new Turma(1, matematica, professor);
        turmaDeMatematica.adicionarAluno(alunoRegular1);
        turmaDeMatematica.adicionarAluno(alunoRegular2);
        turmaDeMatematica.adicionarAluno(alunoBolsista);

        Turma turmaDePoo = new Turma(2, poo, professor);
        turmaDePoo.adicionarAluno(alunoRegular1);
        turmaDePoo.adicionarAluno(alunoRegular2);
        turmaDePoo.adicionarAluno(alunoBolsista);

        Turma turmaDeAlgoritmo = new Turma(3, algoritmo, professor);
        turmaDeAlgoritmo.adicionarAluno(alunoRegular1);
        turmaDeAlgoritmo.adicionarAluno(alunoRegular2);
        turmaDeAlgoritmo.adicionarAluno(alunoBolsista);

        System.out.println(turmaDeMatematica + "\n");
        System.out.println(turmaDePoo + "\n");
        System.out.println(turmaDeAlgoritmo + "\n");
    }
}