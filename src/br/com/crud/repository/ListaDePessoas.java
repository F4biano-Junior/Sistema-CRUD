package br.com.crud.lista;

import br.com.crud.cliente.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaDePessoas {
    List<Pessoa> pessoas = new ArrayList<>(
            List.of(
                    new Pessoa("Sara", 35, "Santa Catarina"),
                    new Pessoa("Leon", 45, "São Paulo"),
                    new Pessoa("Jonny Silverhand", 38, "Night City")
            )
    );

    public List<Pessoa> listar(){
        return new ArrayList<>(pessoas);
    }

    //Metodo para adicionar as pessoas cadastradas a lista
    public void adicionar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    

}
