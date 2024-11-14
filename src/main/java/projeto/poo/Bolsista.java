package projeto.poo;

//Questão 3
//Bolsista é derivado de Aluno ou seja extende a classe Pessoa
//Como Bolsista extende Aluno também possui os atributos de Pessoa
public class Bolsista extends Aluno {

    @Override
    public void pagarMensalidade(double valor) {
        System.out.println("Mensalidade do aluno bolsista paga no valor de " + valor);
    }
}
