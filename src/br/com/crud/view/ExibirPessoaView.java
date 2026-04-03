package br.com.crud.view;

import br.com.crud.cliente.Pessoa;
import br.com.crud.repository.ListaDePessoas;

public class ExibirPessoaView {

    public void exibir(ListaDePessoas listaDePessoas){

        for (Pessoa p : listaDePessoas.listar()) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.calcularIdade());
            System.out.println("Cidade: " + p.getCidade());

        }

    }
}
