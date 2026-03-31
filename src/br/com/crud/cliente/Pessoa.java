package br.com.crud.cliente;

public class Pessoa {
    private String nome;
    private  int idade;
    private String cidade;
    private int id;

    public Pessoa( String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + "ID: " + id +
                " nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void atualizarNome (String novoNome) {
        this.nome = novoNome;
    }
    public  void atualizarIdade (int novaIdade){
        this.idade = novaIdade;
    }
    public void atualizarCidade (String novaCidade){
        this.cidade = novaCidade;
    }

}
