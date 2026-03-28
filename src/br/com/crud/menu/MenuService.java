package br.com.crud.menu;

import br.com.crud.acao.CriarPessoa;
import br.com.crud.lista.ListaDePessoas;

import java.util.Scanner;

public class MenuService {
    public void menuService() {
        CriarPessoa criarPessoa = new CriarPessoa();
        ListaDePessoas listaDePessoas = new ListaDePessoas();

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                """
                1 - C Criar Pessoa
                2 - R Listar Pessoas
                3 - U Atualizar dados
                4 - D Deletar Pessoa
                """
        );

        System.out.println("Qual ação tomar");
        String opcao = teclado.next();
        do {
            switch (opcao) {
                case "1": // C *Create
                    criarPessoa.cadastrar();
                    break;
                case "2": // R *Read
                    listaDePessoas.exibirPessoas();
                    break;
                case "3": // U *Update
                    atualizarDados.atualizarDados();
                    break;
            }

        }while (true);
    }
}
