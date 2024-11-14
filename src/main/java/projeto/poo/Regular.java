package projeto.poo;

//Questão 3
//Regular é derivado de Aluno ou seja extende a classe Pessoa
//Como Regular extende Aluno também possui os atributos de Pessoa
public class Regular extends Aluno {
    @Override
    public void pagarMensalidade(double valor) {
        System.out.println("Mensalidade do aluno regular paga no valor de " + valor);
    }
}
