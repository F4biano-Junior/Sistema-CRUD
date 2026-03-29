package br.com.crud.acao;

import br.com.crud.lista.ListaDePessoas;

import java.util.ArrayList;
import java.util.List;

public class AtualizarDados {
    public void atualizarDados(){
        List<ListaDePessoas> listaDePessoas = new ArrayList<>();
        System.out.println(listaDePessoas);

        for(ListaDePessoas p : listaDePessoas){
            System.out.println(p);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Atualizando dados de pessoas");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(Pessoa pessoa : pessoas.listar()){
            System.out.println(pessoa);
        }


    }

}
