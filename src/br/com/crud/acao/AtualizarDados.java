package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.exception.ValidarNomeException;
import br.com.crud.repository.ListaDePessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AtualizarDados {
    public void atualizarDados(ListaDePessoas atualizarPessoa){

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Atualizando dados de pessoas");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(atualizarPessoa.listar());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Digite o ID de quem vai atualizar os dados:");
        try {
            int inputId = input.nextInt();
            input.nextLine();

            Pessoa atualizarPorId = atualizarPessoa.buscarPorId(inputId);

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Qual dado vai atualizar");
            System.out.println("""
                    1 - Nome
                    2 - Cidade
                    3 - Data De Nascimento
                   """);

            int opcao = input.nextInt();
            input.nextLine();

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            switch (opcao) {
                case 1:
                    System.out.println("Qual será o novo nome?");
                    try {
                    String novoNome = input.nextLine();
                        atualizarPorId.atualizarNome(novoNome);
                        break;
                    }catch (ValidarNomeException vNome){
                        System.out.println(vNome.getMessage());
                    }
                case 2:
                    System.out.println("Qual será a nova cidade?");
                    String novaCidade = input.nextLine();
                    atualizarPorId.atualizarCidade(novaCidade);
                    break;
                case 3:
                    System.out.println("Qual será a nova data de nascimento?");
                    LocalDate novaData = LocalDate.parse(input.next(), formato);
                    atualizarPorId.atualizarDataDeNascimento(novaData);

            }
        }catch (IllegalArgumentException argumentException){
            System.out.println("Por favor, digite uma opção válida!");
        }
    }}

