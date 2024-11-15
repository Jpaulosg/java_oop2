package projeto.poo.q3;

//Questão 3
//Bolsista é derivado de Aluno ou seja extende a classe Pessoa
//Como Bolsista extende Aluno também possui os atributos de Pessoa
public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade(double valor) {
        System.out.println("Mensalidade do aluno bolsista paga no valor de " + valor);
    }
}
