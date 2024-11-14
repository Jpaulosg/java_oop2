package projeto.poo;

import java.util.ArrayList;

//Questão 04
//Associação e composição de objetos;
public class Turma {
    private int codigo;

    private String disciplina;

    //Como já temos as classes Professor e aluno podemos usa-los como atributos de nossas outras classes
    private Professor professor;

    //Nesse caso a questão pede uma lista de alunos
    private ArrayList<Aluno> alunos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    //A partir daqui são métodos para manipular nossa lista de alunos.
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAluno() {
        System.out.println(this.alunos);
    }

}
