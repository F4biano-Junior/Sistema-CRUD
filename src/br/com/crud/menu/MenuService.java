package br.com.crud.menu;

import br.com.crud.acao.AtualizarDados;
import br.com.crud.acao.CriarPessoa;
import br.com.crud.lista.ListaDePessoas;

import java.util.Scanner;

public class MenuService {
    public void menuService() {
        CriarPessoa criarPessoa = new CriarPessoa();
        ListaDePessoas listaDePessoas = new ListaDePessoas();
        AtualizarDados atualizarDados = new AtualizarDados();

        Scanner teclado = new Scanner(System.in);
        while (true) {
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
                    criarPessoa.cadastrar();
                    break;
                case "2": // R *Read
                    // criar uma copia da lista do repositorio
                    List<Pessoa> pessoas = listaDePessoas.listar();
                    // lê essa copia
                    for (Pessoa pessoa : pessoas){
                        System.out.println(pessoa);
                    }
                    break;
                case "3": // U *Update
                    atualizarDados.atualizarDados();
                    break;
            }

        }while (true);
    }
}
