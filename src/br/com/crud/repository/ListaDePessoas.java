package br.com.crud.repository;

import br.com.crud.cliente.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaDePessoas {
    private int contadorId = 1;
    private List<Pessoa> pessoas = new ArrayList<>();

    public PessoaRepository() {
        adicionar(new Pessoa("Sara", 35, "Santa Catarina"));
        adicionar(new Pessoa("Leon", 45, "São Paulo"));
        adicionar(new Pessoa("Jonny Silverhand", 38, "Night City"));
    }

    public List<Pessoa> listar(){
        return new ArrayList<>(pessoas);
    }

    //Metodo para adicionar as pessoas cadastradas a lista
    public void adicionar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public String toString() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        return "";
    }


}
