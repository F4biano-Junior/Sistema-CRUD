package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.lista.ListaDePessoas;
import br.com.crud.menu.MenuService;

import java.util.Scanner;

public class CriarPessoa {
   /*
    * aqui eu chamo a lista do repository em vez de criar uma nova
    * é uma injeção de dependencia
    * mantem os dados no repository
    */
    public void cadastrar(ListaDePessoas p) {
        Scanner input = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        System.out.println("Nome do Pessoa: ");
        String nome = input.nextLine();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        System.out.println("Idade do Pessoa: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        System.out.println("Cidade do Pessoa: ");
        String cidade = input.nextLine();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

        Pessoa pessoaCriada = new Pessoa(nome, idade, cidade);

        p.adicionar(pessoaCriada);

        System.out.println("Pessoa cadastrada com sucesso!");

    }
}
