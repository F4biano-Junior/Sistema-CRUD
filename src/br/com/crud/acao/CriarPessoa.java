package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.repository.ListaDePessoas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CriarPessoa {
    /*
     * aqui eu chamo a lista do repository em vez de criar uma nova
     * é uma injeção de dependencia
     * mantem os dados no repository
     */
    public void cadastrar(ListaDePessoas p) {
        boolean criar = false;
        Scanner input = new Scanner(System.in);
        while (!criar) {
            try {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Nome do Pessoa: ");
                String nome = input.nextLine();

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Idade do Pessoa: ");
                int idade = Integer.parseInt(input.nextLine());

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Cidade do Pessoa: ");
                String cidade = input.nextLine();

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                Pessoa pessoaCriada = new Pessoa(nome, idade, cidade);

                p.adicionar(pessoaCriada);

                criar = true;
                System.out.println("Pessoa cadastrada com sucesso!");
            } catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
                input.next();
            } catch (NumberFormatException e) {
                System.out.println("Erro Inesperando: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
