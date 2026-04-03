package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.exception.ValidarDataDeNascimento;
import br.com.crud.repository.ListaDePessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (!criar) {
            try {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Nome do Pessoa: ");
                String nome = input.nextLine();

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Data de Nascimento: ");
                LocalDate data = LocalDate.parse(input.next(), formato);

                input.nextLine();

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                System.out.println("Cidade do Pessoa: ");
                String cidade = input.nextLine();

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");

                Pessoa pessoaCriada = new Pessoa(nome, data, cidade);

                p.adicionar(pessoaCriada);

                criar = true;
                System.out.println("Pessoa cadastrada com sucesso!");
            } catch (ValidarDataDeNascimento e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
