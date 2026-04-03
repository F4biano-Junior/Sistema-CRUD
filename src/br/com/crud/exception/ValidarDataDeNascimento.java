package br.com.crud.exception;

import java.time.LocalDate;

public class ValidarDataDeNascimento extends RuntimeException {
    public ValidarDataDeNascimento (String mensagem){
        super(mensagem);
    }
}
