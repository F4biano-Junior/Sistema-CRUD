package br.com.crud.repository;

import br.com.crud.cliente.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaDePessoas {
    private int contadorId = 1;
    private List<Pessoa> pessoaArrayList = new ArrayList<>();

    public List<Pessoa> listar() {
        return new ArrayList<>(pessoaArrayList);
    }

    //Metodo para adicionar as pessoas cadastradas a lista
    public void adicionar(Pessoa pessoa) {
        pessoa.setId(contadorId++);
        pessoaArrayList.add(pessoa);
    }

    @Override
    public String toString() {
        for (Pessoa pessoa : pessoaArrayList) {
            System.out.println(pessoa);
        }
        return "";
    }

    public ListaDePessoas() {
        try {
            adicionar(new Pessoa("Lucy", 18, "Lua"));

        adicionar(new Pessoa("David Martinez", 18, "Night City"));
        adicionar(new Pessoa("Jonny Silverhand", 55, "Night City"));
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }


    public Pessoa buscarPorId(int id){
        for(Pessoa p : pessoaArrayList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }


    public Pessoa deletarPorId(int id){
        for(Pessoa p : pessoaArrayList){
            if (p.getId() == id){
                pessoaArrayList.remove(p);
            }
        }
        return null;
    }
}