package br.com.crud.cliente;

import br.com.crud.exception.ValidarDataDeNascimento;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String cidade;
    private LocalDate dataDeNascimento;
    private int id;

    public Pessoa( String nome, LocalDate dataDeNascimento, String cidade){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O campo nome deve ser declarado!");
        }if (cidade == null || cidade.trim().isEmpty()){
            throw new IllegalArgumentException("O campo cidade deve ser declarado!");
        } if (dataDeNascimento.isAfter(LocalDate.now())){
            throw new ValidarDataDeNascimento("Tu é um viajante do tempo? ");
        }
        this.nome = nome;
        this.cidade = cidade;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                " id= " + id +
                " nome= " + nome + '\'' +
                " dataDeNascimento= " + dataDeNascimento +
                " cidade= " + cidade + '\'' +
                "Idade: " + calcularIdade() +
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

    public String getCidade() {
        return cidade;
    }

    public LocalDate getDataDeNascimento() {
        if (dataDeNascimento.isAfter(LocalDate.now())){
            throw new ValidarDataDeNascimento("Tu é um viajante do tempo? ");
        }
        return dataDeNascimento;
    }

    public void atualizarNome (String novoNome) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O campo nome deve ser declarado!");
        }
        this.nome = novoNome;
    }
    public void atualizarCidade (String novaCidade){
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo cidade deve ser declarado!");
        }
        this.cidade = novaCidade;
    }
    public void atualizarDataDeNascimento (LocalDate atualizarData){
        if (dataDeNascimento.isAfter(LocalDate.now())){
            throw new ValidarDataDeNascimento("você não nasceu no futuro!");
        }
        this.dataDeNascimento = atualizarData;
    }
    public int calcularIdade () {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataDeNascimento, dataAtual).getYears();
    }
}