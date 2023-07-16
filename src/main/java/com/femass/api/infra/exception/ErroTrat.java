package com.femass.api.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ServerErrorException;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class ErroTrat {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity tratarErro400(DataIntegrityViolationException ex){
        var erros = ex.getRootCause();

        return ResponseEntity.badRequest().body(new DadosSQL(erros));
    }

    private record DadosSQL(String mensagem){
        public DadosSQL(Throwable err){
            this(err.getMessage());
        }
    }

}
