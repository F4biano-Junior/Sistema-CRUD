package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.repository.ListaDePessoas;

import java.util.Scanner;

public class DeletarPessoa {
    public void deletar(ListaDePessoas pessoaDeletar){
        Scanner input = new Scanner(System.in);
        System.out.println("Quem vai deletar? " +
                "Digite o ID");
        int pDeletar = input.nextInt();

        Pessoa delete = pessoaDeletar.deletarPorId(pDeletar);

        System.out.println(delete);

    }
}
