package br.com.crud.cliente;

import br.com.crud.exception.ValidarCidadeException;
import br.com.crud.exception.ValidarDataDeNascimento;
import br.com.crud.exception.ValidarNomeException;

import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
    private String nome;
    private String cidade;
    private LocalDate dataDeNascimento;
    private int id;

    public Pessoa(String nome, LocalDate dataDeNascimento, String cidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidarNomeException("O campo nome deve ser declarado!");
        }
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new ValidarCidadeException("O campo cidade deve ser declarado!");
        }if (dataDeNascimento.isBefore(LocalDate.of(1976, 12, 31)) ||
                dataDeNascimento.isAfter(LocalDate.of(2007,12,31))) {
            throw new ValidarDataDeNascimento("Coloque uma data de nascimento em um periodo válido");
        }
        this.nome = nome;
        this.cidade = cidade;
        this.dataDeNascimento = dataDeNascimento;
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

    public void atualizarNome(String novoNome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidarNomeException("O campo nome deve ser declarado!");
        }
        this.nome = novoNome;
    }

    public void atualizarCidade(String novaCidade) {
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new ValidarCidadeException("O campo cidade deve ser declarado!");
        }
        this.cidade = novaCidade;
    }

    public void atualizarDataDeNascimento(LocalDate atualizarData) {
        if (dataDeNascimento.isAfter(LocalDate.now())) {
            throw new ValidarDataDeNascimento("Coloque uma data de nascimento no formato válido dd/MM/yyyy");
        }
        this.dataDeNascimento = atualizarData;
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataDeNascimento, dataAtual).getYears();
    }

}