package projeto.poo;

//Questão 3
//Regular é derivado de Aluno ou seja extende a classe Pessoa
//Como Regular extende Aluno também possui os atributos de Pessoa
public class Regular extends Aluno {

    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade(double valor) {
        System.out.println("Mensalidade do aluno regular paga no valor de " + valor);
    }
}
