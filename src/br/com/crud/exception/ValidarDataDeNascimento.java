package br.com.crud.exception;


public class ValidarDataDeNascimento extends RuntimeException {
    public ValidarDataDeNascimento (String mensagem){
        super(mensagem);
    }
}
