package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.lista.ListaDePessoas;
import br.com.crud.menu.MenuService;

import java.util.Scanner;

public class CriarPessoa {
    public void cadastrar() {
        Scanner input = new Scanner(System.in);
        ListaDePessoas listaDePessoas = new ListaDePessoas();

        System.out.println("Nome do Pessoa: ");
        String nome = input.nextLine();
        System.out.println("Idade do Pessoa: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Cidade do Pessoa: ");
        String cidade = input.nextLine();


        Pessoa pessoaCriada = new Pessoa(nome, idade, cidade);

        listaDePessoas.listar(pessoaCriada);


        MenuService menu = new MenuService();
        menu.menuService();

        input.close();
    }
}
