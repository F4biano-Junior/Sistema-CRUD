package br.com.crud.menu;

import br.com.crud.acao.AtualizarDados;
import br.com.crud.acao.CriarPessoa;
import br.com.crud.acao.DeletarPessoa;

import br.com.crud.repository.ListaDePessoas;
import br.com.crud.view.ExibirPessoaView;

import java.util.Scanner;

public class MenuService {
    public void menuService() {
        CriarPessoa criarPessoa = new CriarPessoa();
        ListaDePessoas listaDePessoas = new ListaDePessoas();
        AtualizarDados atualizarDados = new AtualizarDados();
        DeletarPessoa deletarPessoa = new DeletarPessoa();
        ExibirPessoaView exibirView = new ExibirPessoaView();
        Scanner teclado = new Scanner(System.in);
        while (true) {
            try {
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

                switch (opcao) {
                    case "1": // C *Create
                        criarPessoa.cadastrar(listaDePessoas);
                        break;
                    case "2": // R *Read
                        exibirView.exibir(listaDePessoas);
                        break;
                    case "3": // U *Update
                        atualizarDados.atualizarDados(listaDePessoas);
                        break;
                    case "4": // Delete
                        deletarPessoa.deletar(listaDePessoas);

                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Por favor, Digite uma opção valida!");
            }
        }
    }
}
