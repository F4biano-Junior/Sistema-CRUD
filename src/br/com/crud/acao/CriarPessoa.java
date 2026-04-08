package br.com.crud.acao;

import br.com.crud.cliente.Pessoa;
import br.com.crud.exception.ValidarCidadeException;
import br.com.crud.exception.ValidarDataDeNascimento;
import br.com.crud.exception.ValidarNomeException;
import br.com.crud.repository.ListaDePessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class CriarPessoa {
    /*
     * aqui eu chamo a lista do repository em vez de criar uma
     * é uma injeção de dependencia
     * mantem os dados no repository
     */
    public void cadastrar(ListaDePessoas p) {
        Scanner input = new Scanner(System.in);

        String nome = null;
        String cidade = null;
        LocalDate data = null;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            while (nome == null) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
                System.out.println("Nome do Pessoa: ");
                nome = input.nextLine();
            }

            while (data == null) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
                System.out.println("Data de Nascimento: ");


                data = LocalDate.parse(input.next(), formato);

                input.nextLine();

                while (cidade == null) {

                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
                    System.out.println("Cidade do Pessoa: ");
                    cidade = input.nextLine();
                }
                Pessoa pessoaCriada = new Pessoa(nome, data, cidade);
                p.adicionar(pessoaCriada);
                System.out.println("Pessoa cadastrada com sucesso!");

            }
            }catch (ValidarNomeException vNome){
            System.out.println("O Campo nome deve ser preenchido! Erro: " + vNome.getMessage());
        }catch (ValidarDataDeNascimento vData){
            System.out.println("" + vData);
        }catch (DateTimeParseException vData){
            System.out.println("Por favor, digite a data corretamente! " + vData.getMessage());
        }
        catch (ValidarCidadeException vCidade){
            System.out.println("" + vCidade.getMessage());
        }
        }
    }