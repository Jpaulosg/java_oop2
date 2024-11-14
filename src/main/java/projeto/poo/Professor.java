package projeto.poo;

//Questão 3
//Professor assim como Aluno é derivado de Pessoa ou seja extende Pessoa possuindo assim os seus atributos
public class Professor extends Pessoa {

    private String centro;

    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("Professor começou a dar aula");
    }
}
