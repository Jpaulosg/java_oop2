package projeto.poo;

//Questão 1 
public abstract class Pessoa {

    // Atributos cpf,nome,idade
    private String cpf;

    private String nome;

    private int idade;

    // Metodos de acesso aos atributos

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Questão 2 metodo publico para incrementar a idade da pessoa
    public void fazerAniversario() {
        this.idade += 1;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + "]";
    }

}
