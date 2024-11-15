package projeto.poo.q3;

import projeto.poo.q1.Pessoa;

//Questão 3
//Visitante é derivado de Pessoa ou seja extende a classe Pessoa possuindo assim os seus atributos
public class Visitante extends Pessoa {
    public Visitante(String cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }
}
