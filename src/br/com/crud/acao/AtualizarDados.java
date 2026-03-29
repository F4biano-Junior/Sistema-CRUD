package br.com.crud.acao;

import br.com.crud.lista.ListaDePessoas;

import java.util.Scanner;

public class AtualizarDados {
    public void atualizarDados(ListaDePessoas pessoas){
        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Atualizando dados de pessoas");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(Pessoa pessoa : pessoas.listar()){
            System.out.println(pessoa);
        }


    }

}
