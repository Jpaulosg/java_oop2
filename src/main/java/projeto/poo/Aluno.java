package projeto.poo;

//Questão 3
//Aluno é derivado de Pessoa ou seja extende a classe Pessoa possuindo assim os seus atributos
public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade(double valor) {
        System.out.println("Mensalidade paga no valor de " + valor);
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + super.getNome() + ", matricula=" + matricula + "]";
    }

}
