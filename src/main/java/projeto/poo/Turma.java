package projeto.poo;

import java.util.ArrayList;

import projeto.poo.q1.Disciplina;
import projeto.poo.q3.Aluno;
import projeto.poo.q3.Professor;

//Questão 04
//Associação e composição de objetos;
public class Turma {
    private int codigo;

    // Como já temos as classes Professor, Aluno e Disciplina podemos usa-los como
    // atributos de
    // nossas outras classes
    private Disciplina disciplina;

    private Professor professor;

    // Nesse caso a questão pede uma lista de alunos
    private ArrayList<Aluno> alunos;

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // A partir daqui são métodos para manipular nossa lista de alunos.
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAluno() {
        System.out.println(this.alunos);
    }

    @Override
    public String toString() {
        return "Turma [codigo=" + codigo +
                ", disciplina=" + disciplina.getNome() +
                ", professor=" + professor.getNome() +
                ", alunos=" + alunos + "]";
    }

}
