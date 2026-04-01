package br.com.crud.cliente;

public class Pessoa {
    private String nome;
    private  int idade;
    private String cidade;
    private int id;

    public Pessoa( String nome, int idade, String cidade){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O campo nome deve ser declarado! ");
        } if ( idade < 0 || idade > 120){
            throw new IllegalArgumentException("Digite uma idade válida!");
        }if (cidade == null || cidade.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
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


    public void atualizarNome (String novoNome) {
        this.nome = novoNome;
    }
    public  void atualizarIdade (int novaIdade){
        this.idade = novaIdade;
    }
    public void atualizarCidade (String novaCidade){this.cidade = novaCidade; }

}
