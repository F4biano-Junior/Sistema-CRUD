package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.repository.ListaDePessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AtualizarDados {
    public void atualizarDados(ListaDePessoas atualizarPessoa){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Atualizando dados de pessoas");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(atualizarPessoa);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Digite o ID de quem vai atualizar os dados:");
        int inputId = sc.nextInt();
        sc.nextLine();

        Pessoa atualizarPorId = atualizarPessoa.buscarPorId(inputId);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Qual dado vai atualizar");
        System.out.println("""
                    1 - Nome
                    2 - Cidade
                    3 - Data De Nascimento
                    """);
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        switch (opcao) {
            case 1:
                System.out.println("Qual será o novo nome?");
                String novoNome = sc.nextLine();
                atualizarPorId.atualizarNome(novoNome);
                break;
            case 2:
                System.out.println("Qual será a nova cidade?");
                String novaCidade = sc.nextLine();
                atualizarPorId.atualizarCidade(novaCidade);
                break;
            case 3:
                System.out.println("Qual será a nova data de nascimento?");
                LocalDate novaData = LocalDate.parse(sc.next(), formato);
                atualizarPorId.atualizarDataDeNascimento(novaData);
        }
    }

}
